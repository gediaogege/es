package com.example.es.kafka.consumer;

import cn.hutool.json.JSONUtil;
import com.example.es.book.service.ReadBookPdService;
import com.example.es.canal.BookCanal;
import com.example.es.canal.CanalDataType;
import com.example.es.search.EsBook;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author qinmintao
 * @description:
 * @date 2020-03-12 10:55
 */
@Component
@Slf4j
public class ConsumerService {
    @Autowired
    private ReadBookPdService bookPdService;

    @KafkaListener(id = "test-consumer-A", topics = {"book"}, groupId = "test-consumer-1", containerFactory = "kafkaListenerContainerFactory")
    public void listen(ConsumerRecord<String, String> cr) throws Exception {
        log.info("消费：{}", cr.value());
        BookCanal bookCanal = JSONUtil.toBean(cr.value(), BookCanal.class);
        //不处理DDL操作
        if (!bookCanal.isIsDdl()) {
            try {
                List<BookCanal.DataBean> data = bookCanal.getData();
                if (CollectionUtils.isNotEmpty(data)) {

                    if (bookCanal.getType().equals(CanalDataType.DELETE)) {
                        for (BookCanal.DataBean datum : data) {
                            bookPdService.deleteEs(Integer.valueOf(datum.getId()));
                        }
                    } else {
                        bookPdService.saveOrUpdateEs(data);
                    }
                    log.info("同步完成");
                }
            } catch (Exception e) {
                e.printStackTrace();
                log.error("同步数据出错:{}", e.getMessage());
            }
        }

    }

}

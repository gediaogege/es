package com.example.es.book;

import cn.hutool.json.JSONUtil;
import com.example.es.book.service.ReadBookPdService;
import com.example.es.search.EsBook;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author qinmintao
 * @description:
 * @date 2020-04-14 16:56
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class BookTest {
    @Autowired
    private ReadBookPdService readBookPdService;

    @Test
    public void save() {
        readBookPdService.saveToEs();
    }

    @Test
    public void findByBookName() {
        List<EsBook> byBookName = readBookPdService.findByBookName("民族");
        log.info("result:{}", JSONUtil.parse(byBookName).toString());
    }

    @Test
    public void findByBookNameAndAuthor() {
    }

    @Test
    public void query() {
        List<EsBook> query = readBookPdService.query("民族", 123);
        log.info("result:{}", JSONUtil.parse(query).toString());
    }
}

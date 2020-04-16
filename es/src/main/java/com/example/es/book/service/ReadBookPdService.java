package com.example.es.book.service;

import com.example.es.book.entity.ReadBookPd;
import com.baomidou.mybatisplus.service.IService;
import com.example.es.canal.BookCanal;
import com.example.es.search.EsBook;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qmt
 * @since 2020-04-14
 */
public interface ReadBookPdService extends IService<ReadBookPd> {

    void saveToEs();

    List<EsBook> findByBookName(String bookName);

    List<EsBook> findByBookNameAndAuthor(String bookName, String author);

    List<EsBook> query(String bookName, Integer price);

    /**
     * 同步删除ES中的数据
     * @param id
     * @return
     */
    boolean deleteEs(Integer id);

    /**
     * 同步更新或插入数据到ES中
     * @param data
     */
    void saveOrUpdateEs(List<BookCanal.DataBean> data);

}

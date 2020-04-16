package com.example.es.book.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.es.book.entity.ReadBookPd;
import com.example.es.book.mapper.ReadBookPdMapper;
import com.example.es.book.service.ReadBookPdService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.es.canal.BookCanal;
import com.example.es.search.EsBook;
import com.example.es.search.repository.EsBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author qmt
 * @since 2020-04-14
 */
@Service
@Slf4j
public class ReadBookPdServiceImpl extends ServiceImpl<ReadBookPdMapper, ReadBookPd> implements ReadBookPdService {
    @Autowired
    private EsBookRepository repository;

    @Override
    public void saveToEs() {
        List<ReadBookPd> readBookPds = this.baseMapper.selectList(new EntityWrapper<>());
        List<EsBook> esBooks = handelDataList(readBookPds);
        try {
            repository.saveAll(esBooks);
            log.info("添加数据到ES成功");
        } catch (Exception e) {
            log.info("添加数据到ES失败：{}", e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public List<EsBook> findByBookName(String bookName) {
        return repository.findByBookName(bookName);
    }

    @Override
    public List<EsBook> findByBookNameAndAuthor(String bookName, String author) {
        return repository.findByBookNameAndAuthor(bookName, author);
    }

    @Override
    public List<EsBook> query(String bookName, Integer price) {
        return repository.queryAno(bookName, price);
    }

    @Override
    public boolean deleteEs(Integer id) {
        EsBook esBook = new EsBook();
        esBook.setId(id);
        try {
            repository.delete(esBook);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("es删除数据失败，bookId:{}", esBook.getBookId());
        }
        return false;
    }

    @Override
    public void saveOrUpdateEs(List<BookCanal.DataBean> data) {
        List<EsBook> esBooks = handelDataListCanal(data);
        repository.saveAll(esBooks);
    }

    public List<EsBook> handelDataListCanal(List<BookCanal.DataBean> list) {
        List<EsBook> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)) {
            EsBook book;
            for (BookCanal.DataBean readBookPd : list) {
                book = handelDataCanal(readBookPd);
                result.add(book);
            }
        }
        return result;

    }

    public List<EsBook> handelDataList(List<ReadBookPd> list) {
        List<EsBook> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)) {
            EsBook book;
            for (ReadBookPd readBookPd : list) {
                book = handelData(readBookPd);
                result.add(book);
            }
        }
        return result;

    }

    public EsBook handelData(ReadBookPd readBookPd) {

        EsBook book = null;
        if (readBookPd != null) {
            book = getEsBook(readBookPd);
        }
        return book;

    }

    public EsBook handelDataCanal(BookCanal.DataBean readBookPd) {

        EsBook book = null;
        if (readBookPd != null) {
            book = getEsBookCanal(readBookPd);
        }
        return book;

    }

    private EsBook getEsBookCanal(BookCanal.DataBean readBookPd) {
        EsBook book = new EsBook();
        book.setAuthor(readBookPd.getAuthor());
        book.setBookEnName(readBookPd.getEn_name());
        book.setBookId(Integer.valueOf(readBookPd.getId()));
        book.setBookName(readBookPd.getName());
        book.setCommentNum(readBookPd.getComment_num() == null ? 0 : Integer.valueOf(readBookPd.getComment_num()));
        book.setCreateTime(readBookPd.getCreate_time() == null ? DateUtil.formatDateTime(new Date()) : readBookPd.getCreate_time());
        book.setImgurl(readBookPd.getImgurl());
        book.setPrice(readBookPd.getPrice() == null ? 0 : Integer.valueOf(readBookPd.getPrice()));
        book.setStatus(readBookPd.getStatus() == null ? 0 : Integer.valueOf(readBookPd.getStatus()));
        book.setId(Integer.valueOf(readBookPd.getId()));
        book.setDiscription(readBookPd.getDiscription());
        return book;
    }

    private EsBook getEsBook(ReadBookPd readBookPd) {
        EsBook book = new EsBook();
        book.setAuthor(readBookPd.getAuthor());
        book.setBookEnName(readBookPd.getEnName());
        book.setBookId(readBookPd.getId());
        book.setBookName(readBookPd.getName());
        book.setCommentNum(readBookPd.getCommentNum());
        book.setCreateTime(readBookPd.getCreateTime() == null ? DateUtil.formatDateTime(new Date()) : DateUtil.formatDateTime(readBookPd.getCreateTime()));
        book.setImgurl(readBookPd.getImgurl());
        book.setPrice(readBookPd.getPrice());
        book.setStatus(readBookPd.getStatus());
        book.setId(readBookPd.getId());
        book.setDiscription(readBookPd.getDiscription());
        return book;
    }
}

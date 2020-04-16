package com.example.es.search.repository;


import com.example.es.search.EsBook;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * spring data 的方式操作es
 * 官方文档：https://docs.spring.io/spring-data/elasticsearch/docs/3.2.6.RELEASE/reference/html/#repositories.query-methods
 */
public interface EsBookRepository extends ElasticsearchRepository<EsBook, String> {
    List<EsBook> findByBookName(String bookName);

    List<EsBook> findByBookNameAndAuthor(String bookName, String author);

    /**
     * 使用@Query和DSL进行查询
     * @return
     */
    @Query("{ \"bool\" : { \"must\" : [ { \"query_string\" : { \"query\" : \"?0\", \"fields\" : [ \"bookName\" ] } }, { \"query_string\" : { \"query\" : \"?1\", \"fields\" : [ \"price\" ] } } ] } }")
    List<EsBook> queryAno(String bookName,Integer price);

}

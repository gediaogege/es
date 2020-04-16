package com.example.es.search;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qinmintao
 * @description:
 * @date 2020-04-14 16:32
 * 使用注解的方式直接创建索引
 */
@Data
@Document(indexName = "book", type = "_doc", shards = 1, replicas = 1)
public class EsBook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Field(type = FieldType.Integer)
    private Integer id;

    @Field(analyzer = "ik_max_word", searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String bookName;

    @Field(type = FieldType.Integer)
    private Integer bookId;

    @Field(analyzer = "english", type = FieldType.Text)
    private String bookEnName;

    @Field(type = FieldType.Integer)
    private Integer commentNum;

    @Field(type = FieldType.Integer)
    private Integer price;

    @Field(type = FieldType.Keyword)
    private String author;

    @Field(type = FieldType.Text)
    private String imgurl;

    @Field(type = FieldType.Text)
    private String createTime;

    @Field(type = FieldType.Integer)
    private Integer status;

    @Field(analyzer = "ik_max_word", searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String discription;
}

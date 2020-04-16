package com.example.es.book.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author qmt
 * @since 2020-04-14
 */
@Data
@Accessors(chain = true)
@TableName("read_book_pd")
public class ReadBookPd extends Model<ReadBookPd> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField("en_name")
    private String enName;

    private String author;

    private String imgurl;

    private String discription;

    @TableField("create_time")
    private Date createTime;

    private Integer creator;

    @TableField("update_time")
    private Date updateTime;

    /**
     * 1正常，-1删除，0下架
     */
    private Integer status;

    /**
     * 评论数
     */
    @TableField("comment_num")
    private Integer commentNum;

    /**
     * 价格，分
     */
    private Integer price;

    private String category;


    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String EN_NAME = "en_name";

    public static final String AUTHOR = "author";

    public static final String IMGURL = "imgurl";

    public static final String DISCRIPTION = "discription";

    public static final String CREATE_TIME = "create_time";

    public static final String CREATOR = "creator";

    public static final String UPDATE_TIME = "update_time";

    public static final String STATUS = "status";

    public static final String COMMENT_NUM = "comment_num";

    public static final String PRICE = "price";

    public static final String CATEGORY = "category";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

package com.example.es.canal;

import java.util.List;

/**
 * @author qinmintao
 * @description:
 * @date 2020-04-16 11:19
 */
public class BookCanal {

    /**
     * data : [{"id":"4","name":"报童的夏天2","en_name":"Newsboy's summer\n\n","author":"[美] 文斯·沃特","imgurl":"http://images.pdreading.com/bookscover/9787221128218_1548742322954.jpg?x-oss-process=style/bookS3B","discription":"十一岁的\u201c小男人\u201d能投全镇最快最猛的球，但他一开口说话却很困难，连自己的名字都说不好。当他整个七月必须替好朋友送报时，和常喝醉酒的女人、有点神秘的爱看书的商船船员、总不说话的电视男孩等形形色色的陌生人说话打交道，就成了巨大的挑战。他还得面对一位拾荒男人。这个强壮的男人不仅偷了他的东西，还让他和他*好的朋友陷入了生命的危险境地\u2026\u2026","create_time":"2019-11-14 16:59:59","creator":"1","update_time":"2019-11-14 16:59:59","status":"1","comment_num":"910","price":"237","category":"寓言"}]
     * database : es_data
     * es : 1587006968000
     * id : 7
     * isDdl : false
     * mysqlType : {"id":"int(11)","name":"varchar(100)","en_name":"varchar(255)","author":"varchar(50)","imgurl":"varchar(255)","discription":"text","create_time":"datetime","creator":"int(11)","update_time":"datetime","status":"int(4)","comment_num":"int(11)","price":"int(11)","category":"varchar(20)"}
     * old : [{"name":"报童的夏天"}]
     * pkNames : ["id"]
     * sql :
     * sqlType : {"id":4,"name":12,"en_name":12,"author":12,"imgurl":12,"discription":2005,"create_time":93,"creator":4,"update_time":93,"status":4,"comment_num":4,"price":4,"category":12}
     * table : read_book_pd
     * ts : 1587006968369
     * type : UPDATE
     */

    private String database;
    private long es;
    private int id;
    private boolean isDdl;
    private MysqlTypeBean mysqlType;
    private String sql;
    private SqlTypeBean sqlType;
    private String table;
    private long ts;
    private String type;
    private List<DataBean> data;
    private List<OldBean> old;
    private List<String> pkNames;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public long getEs() {
        return es;
    }

    public void setEs(long es) {
        this.es = es;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsDdl() {
        return isDdl;
    }

    public void setIsDdl(boolean isDdl) {
        this.isDdl = isDdl;
    }

    public MysqlTypeBean getMysqlType() {
        return mysqlType;
    }

    public void setMysqlType(MysqlTypeBean mysqlType) {
        this.mysqlType = mysqlType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlTypeBean getSqlType() {
        return sqlType;
    }

    public void setSqlType(SqlTypeBean sqlType) {
        this.sqlType = sqlType;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<OldBean> getOld() {
        return old;
    }

    public void setOld(List<OldBean> old) {
        this.old = old;
    }

    public List<String> getPkNames() {
        return pkNames;
    }

    public void setPkNames(List<String> pkNames) {
        this.pkNames = pkNames;
    }

    public static class MysqlTypeBean {
        /**
         * id : int(11)
         * name : varchar(100)
         * en_name : varchar(255)
         * author : varchar(50)
         * imgurl : varchar(255)
         * discription : text
         * create_time : datetime
         * creator : int(11)
         * update_time : datetime
         * status : int(4)
         * comment_num : int(11)
         * price : int(11)
         * category : varchar(20)
         */

        private String id;
        private String name;
        private String en_name;
        private String author;
        private String imgurl;
        private String discription;
        private String create_time;
        private String creator;
        private String update_time;
        private String status;
        private String comment_num;
        private String price;
        private String category;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEn_name() {
            return en_name;
        }

        public void setEn_name(String en_name) {
            this.en_name = en_name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getDiscription() {
            return discription;
        }

        public void setDiscription(String discription) {
            this.discription = discription;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getComment_num() {
            return comment_num;
        }

        public void setComment_num(String comment_num) {
            this.comment_num = comment_num;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

    public static class SqlTypeBean {
        /**
         * id : 4
         * name : 12
         * en_name : 12
         * author : 12
         * imgurl : 12
         * discription : 2005
         * create_time : 93
         * creator : 4
         * update_time : 93
         * status : 4
         * comment_num : 4
         * price : 4
         * category : 12
         */

        private int id;
        private int name;
        private int en_name;
        private int author;
        private int imgurl;
        private int discription;
        private int create_time;
        private int creator;
        private int update_time;
        private int status;
        private int comment_num;
        private int price;
        private int category;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }

        public int getEn_name() {
            return en_name;
        }

        public void setEn_name(int en_name) {
            this.en_name = en_name;
        }

        public int getAuthor() {
            return author;
        }

        public void setAuthor(int author) {
            this.author = author;
        }

        public int getImgurl() {
            return imgurl;
        }

        public void setImgurl(int imgurl) {
            this.imgurl = imgurl;
        }

        public int getDiscription() {
            return discription;
        }

        public void setDiscription(int discription) {
            this.discription = discription;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public int getCreator() {
            return creator;
        }

        public void setCreator(int creator) {
            this.creator = creator;
        }

        public int getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(int update_time) {
            this.update_time = update_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getComment_num() {
            return comment_num;
        }

        public void setComment_num(int comment_num) {
            this.comment_num = comment_num;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }
    }

    public static class DataBean {
        /**
         * id : 4
         * name : 报童的夏天2
         * en_name : Newsboy's summer
         * author : [美] 文斯·沃特
         * imgurl : http://images.pdreading.com/bookscover/9787221128218_1548742322954.jpg?x-oss-process=style/bookS3B
         * discription : 十一岁的“小男人”能投全镇最快最猛的球，但他一开口说话却很困难，连自己的名字都说不好。当他整个七月必须替好朋友送报时，和常喝醉酒的女人、有点神秘的爱看书的商船船员、总不说话的电视男孩等形形色色的陌生人说话打交道，就成了巨大的挑战。他还得面对一位拾荒男人。这个强壮的男人不仅偷了他的东西，还让他和他*好的朋友陷入了生命的危险境地……
         * create_time : 2019-11-14 16:59:59
         * creator : 1
         * update_time : 2019-11-14 16:59:59
         * status : 1
         * comment_num : 910
         * price : 237
         * category : 寓言
         */

        private String id;
        private String name;
        private String en_name;
        private String author;
        private String imgurl;
        private String discription;
        private String create_time;
        private String creator;
        private String update_time;
        private String status;
        private String comment_num;
        private String price;
        private String category;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEn_name() {
            return en_name;
        }

        public void setEn_name(String en_name) {
            this.en_name = en_name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getDiscription() {
            return discription;
        }

        public void setDiscription(String discription) {
            this.discription = discription;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getComment_num() {
            return comment_num;
        }

        public void setComment_num(String comment_num) {
            this.comment_num = comment_num;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }

    public static class OldBean {
        /**
         * name : 报童的夏天
         */

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

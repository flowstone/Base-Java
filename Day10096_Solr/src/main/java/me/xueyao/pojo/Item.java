package me.xueyao.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/**
 * @author XueYao
 * @date 2017-12-04
 */
public class Item implements Serializable {
    @Field("id")
    private String id;
    @Field("title")
    private String title;
    @Field("price")
    private Long price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.zs.dubbo.model.vo;

import java.io.Serializable;

/**
 * @Company
 * @Author Zs
 * @Date Create in 2019/9/7
 **/
public class BookVo implements Serializable {
    private Integer id;

    private String title;

    private Double price;

    private Integer cateid;
    private String cateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
}

package com.app.mytix.domain;

import javax.persistence.*;

@Entity
public class ticketInfo {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String date;
    private Double price;

    // Create EventId Here

    //region CONSTRUCTORS
    public ticketInfo() {}
    //endregion

    //region GETTERS / SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    //endregion

}

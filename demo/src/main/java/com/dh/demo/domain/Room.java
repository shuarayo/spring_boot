package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Silver on 10/6/2017.
 */
@Document
public class Room {
    @Id
    private String id;
    private String code;
    private int capacity;

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

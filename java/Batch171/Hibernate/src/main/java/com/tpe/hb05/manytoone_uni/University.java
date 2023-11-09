package com.tpe.hb05.manytoone_uni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public University() {


    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

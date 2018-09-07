package com.rj.noonesbook.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "ITEM")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int itemId;
    @Column(name="name")
    String name;
    @OneToOne
    @JoinColumn(name="owner")
    Person person;
    @Column(name="rate")
    float rate;
    @Column(name="heading")
    String heading;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return person;
    }

    public void setOwner(Person owner) {
        this.person = owner;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}

package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="college_info")
public class College {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="college_id")
    int id;
    @Column(name="college_name")
    String name;
    @Column(name="location")
    String address;
    @Column(name = "college_city")
    String city;

    public College() {
    }

    public int getId() {
        return id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

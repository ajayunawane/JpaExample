package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tid;
    String name;
    int exp;
    String currentpoject;

    public Tester() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getCurrentpoject() {
        return currentpoject;
    }

    public void setCurrentpoject(String currentpoject) {
        this.currentpoject = currentpoject;
    }
}

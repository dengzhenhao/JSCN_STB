package com.websharp.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ENTITY_PLAY_RECORD.
 */
public class EntityPlayRecord {

    public String USER_NUMBER;
    public String START_TIME;
    public String STD_BASIC_CHARGE;
    public String CHARGE1;
    public String FILM_NAME;

    public EntityPlayRecord() {
    }

    public EntityPlayRecord(String USER_NUMBER, String START_TIME, String STD_BASIC_CHARGE, String CHARGE1, String FILM_NAME) {
        this.USER_NUMBER = USER_NUMBER;
        this.START_TIME = START_TIME;
        this.STD_BASIC_CHARGE = STD_BASIC_CHARGE;
        this.CHARGE1 = CHARGE1;
        this.FILM_NAME = FILM_NAME;
    }

    public String getUSER_NUMBER() {
        return USER_NUMBER;
    }

    public void setUSER_NUMBER(String USER_NUMBER) {
        this.USER_NUMBER = USER_NUMBER;
    }

    public String getSTART_TIME() {
        return START_TIME;
    }

    public void setSTART_TIME(String START_TIME) {
        this.START_TIME = START_TIME;
    }

    public String getSTD_BASIC_CHARGE() {
        return STD_BASIC_CHARGE;
    }

    public void setSTD_BASIC_CHARGE(String STD_BASIC_CHARGE) {
        this.STD_BASIC_CHARGE = STD_BASIC_CHARGE;
    }

    public String getCHARGE1() {
        return CHARGE1;
    }

    public void setCHARGE1(String CHARGE1) {
        this.CHARGE1 = CHARGE1;
    }

    public String getFILM_NAME() {
        return FILM_NAME;
    }

    public void setFILM_NAME(String FILM_NAME) {
        this.FILM_NAME = FILM_NAME;
    }

}

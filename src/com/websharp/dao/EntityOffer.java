package com.websharp.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ENTITY_OFFER.
 */
public class EntityOffer {

    public String ProdId;
    public String ProdName;
    public String OfferId;

    public EntityOffer() {
    }

    public EntityOffer(String ProdId, String ProdName, String OfferId) {
        this.ProdId = ProdId;
        this.ProdName = ProdName;
        this.OfferId = OfferId;
    }

    public String getProdId() {
        return ProdId;
    }

    public void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String ProdName) {
        this.ProdName = ProdName;
    }

    public String getOfferId() {
        return OfferId;
    }

    public void setOfferId(String OfferId) {
        this.OfferId = OfferId;
    }

}

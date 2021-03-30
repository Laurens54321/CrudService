package com.team13.product;
import javax.persistence.Id;

public class BarbequePart {
    @Id
    private String name;
    private String description;
    private int quantity;
    private float cost;

    private String thumbnail_url;

    public BarbequePart() { }

    public BarbequePart(String name, String description, int quantity, float cost, String thumbnail_url){
        setName(name);
        setDescription(description);
        setQuantity(quantity);
        setCost(cost);
        setThumbnail_url(thumbnail_url);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }
}

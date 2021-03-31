package com.bbqService.repo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BarbequePart {
    @Id
    private int id;
    private String title;
    private String description;
    private String thumbnail_url;

    private int quantity;
    private float price;
    private partType partType;

    public enum partType{
        housing,
        wheels,
        grill;

        @Override
        public String toString() {
            switch(this) {
                case housing: return "Housing";
                case wheels: return "Wheels";
                case grill: return "Grill";
                default: return "No Type Set";
            }
        }
    }

    public BarbequePart() { }

    public BarbequePart(int id, String title, String description, int quantity, float price, String thumbnail_url, partType partType){
        setId(id);
        setTitle(title);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
        setthumbnail_url(thumbnail_url);
        setPartType(partType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getthumbnail_url() {
        return thumbnail_url;
    }

    public void setthumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public BarbequePart.partType getPartType() {
        return partType;
    }

    public String getPartTypeString(){
        return partType.toString();
    }

    public void setPartType(BarbequePart.partType partType) {
        this.partType = partType;
    }

}

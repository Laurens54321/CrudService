package com.example.demo;
import com.sun.istack.Nullable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BarbequePart {
    @Id
    private int id;
    private String name;
    private String description;
    private String url;

    private int quantity;
    private float price;
    @Nullable
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

    public BarbequePart(int id, String name, String description, int quantity, float price, String url, partType partType){
        setId(id);
        setName(name);
        setDescription(description);
        setQuantity(quantity);
        setPrice(price);
        setUrl(url);
        setPartType(partType);
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

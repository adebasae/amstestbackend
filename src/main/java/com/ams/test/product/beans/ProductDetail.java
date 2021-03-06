package com.ams.test.product.beans;

import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.math.BigDecimal;

// Se anotaria con entity si fuese una tabla de la bd
@Component
public class ProductDetail implements Serializable {

    private String id;
    private String name;
    private BigDecimal price;
    private boolean availability;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

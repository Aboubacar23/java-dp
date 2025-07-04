package org.sebsy.builder;

import org.sebsy.grasps.entity.Product;

public class ProductBuilder {
    private String name;
    private String nutritionScore;
    private Double energy_100g;
    private Boolean presenceHuilePalme;
    private String ingredientsText;

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder nutritionScore(String score) {
        this.nutritionScore = score;
        return this;
    }

    public ProductBuilder energy_100g(Double value) {
        this.energy_100g = value;
        return this;
    }


    public ProductBuilder presenceHuilePalme(Boolean value)
    {
        this.presenceHuilePalme = value; return this;
    }

    public ProductBuilder ingredientsText(String text) {
        this.ingredientsText = text; return this;
    }


    public Product build() {
        return new Product(name,nutritionScore, energy_100g, presenceHuilePalme, ingredientsText);
    }
}

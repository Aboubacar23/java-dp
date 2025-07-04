package org.sebsy.grasps.entity;

import jakarta.persistence.*;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 510, nullable = false)
    private String nutrition_score;

    @Column(length = 510, nullable = false)
    private String name;

    private Double energy_100g;
    private Double fat_100g;
    private Double sugar_100g;
    private Double salt_100g;
    private Double fiber_100g;
    private Double protein_100g;

    private Double vitA_100g;
    private Double vitD_100g;
    private Double vitE_100g;
    private Double vitK_100g;
    private Double vitC_100g;
    private Double vitB1_100g;
    private Double vitB2_100g;
    private Double vitB6_100g;
    private Double vitB9_100g;
    private Double vitB12_100g;
    private Double vitPP_100g;

    private Double calcium_100g;
    private Double magnesium_100g;
    private Double iron_100g;
    private Double betaCarotene_100g;

    private Boolean presenceHuilePalme;

    @Lob
    private String ingredientsText;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "product_integrient",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> ingredients;


    @ManyToMany
    @JoinTable(
            name = "product_allergen",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "allergen_id")
    )
    private Set<Allergen> allergens;

    @ManyToMany
    @JoinTable(
            name = "product_additive",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "additive_id")
    )
    private Set<Additive> additives;

    public Product(String name, String nutritionScore, Double energy100g, Boolean presenceHuilePalme, String ingredientsText) {
    }

    public String getNutritionScore() {
        return nutrition_score;
    }

    public Double getVitPP_100g() {
        return vitPP_100g;
    }

    public void setVitPP_100g(Double vitPP_100g) {
        this.vitPP_100g = vitPP_100g;
    }

    public void setNutritionScore(String nutritionScore) {
        this.nutrition_score = nutritionScore;
    }

    public Double getEnergy_100g() {
        return energy_100g;
    }

    public void setEnergy_100g(Double energy_100g) {
        this.energy_100g = energy_100g;
    }

    public Double getFat_100g() {
        return fat_100g;
    }

    public void setFat_100g(Double fat_100g) {
        this.fat_100g = fat_100g;
    }

    public Double getSugar_100g() {
        return sugar_100g;
    }

    public void setSugar_100g(Double sugar_100g) {
        this.sugar_100g = sugar_100g;
    }

    public Double getSalt_100g() {
        return salt_100g;
    }

    public void setSalt_100g(Double salt_100g) {
        this.salt_100g = salt_100g;
    }

    public Double getFiber_100g() {
        return fiber_100g;
    }

    public void setFiber_100g(Double fiber_100g) {
        this.fiber_100g = fiber_100g;
    }

    public Double getProtein_100g() {
        return protein_100g;
    }

    public void setProtein_100g(Double protein_100g) {
        this.protein_100g = protein_100g;
    }

    public Double getVitA_100g() {
        return vitA_100g;
    }

    public void setVitA_100g(Double vitA_100g) {
        this.vitA_100g = vitA_100g;
    }

    public Double getVitD_100g() {
        return vitD_100g;
    }

    public void setVitD_100g(Double vitD_100g) {
        this.vitD_100g = vitD_100g;
    }

    public Double getVitE_100g() {
        return vitE_100g;
    }

    public void setVitE_100g(Double vitE_100g) {
        this.vitE_100g = vitE_100g;
    }

    public Double getVitK_100g() {
        return vitK_100g;
    }

    public void setVitK_100g(Double vitK_100g) {
        this.vitK_100g = vitK_100g;
    }

    public Double getVitC_100g() {
        return vitC_100g;
    }

    public void setVitC_100g(Double vitC_100g) {
        this.vitC_100g = vitC_100g;
    }

    public Double getVitB1_100g() {
        return vitB1_100g;
    }

    public void setVitB1_100g(Double vitB1_100g) {
        this.vitB1_100g = vitB1_100g;
    }

    public Double getVitB2_100g() {
        return vitB2_100g;
    }

    public void setVitB2_100g(Double vitB2_100g) {
        this.vitB2_100g = vitB2_100g;
    }

    public Double getVitB6_100g() {
        return vitB6_100g;
    }

    public void setVitB6_100g(Double vitB6_100g) {
        this.vitB6_100g = vitB6_100g;
    }

    public Double getVitB9_100g() {
        return vitB9_100g;
    }

    public void setVitB9_100g(Double vitB9_100g) {
        this.vitB9_100g = vitB9_100g;
    }

    public Double getVitB12_100g() {
        return vitB12_100g;
    }

    public void setVitB12_100g(Double vitB12_100g) {
        this.vitB12_100g = vitB12_100g;
    }

    public Double getCalcium_100g() {
        return calcium_100g;
    }

    public void setCalcium_100g(Double calcium_100g) {
        this.calcium_100g = calcium_100g;
    }

    public Double getMagnesium_100g() {
        return magnesium_100g;
    }

    public void setMagnesium_100g(Double magnesium_100g) {
        this.magnesium_100g = magnesium_100g;
    }

    public Double getIron_100g() {
        return iron_100g;
    }

    public void setIron_100g(Double iron_100g) {
        this.iron_100g = iron_100g;
    }

    public Double getBetaCarotene_100g() {
        return betaCarotene_100g;
    }

    public void setBetaCarotene_100g(Double betaCarotene_100g) {
        this.betaCarotene_100g = betaCarotene_100g;
    }

    public Boolean getPresenceHuilePalme() {
        return presenceHuilePalme;
    }

    public void setPresenceHuilePalme(Boolean presenceHuilePalme) {
        this.presenceHuilePalme = presenceHuilePalme;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(Set<Allergen> allergens) {
        this.allergens = allergens;
    }

    public Set<Additive> getAdditives() {
        return additives;
    }

    public void setAdditives(Set<Additive> additives) {
        this.additives = additives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product() {
    }

    public Product(String name,Double vitPP_100g,String nutritionScore, Double energy_100g, Double fat_100g, Double sugar_100g, Double salt_100g, Double fiber_100g, Double protein_100g, Double vitA_100g, Double vitD_100g, Double vitE_100g, Double vitK_100g, Double vitC_100g, Double vitB1_100g, Double vitB2_100g, Double vitB6_100g, Double vitB9_100g, Double vitB12_100g, Double calcium_100g, Double magnesium_100g, Double iron_100g, Double betaCarotene_100g, Boolean presenceHuilePalme, String ingredientsText, Brand brand, Category category, Set<Ingredient> ingredients, Set<Allergen> allergens, Set<Additive> additives) {
        this.nutrition_score = nutritionScore;
        this.energy_100g = energy_100g;
        this.fat_100g = fat_100g;
        this.sugar_100g = sugar_100g;
        this.salt_100g = salt_100g;
        this.fiber_100g = fiber_100g;
        this.protein_100g = protein_100g;
        this.vitA_100g = vitA_100g;
        this.vitD_100g = vitD_100g;
        this.vitE_100g = vitE_100g;
        this.vitK_100g = vitK_100g;
        this.vitC_100g = vitC_100g;
        this.vitB1_100g = vitB1_100g;
        this.vitB2_100g = vitB2_100g;
        this.vitB6_100g = vitB6_100g;
        this.vitB9_100g = vitB9_100g;
        this.vitB12_100g = vitB12_100g;
        this.calcium_100g = calcium_100g;
        this.magnesium_100g = magnesium_100g;
        this.iron_100g = iron_100g;
        this.betaCarotene_100g = betaCarotene_100g;
        this.presenceHuilePalme = presenceHuilePalme;
        this.ingredientsText = ingredientsText;
        this.brand = brand;
        this.category = category;
        this.ingredients = ingredients;
        this.allergens = allergens;
        this.additives = additives;
        this.vitPP_100g = vitPP_100g;
        this.name = name;
    }
}

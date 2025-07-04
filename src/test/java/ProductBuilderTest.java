import org.junit.Test;
import org.sebsy.builder.ProductBuilder;
import org.sebsy.grasps.entity.Product;

import static org.junit.Assert.*;

public class ProductBuilderTest {

    @Test
    public void buildProductNominalCase() {
        Product product = new ProductBuilder()
                .name("Barre chocolat")
                .nutritionScore("B")
                .presenceHuilePalme(false)
                .ingredientsText("sucre, cacao, lait écrémé")
                .build();

        assertEquals("Barre chocolat", product.getName());
        assertEquals("B", product.getNutritionScore());
        assertFalse(product.getPresenceHuilePalme());
    }

    @Test
    public void buildProductWithMissingOptionalFields() {
        Product product = new ProductBuilder()
                .name("Produit partiel")
                .nutritionScore(null)
                .build();

        assertEquals("Produit partiel", product.getName());
        assertNull(product.getNutritionScore());
        assertNull(product.getEnergy_100g());
    }

    @Test
    public void buildProductWithExtremeValues() {
        Product product = new ProductBuilder()
                .name("Produit extrême")
                .energy_100g(Double.MAX_VALUE)
                .presenceHuilePalme(true)
                .build();

        assertTrue(product.getPresenceHuilePalme());
    }
}

package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ProductCategoryPage {
    private final ElementsCollection firstProductCard = $$(".cm-wp-post-image__wrap");

    public ProductCategoryPage chooseFirstProduct() {
        firstProductCard.get(0).click();
        return this;
    }

}

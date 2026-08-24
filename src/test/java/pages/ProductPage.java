package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private final SelenideElement basket = $(byTagAndText("button", "В корзину")),
            productName = $(".product_title");

    public String getNameFirstProduct() {
        return productName.getText();
    }

    public ProductPage addProductToBasket() {
        productName.shouldBe(Condition.visible, Duration.ofSeconds(6));
        basket.click();
        Selenide.sleep(1500);
        return this;
    }


}

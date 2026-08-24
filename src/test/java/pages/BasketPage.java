package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private final SelenideElement productName = $(".xoo-wsc-pname"),
            deleteButton = $(".xoo-wsc-smr-del");

    public BasketPage checkProductName(String value) {
        productName.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(Condition.text(value));
        return this;

    }

    public BasketPage checkEmptyBasket() {
        productName.shouldNot(visible);
        return this;

    }

    public BasketPage deleteFromBasket() {
        deleteButton.click();
        return this;

    }

}

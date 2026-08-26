package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            search = $("#woocommerce-product-search-field-0"),
            mainMenu = $("#menu-main"),
            filterButton = $(byTagAndText("button", "Фильтровать")),
            tableProducts = $(".cm-main-content__content"),
            priceFrom = $(".woof_price_filter_txt_from"),
            priceTo = $(".woof_price_filter_txt_to");


    private final ElementsCollection firstProductCard = $$(".cm-wp-post-image__wrap"),
            checkBox = $$("li label"),
            products = $$("ul.columns-4 span.price");

    public ElementsCollection getProducts() {
        return products;
    }


    public MainPage openPage() {
        open("");
        return this;
    }

    public MainPage searchProducts(String value) {
        search.setValue(value)
                .pressEnter();
        return this;
    }

    public MainPage chooseFirstProductMainPage() {
        firstProductCard.get(0).click();
        return this;
    }

    public MainPage checkMainMenu(String value) {
        mainMenu.shouldHave(text(value));
        return this;
    }

    public MainPage installCheckBox(String value) {
        checkBox.find(text(value)).click();
        return this;
    }

    public MainPage doFilter() {
        filterButton.click();
        return this;
    }

    public MainPage checkProductsTable(String value) {
        tableProducts.shouldHave(text(value));
        return this;
    }

    public MainPage setPriceFrom(String value) {
        priceFrom.setValue(value);
        return this;
    }

    public MainPage setPriceTo(String value) {
        priceTo.setValue(value);
        return this;
    }

    public MainPage chooseCategoryFromMainMenu(String value) {
        mainMenu.find(byText(value)).click();
        return this;
    }
}

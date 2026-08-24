import helpers.Products;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.SearchPage;

import static io.qameta.allure.Allure.step;

@Epic("UI")
@Owner("Ilgiz Gafarov")
@Feature("Тестирование функционала поиска")
@Tag("search")
@DisplayName("Тестирование функционала поиска")
public class SearchTest extends TestBase {
    SearchPage searchPage = new SearchPage();

    @DisplayName("Поиск товара")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Проверка поиска товара")
    @ParameterizedTest(name = "{0} выдает верный результат")
    @EnumSource(Products.class)
    void searchResultShouldContainTextTest(Products query) {
        step("Открыть главную страницу и заполнить поисковое поле", () -> {
            mainPage.openPage()
                    .searchProducts(query.getProducts());
        });

        step("Убедиться, что поиск выдает верный результат", () -> {
            searchPage.checkSearchResult(query.getProducts());
        });
    }
}
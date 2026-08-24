package helpers;

public enum MainMenu {

    PAPER_PRODUCTS("Бумажная продукция"),
    PRIMER("Грунтовка"),
    BABY_CLOTHES("Детская одежда"),
    GLUE("Клей"),
    FURNITURE("Мебель"),
    CLOTHES("Одежда"),
    TOOLS("Рабочие инструменты"),
    SOUVENIRS("Сувенирная продукция");

    private final String mainMenu;

    public String getMainMenu() {
        return mainMenu;
    }

    MainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }
}

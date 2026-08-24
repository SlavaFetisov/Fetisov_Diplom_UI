package helpers;

public enum Products {

    CAP("Бейсболка АМК"),
    VETONIT_MOSAIC("Vetonit Mosaic"),

    IVSIL_MOSAIK("IVSIL MOSAIK");

    private final String products;

    public String getProducts() {
        return products;
    }

    Products(String products) {
        this.products = products;
    }
}

package helpers;

public enum Products {

    CAP("Каска"),
    MIXER("Миксер"),
    IVSIL_MOSAIK("IVSIL MOSAIK");

    private final String products;

    public String getProducts() {
        return products;
    }

    Products(String products) {
        this.products = products;
    }
}

package day3.mocking.sample2;

public class ShoppingCarService {
    private final ProductManager productManager;

    public ShoppingCarService(ProductManager productManager) {
        this.productManager = productManager;
    }

    public boolean addProductToChart(String productId) {

        int stock = productManager.getStockStatus(productId);
        if (stock > 0) {
            // ürün sepete eklendi.
            productManager.decreaseStock(productId);
            return true;
        } else {

        }
    }
}

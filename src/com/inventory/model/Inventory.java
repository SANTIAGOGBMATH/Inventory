package com.inventory.model;

import java.util.Map;
import java.util.HashMap;

public class Inventory {

    private Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    // Metods

    public void addProduct(Product product){
    if (products.containsKey(product.getProductId())){
        System.out.println("This product is already in the inventory" + product.getProductId());
        return;
    }
    products.put(product.getProductId(), product);
    System.out.printf("Product %s added to the inventory\n", product.getProductId());
    }

    public void removeProduct(int productId){
        if (!products.containsKey(productId)){
             System.out.println("This product is not in the inventory" + productId);
        }
        products.remove(productId);
        System.out.printf("Product %s removed from the inventory\n", productId);
    }
    public void updateProduct(Product product){
        if (!products.containsKey(product.getProductId())){
            System.out.println("This product is not in the inventory" + product.getProductId());
        }
        products.put(product.getProductId(), product);
        System.out.printf("Product %s updated to the inventory\n", product.getProductId());
    }

    public Product findProduct(int productId){
        return products.get(productId);
    }

}

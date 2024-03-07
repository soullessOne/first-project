package ru.soullessone.manager.service;

import ru.soullessone.manager.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);
}

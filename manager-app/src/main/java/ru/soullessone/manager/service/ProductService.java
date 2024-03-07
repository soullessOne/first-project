package ru.soullessone.manager.service;

import ru.soullessone.manager.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
}

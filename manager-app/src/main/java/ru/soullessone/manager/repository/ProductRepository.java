package ru.soullessone.manager.repository;

import ru.soullessone.manager.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}

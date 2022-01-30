package ru.gb.dao;

import ru.gb.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();
    String findNameById(Long id);
    Product findById(Long id);
}

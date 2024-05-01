package com.zaid.musicstoremanagement.repositories;

import com.zaid.musicstoremanagement.models.Category;
import com.zaid.musicstoremanagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);
    @Override
    List<Product> findAll();

    List<Product> findAllByCategory_categoryId(Long categoryId);

    @Override
    Product save(Product product);
    @Override
    void delete(Product product);
    List<Product> findAllByOrderByPrice();


}
package com.christyjohn.cruddemo.dao;

import com.christyjohn.cruddemo.entity.Product;
import jakarta.persistence.EntityManager;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@NoArgsConstructor
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Product product) {
        entityManager.persist(product);
    }
}

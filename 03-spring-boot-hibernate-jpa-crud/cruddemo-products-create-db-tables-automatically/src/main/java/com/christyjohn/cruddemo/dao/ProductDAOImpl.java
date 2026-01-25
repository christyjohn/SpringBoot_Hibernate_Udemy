package com.christyjohn.cruddemo.dao;

import com.christyjohn.cruddemo.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Product findById(Integer id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        // FROM Product - This is not the table name in DB, but the Entity class name
        TypedQuery<Product> theQuery = entityManager.createQuery("FROM Product",
                Product.class);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    public Product findBySKU(String sku) {
        // create query
        TypedQuery<Product> theQuery = entityManager.createQuery(
                "FROM Product WHERE sku=:theSKU", Product.class);

        // set query parameters
        theQuery.setParameter("theSKU", sku);

        // return query results
        return theQuery.getSingleResult();
    }

    @Override
    public List<Product> findByProductName(String productName) {
        // create query
        TypedQuery<Product> theQuery = entityManager.createQuery(
                "FROM Product WHERE productName=:theproductName", Product.class);

        // set query parameters
        theQuery.setParameter("theproductName", productName);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve the product
        Product product = entityManager.find(Product.class, id);

        // delete the product
        entityManager.remove(product);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Product").executeUpdate();
        return numRowsDeleted;
    }
}

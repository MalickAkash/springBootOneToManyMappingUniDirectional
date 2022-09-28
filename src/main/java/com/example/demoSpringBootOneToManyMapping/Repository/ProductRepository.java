package com.example.demoSpringBootOneToManyMapping.Repository;

import com.example.demoSpringBootOneToManyMapping.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(
            value = "select * from product p where p.product_name= :n",
            nativeQuery = true
    )
    List<Product> showProduct(@Param("n") String productName);
}

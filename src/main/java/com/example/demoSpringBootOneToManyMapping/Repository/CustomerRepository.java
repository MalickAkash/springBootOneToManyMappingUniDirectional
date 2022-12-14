package com.example.demoSpringBootOneToManyMapping.Repository;

import com.example.demoSpringBootOneToManyMapping.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

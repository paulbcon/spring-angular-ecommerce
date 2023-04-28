package com.paulnc.ecommerce.repository;

import com.paulnc.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // SELECT * FROM customer c WHERE c.email = theEmail
    Customer findByEmail(String theEmail);  // method returns null if not found

}

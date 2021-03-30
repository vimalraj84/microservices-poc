package com.bilqu.custmgmt.dao;

import com.bilqu.custmgmt.bo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByPhone(String phone);
    Customer findByEmail(String email);
}

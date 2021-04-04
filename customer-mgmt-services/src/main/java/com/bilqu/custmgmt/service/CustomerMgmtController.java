package com.bilqu.custmgmt.service;

import com.bilqu.custmgmt.eo.Customer;
import com.bilqu.custmgmt.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerMgmtController {

    @Autowired
    private Environment environment;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer/phone/{phone}")
    public Customer getCustomerByPhone(@PathVariable(name = "phone") String phone){
        return customerRepository.findByPhone(phone);

    }

    @GetMapping("/customer/email/{email}")
    public Customer getCustomerByEmail(@PathVariable(name = "email") String email){
        return customerRepository.findByEmail(email);
    }
}

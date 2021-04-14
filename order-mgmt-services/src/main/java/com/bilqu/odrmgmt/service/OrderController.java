package com.bilqu.odrmgmt.service;

import com.bilqu.odrmgmt.eo.Order;
import com.bilqu.odrmgmt.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private Environment environment;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders/customer/{orderId}")
    public Order getOrder(@PathVariable("orderId") Integer orderId){
        return orderRepository.getOne(orderId);
    }

    @GetMapping("/orders/customer/{custId}")
    public List<Order> getCustomerOrder(@PathVariable("custId") Integer custId){
        return orderRepository.findByCustId(custId);
    }

    @Transactional
    @PostMapping("/placeOrder")
    public @ResponseBody Order placeOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @Transactional
    @PostMapping("/cancelOrder")
    public @ResponseBody Order cancelOrder(@RequestBody Order order){
        return orderRepository.saveAndFlush(order);
    }


}

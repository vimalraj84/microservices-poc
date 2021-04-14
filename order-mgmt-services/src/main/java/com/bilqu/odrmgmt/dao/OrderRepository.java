package com.bilqu.odrmgmt.dao;

import com.bilqu.odrmgmt.eo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCustId(Integer custId);

}

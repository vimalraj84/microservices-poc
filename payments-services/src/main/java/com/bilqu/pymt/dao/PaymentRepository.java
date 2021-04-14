package com.bilqu.pymt.dao;

import com.bilqu.pymt.eo.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

   List<Payment> findAllByCustId(Integer custId);
   List<Payment> findAllByOrderId(Integer orderId);


}

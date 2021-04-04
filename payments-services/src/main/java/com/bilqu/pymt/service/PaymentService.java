package com.bilqu.pymt.service;

import com.bilqu.pymt.eo.Payment;
import com.bilqu.pymt.dao.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class PaymentService {

    @Autowired
    private Environment environment;

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payment")
    public @ResponseBody Optional<Payment> getPayment(@PathVariable(name = "paymentId") Integer paymentId){
        return paymentRepository.findById(paymentId);
    }

    @GetMapping("/payment/customer")
    public @ResponseBody List<Payment> getPaymentByCustomer(@PathVariable(name = "custId") Integer custId){
        return paymentRepository.findAllByCustId(custId);
    }

    @GetMapping("/payment/order")
    public @ResponseBody  List<Payment> getPaymentByOrder(@PathVariable(name = "orderId") Integer orderId){
        return paymentRepository.findAllByCustId(orderId);
    }

    @Transactional
    @PostMapping("/makePayment")
    public @ResponseBody  Payment makePayment(@RequestBody Payment payment){
        return paymentRepository.save(payment);
    }

    @Transactional
    @PutMapping("/cancelPayment")
    public @ResponseBody  Payment cancelPayment(@RequestBody Payment payment){
        return paymentRepository.saveAndFlush(payment);
    }



}

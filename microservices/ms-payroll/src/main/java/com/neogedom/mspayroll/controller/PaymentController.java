package com.neogedom.mspayroll.controller;

import com.neogedom.mspayroll.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping(value = "/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Integer days) {

    }
}

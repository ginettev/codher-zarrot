package com.tw.zarrot.controller;

import com.tw.zarrot.dto.PaymentDetails;
import com.tw.zarrot.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/payment")
    @ResponseStatus(value = HttpStatus.OK)
    public String pay(@RequestBody PaymentDetails paymentDetails) {
        return paymentService.pay(paymentDetails);
    }
}

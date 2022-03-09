package org.mkhbeldi.dev.mpayments.web.controller;

import org.mkhbeldi.dev.mpayments.model.Payment;
import org.mkhbeldi.dev.mpayments.service.IPaymentService;
import org.mkhbeldi.dev.mpayments.web.exception.PaymentExistingException;
import org.mkhbeldi.dev.mpayments.web.exception.PaymentUnableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    @PostMapping(value = "/payment")
    public ResponseEntity<Payment> payerUneCommande(@RequestBody Payment paymentToAdd){
        //Check if there is already a payment recorded for this order
        Payment paymentExisting = paymentService.getPaymentByOrderId(paymentToAdd.getOrderId());
        if(paymentExisting != null) throw new PaymentExistingException("This order is already paid");
        //Save payment
        Payment payment = paymentService.saveOrUpdatePayment(paymentToAdd);
        if(payment == null) throw new PaymentUnableException("Error, unable to process payment, try again later");
        //TODO Nous allons appeler le Microservice Commandes ici pour lui signifier que le paiement est accepté
        return new ResponseEntity<Payment>(payment, HttpStatus.CREATED);
    }

}

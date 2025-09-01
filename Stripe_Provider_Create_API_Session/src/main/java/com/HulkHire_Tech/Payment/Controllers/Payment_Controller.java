package com.HulkHire_Tech.Payment.Controllers;

import com.HulkHire_Tech.Payment.Constants.Constant;
import com.HulkHire_Tech.Payment.Pojo.Create_Payment_Request;
import com.HulkHire_Tech.Payment.Pojo.Payment_Response;
import com.HulkHire_Tech.Payment.Services.Payment_Services;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping(Constant.PAYMENTS)
@RequiredArgsConstructor
public class Payment_Controller {

    private final Payment_Services Payment_Services;

    @PostMapping
    public Payment_Response Checkout_Session(@RequestBody Create_Payment_Request CreatePaymentRequest) {
        log.info("Create Payment Request: {}", CreatePaymentRequest);

        //TODO: hear we need to make a Restapi call to stripe server to create a payment

        Payment_Response responce = Payment_Services.CreatePayment(CreatePaymentRequest);
        log.info("Payment responce: {}", responce);
        return responce;
    }

    @PostMapping("/{id}")
    public Payment_Response Update_Checkout_Session(@RequestBody Create_Payment_Request CreatePaymentRequest, @PathVariable String id) {
        log.info("Update Payment Request: {}", CreatePaymentRequest);
        return null;
    }
    @GetMapping("/{id}")
    public Payment_Response Retrieve_Checkout_Session(@RequestBody Create_Payment_Request CreatePaymentRequest, @PathVariable String id) {
        log.info("Update Payment Request: {}", CreatePaymentRequest);
        return null;
    }


}

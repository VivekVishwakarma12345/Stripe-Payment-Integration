package com.HulkHire_Tech.PaymentProcessingService.Controller;

import com.HulkHire_Tech.PaymentProcessingService.Constant.Constant;
import com.HulkHire_Tech.PaymentProcessingService.Responce_Pojo.CreataTexRequest;
import com.HulkHire_Tech.PaymentProcessingService.Responce_Pojo.FinalTrxResponce;
import com.HulkHire_Tech.PaymentProcessingService.Responce_Pojo.InitiateTexRequest;
import com.HulkHire_Tech.PaymentProcessingService.Services.Interface.Transection_Service;
import com.HulkHire_Tech.PaymentProcessingService.Stripe_Provider.StripeFinalResponce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(Constant.V1_PAYMENT)
@RequiredArgsConstructor
public class Payment_Controller {

    private final Transection_Service transectionService;

    @PostMapping
    public FinalTrxResponce creataTransection(@RequestBody CreataTexRequest creataTexRequest){

        log.info("=> {} ", creataTexRequest);
        FinalTrxResponce ResponceService = transectionService.creataTrx(creataTexRequest);
        return ResponceService;
    }
    @PostMapping("/{txnReference}/initiate")
    public FinalTrxResponce initiateTransection(@PathVariable String txnReference, @RequestBody InitiateTexRequest initiateTexRequest) {

        log.info("=> {} ", initiateTexRequest);
        FinalTrxResponce ResponceService = transectionService.initiateTrx(txnReference, initiateTexRequest);

        return ResponceService;
    }
}

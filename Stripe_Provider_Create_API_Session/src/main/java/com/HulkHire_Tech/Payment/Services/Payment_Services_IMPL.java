package com.HulkHire_Tech.Payment.Services;

import com.HulkHire_Tech.Payment.HTTP.HttpRequestData;
import com.HulkHire_Tech.Payment.HTTP.HttpServiceEngine;
import com.HulkHire_Tech.Payment.Pojo.Create_Payment_Request;
import com.HulkHire_Tech.Payment.Pojo.Payment_Response;
import com.HulkHire_Tech.Payment.Util.JSON_Util;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Payment_Services_IMPL implements Payment_Services {

    private final HttpServiceEngine httpServiceEngine;
    private final JSON_Util jsonUtil;
    private final Payment_Service_Helper createPaymentHelper;


    @Override
    public Payment_Response CreatePayment(Create_Payment_Request CreatePaymentRequest) {
        log.info("Process payment creation logic here");

//      paymentExceptions.validatePaymentRequest(CreatePaymentRequest);

        HttpRequestData requestData = createPaymentHelper.PrepareHttpRequest(CreatePaymentRequest);

        ResponseEntity<String> httpResponce = httpServiceEngine.MakingHttpCall(requestData);
        log.info("Http Responce from external service: {}", httpResponce);

        Payment_Response response = createPaymentHelper.ProcessResponse(httpResponce);

        return response;
    }
    // For Update Session and Retrieve Session
    /*@Override
    public Payment_Response CreatePayment(Create_Payment_Request CreatePaymentRequest,String id) {
        log.info("Process payment creation logic here");

        HttpRequestData requestData = createPaymentHelper.PrepareHttpRequest(CreatePaymentRequest);

        ResponseEntity<String> httpResponce = httpServiceEngine.MakingHttpCall(requestData);
        log.info("Http Responce from external service: {}", httpResponce);

        Payment_Response response = createPaymentHelper.ProcessResponse(httpResponce);

        return response;
    }*/
// We need to Give a valid Open AI API key in application.properties file to test this method
    /*@PostConstruct
    public void init(){
        String response = chatClient
                .prompt()
                .user(promptUserSpec -> promptUserSpec
                        .text(PromptTemplate)
                        .param("error_json", errorJson)
                )
                .call()
                .content();
        log.info("=> Response from OpenAI: {}", response);
    }*/
}

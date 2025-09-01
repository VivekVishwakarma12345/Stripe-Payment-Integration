package com.HulkHire_Tech.Payment.Services;


import com.HulkHire_Tech.Payment.Pojo.Create_Payment_Request;
import com.HulkHire_Tech.Payment.Pojo.Payment_Response;
import org.springframework.stereotype.Service;

@Service
public interface Payment_Services {
    public Payment_Response CreatePayment(Create_Payment_Request CreatePaymentRequest);
//    public Payment_Response CreatePayment(Create_Payment_Request CreatePaymentRequest,String id);
}

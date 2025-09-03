package com.HulkHire_Tech.Payment.Responce_Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Payment_Response {
    private String id;
    private String sessionStatus;
    private String paymentStatus;
    private String url;
}

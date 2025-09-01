package com.HulkHire_Tech.Payment.HTTP;

import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@Data
public class HttpRequestData {
    private HttpMethod httpMethod;
    private String url;
    private HttpHeaders httpHeaders;
    private Object requestBody;
}

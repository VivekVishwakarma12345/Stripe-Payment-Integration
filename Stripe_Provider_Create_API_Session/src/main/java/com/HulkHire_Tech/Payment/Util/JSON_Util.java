package com.HulkHire_Tech.Payment.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class JSON_Util {
    private final ObjectMapper objectMapper;

    public <T> T ConvertJsonToJavaObject(String responseEntity, Class<T> valueType) {
        try {
            return objectMapper.readValue(responseEntity, valueType);
        } catch (Exception e) {
            log.error("Error parsing JSON response: {}", e.getMessage());
            throw new RuntimeException("Failed to parse JSON response", e);
        }
    }

}

package com.HulkHire_Tech.Payment.Services;

import com.stripe.model.Event;
import com.stripe.model.EventDataObjectDeserializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class ProcessStripeEventAsync {
    @Async
    public static void ProcessingResponceEvent(Event event) {
        //Read Incoming data
        //data.object
        //Understand Witch Event
        log.info("Processing Event: => Id: {} | Type: {}");
    EventDataObjectDeserializer ObjectDeserializer = event.getDataObjectDeserializer();
        log.info("ObjectDeserializer: {}", ObjectDeserializer);
        //Success / Failure
        //Making API Call to processing-service
        //Response Back
    }
}
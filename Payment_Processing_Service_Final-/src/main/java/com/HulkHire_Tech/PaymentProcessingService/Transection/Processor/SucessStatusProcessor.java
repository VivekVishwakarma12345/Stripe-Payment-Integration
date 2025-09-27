package com.HulkHire_Tech.PaymentProcessingService.Transection.Processor;

import com.HulkHire_Tech.PaymentProcessingService.Transection.DTO.TransectionDTO;
import com.HulkHire_Tech.PaymentProcessingService.Transection.TrxStatusProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SucessStatusProcessor implements TrxStatusProcessor {
    @Override
    public TransectionDTO processStatus(TransectionDTO trxDto) {
        log.info("=> SucessStatusProcessor");

        //TODO Logic to save the transaction with "Created" status in the database

        return trxDto;
    }
}

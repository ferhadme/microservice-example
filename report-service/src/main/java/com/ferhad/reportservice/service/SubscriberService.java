package com.ferhad.reportservice.service;

import com.ferhad.reportservice.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubscriberService {
    private final ReportRepository reportRepository;

    @KafkaListener(topics = "user_registration", groupId = "registration")
    public void consume(String message) {
        reportRepository.save(message);
    }
}

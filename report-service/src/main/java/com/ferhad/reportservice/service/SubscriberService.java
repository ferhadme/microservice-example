package com.ferhad.reportservice.service;

import com.ferhad.reportservice.model.Report;
import com.ferhad.reportservice.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class SubscriberService {
    private final ReportRepository reportRepository;

    @KafkaListener(topics = "user_registration", groupId = "registration")
    public void consume(String message) {
        Report report = Report.builder()
                .message(message)
                .date(LocalDate.now())
                .build();
        reportRepository.save(report);
    }
}


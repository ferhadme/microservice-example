package com.ferhad.reportservice.controller;

import com.ferhad.reportservice.model.Report;
import com.ferhad.reportservice.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {
    private final ReportRepository reportRepository;

    @GetMapping
    public ResponseEntity<List<Report>> getReports() {
        return ResponseEntity.ok(
                reportRepository.findAll()
        );
    }

}

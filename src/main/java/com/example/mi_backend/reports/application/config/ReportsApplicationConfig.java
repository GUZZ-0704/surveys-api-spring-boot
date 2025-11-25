package com.example.mi_backend.reports.application.config;

import com.example.mi_backend.reports.domain.service.ReportCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReportsApplicationConfig {

    @Bean
    public ReportCalculator reportCalculator() {
        return new ReportCalculator();
    }
}

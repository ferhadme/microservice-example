package com.ferhad.reportservice.repository;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.Tables;
import nu.studer.sample.tables.pojos.Reports;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReportRepository {
    private final DSLContext context;

    public List<Reports> findAll() {
        return context.selectFrom(Tables.REPORTS)
                .fetchInto(Reports.class);
    }

    public void save(String message) {
        context.insertInto(Tables.REPORTS)
                .columns(Tables.REPORTS.MESSAGE, Tables.REPORTS.CREATED_AT)
                .values(message, Date.valueOf(LocalDate.now()))
                .execute();
    }
}

package io.behappy.domain.report;

public interface VisitableReport<T> extends Report {
    T accept(ReportVisitor<T> visitor);
}

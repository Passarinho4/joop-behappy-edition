package io.behappy.domain.report;

public interface VisitableReport extends Report {
    void accept(ReportVisitor visitor);
}

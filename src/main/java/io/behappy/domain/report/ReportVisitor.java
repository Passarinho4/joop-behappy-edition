package io.behappy.domain.report;

public interface ReportVisitor<T> {

    T visit(DeveloperReport report);
    T visit(ManagerReport report);

}

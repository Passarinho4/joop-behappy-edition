package io.behappy.domain.report;

public interface ReportVisitor {

    void visit(DeveloperReport report);
    void visit(ManagerReport report);

}

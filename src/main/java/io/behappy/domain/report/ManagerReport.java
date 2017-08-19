package io.behappy.domain.report;

import io.behappy.domain.employee.Name;

import java.util.LinkedList;
import java.util.List;

public class ManagerReport implements VisitableReport<String> {

    private final Name managerName;
    private final List<VisitableReport<String>> reports;

    public ManagerReport(Name managerName) {
        this.managerName = managerName;
        this.reports = new LinkedList<>();
    }

    @Override
    public Name executorName() {
        return managerName;
    }

    public List<VisitableReport<String>> getReports() {
        return reports;
    }

    public void addReport(VisitableReport<String> report) {
        this.reports.add(report);
    }

    @Override
    public String accept(ReportVisitor<String> visitor) {
        return visitor.visit(this);
    }
}

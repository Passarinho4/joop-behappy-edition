package io.behappy.domain.report;

import io.behappy.domain.employee.Name;

import java.util.LinkedList;
import java.util.List;

public class ManagerReport implements VisitableReport {

    private final Name managerName;
    private final List<VisitableReport> reports;

    public ManagerReport(Name managerName) {
        this.managerName = managerName;
        this.reports = new LinkedList<>();
    }

    @Override
    public Name executorName() {
        return managerName;
    }

    public List<VisitableReport> getReports() {
        return reports;
    }

    public void addReport(VisitableReport report) {
        this.reports.add(report);
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}

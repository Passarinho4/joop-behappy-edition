package io.behappy.domain.report;

import io.behappy.domain.employee.Name;

import java.util.LinkedList;
import java.util.List;

public class DeveloperReport implements VisitableReport {

    private final Name developerName;
    private final List<TaskSummary> summaries;


    public DeveloperReport(Name developerName) {
        this.developerName = developerName;
        summaries = new LinkedList<>();
    }

    @Override
    public Name executorName() {
        return developerName;
    }

    @Override
    public int unitOfWorks() {
        return summaries.stream().mapToInt(TaskSummary::getUnitOfWorks).sum();
    }

    public List<TaskSummary> getTaskSummaries() {
        return this.summaries;
    }

    public void addTaskSummary(TaskSummary summary) {
        summaries.add(summary);
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}

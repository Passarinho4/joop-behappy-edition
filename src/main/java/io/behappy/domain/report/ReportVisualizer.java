package io.behappy.domain.report;

import io.behappy.service.PrintService;

public class ReportVisualizer implements ReportVisitor {

    private final PrintService printService;

    public ReportVisualizer(PrintService printService) {

        this.printService = printService;
    }

    public void visit(DeveloperReport report) {
        StringBuilder builder = new StringBuilder();
        builder.append("Developer ")
                .append(report.executorName())
                .append(" has done: ");
        report.getTaskSummaries()
                .forEach(summary -> {
                    builder.append("Task(");
                    builder.append(summary.getTaskTitle());
                    builder.append(",");
                    builder.append(summary.getUnitOfWorks());
                    builder.append(" UoW)");
                });
        printService.print(builder.toString());
    }

    public void visit(ManagerReport report) {
        StringBuilder builder = new StringBuilder();
        builder.append("Manager ")
                .append(report.executorName())
                .append(" has done: \n{");

        report.getReports().forEach(r -> r.accept(this));
        builder.append("}\n");

         printService.print(builder.toString());
    }

}

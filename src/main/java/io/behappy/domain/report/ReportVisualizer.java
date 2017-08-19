package io.behappy.domain.report;

public class ReportVisualizer implements ReportVisitor<String> {

    public String visit(DeveloperReport report) {
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
        return builder.toString();
    }

    public String visit(ManagerReport report) {
        StringBuilder builder = new StringBuilder();
        builder.append("Manager ")
                .append(report.executorName())
                .append(" has done: \n{");

        report.getReports()
                .stream()
                .map(r -> r.accept(this))
                .forEach(s -> {
                    builder.append(s);
                    builder.append("\n");
                });
        builder.append("}\n");

        return builder.toString();
    }

}

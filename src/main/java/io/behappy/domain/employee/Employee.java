package io.behappy.domain.employee;


import io.behappy.domain.report.VisitableReport;
import io.behappy.domain.task.Task;

import java.util.Locale;

public interface Employee {
    Name getName();
    Role getRole();

    University getUniversity();

    Gender getGender();

    Locale getNationality();

    Mail getMail();
    void assign(Task task);
    VisitableReport reportWork();
}

package io.behappy.domain.report;

import io.behappy.domain.employee.Name;

public interface Report {
    Name executorName();

    int unitOfWorks();
}

package io.behappy.service;

import io.behappy.domain.employee.Employee;
import io.behappy.domain.employee.developer.Developer;
import io.behappy.domain.employee.manager.TeamManager;

public interface GeneratorService {

    Developer getSeniorDeveloper();
    Developer getJuniorDeveloper();
    TeamManager getTeamManager();
    TeamManager getCeo();
    Employee getRandomEmployee();

}

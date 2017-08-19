package io.behappy.service;

import io.behappy.domain.employee.Employee;
import io.behappy.domain.employee.Name;
import io.behappy.domain.employee.Role;
import io.behappy.domain.employee.developer.Developer;
import io.behappy.domain.employee.manager.TeamManager;

import java.util.Random;

import static io.behappy.datasource.ExampleDataSource.NAMES;

public final class RandomGeneratorService implements GeneratorService {

    private final Random random = new Random();

    RandomGeneratorService() {
    }


    private Name getRandomName() {
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    @Override
    public Developer getSeniorDeveloper() {
        return new Developer(getRandomName(), Role.SENIOR_DEVELOPER);
    }

    @Override
    public Developer getJuniorDeveloper() {
        return new Developer(getRandomName(), Role.JUNIOR_DEVELOPER);
    }

    @Override
    public TeamManager getTeamManager() {
        return new TeamManager(getRandomName(), Role.TEAM_MANAGER, random.nextInt(5) + 1);
    }

    @Override
    public TeamManager getCeo() {
        return new TeamManager(getRandomName(), Role.CEO, random.nextInt(3) + 1);
    }

    @Override
    public Employee getRandomEmployee() {
        switch (random.nextInt(3)) {
            case 0:
                return getSeniorDeveloper();
            case 1:
                return getJuniorDeveloper();
            case 2:
                return getTeamManager();
            default:
                return getTeamManager();
        }
    }
}

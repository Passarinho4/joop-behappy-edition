package io.behappy.service;

import io.behappy.domain.employee.*;
import io.behappy.domain.employee.developer.Developer;
import io.behappy.domain.employee.developer.DeveloperBuilder;
import io.behappy.domain.employee.manager.TeamManager;
import io.behappy.domain.employee.manager.TeamManagerBuilder;

import java.util.Locale;
import java.util.Random;
import java.util.function.Predicate;

import static io.behappy.datasource.ExampleDataSource.*;

public final class RandomGeneratorService implements GeneratorService {

    private final Random random = new Random();

    private Name getRandomName() {
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    private Gender getRandomGender() {
        return GENDERS.get(random.nextInt(GENDERS.size()));
    }

    private University getRandomUniversity() {
        return UNIVERSITIES.get(random.nextInt(UNIVERSITIES.size()));
    }

    private Mail getRandomMail() {
        return MAILS.get(random.nextInt(MAILS.size()));
    }

    private Locale getRandomNationality() {
        return NATIONALITIES.get(random.nextInt(NATIONALITIES.size()));
    }

    private Predicate<Employee> getRandomHireStrategy() {
        return HIRE_STRATEGIES.get(random.nextInt(HIRE_STRATEGIES.size()));
    }

    @Override
    public Developer getSeniorDeveloper() {
        return new DeveloperBuilder()
                .setName(getRandomName())
                .setGender(getRandomGender())
                .setUniversity(getRandomUniversity())
                .setMail(getRandomMail())
                .setNationality(getRandomNationality())
                .setRole(Role.SENIOR_DEVELOPER)
                .build();
    }

    @Override
    public Developer getJuniorDeveloper() {
        return new DeveloperBuilder()
                .setName(getRandomName())
                .setGender(getRandomGender())
                .setUniversity(getRandomUniversity())
                .setMail(getRandomMail())
                .setNationality(getRandomNationality())
                .setRole(Role.JUNIOR_DEVELOPER)
                .build();
    }

    @Override
    public TeamManager getTeamManager() {
        return new TeamManagerBuilder()
                .setName(getRandomName())
                .setGender(getRandomGender())
                .setUniversity(getRandomUniversity())
                .setMail(getRandomMail())
                .setNationality(getRandomNationality())
                .setRole(Role.TEAM_MANAGER)
                .setMaxTeamSize(random.nextInt(5) + 2)
                .addHireConstrains(getRandomHireStrategy())
                .build();
    }

    @Override
    public TeamManager getCeo() {
        return new TeamManagerBuilder()
                .setName(getRandomName())
                .setGender(getRandomGender())
                .setUniversity(getRandomUniversity())
                .setMail(getRandomMail())
                .setNationality(getRandomNationality())
                .setRole(Role.CEO)
                .setMaxTeamSize(random.nextInt(2) + 2)
                .build();
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

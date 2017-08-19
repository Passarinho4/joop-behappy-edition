package io.behappy.datasource;

import com.google.common.collect.ImmutableList;
import io.behappy.domain.employee.*;
import io.behappy.domain.employee.manager.HireStrategiesFactory;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public final class ExampleDataSource {

    private ExampleDataSource(){}

    public static List<Name> NAMES = ImmutableList.of(
            new Name("Szymek"),
            new Name("Julia"),
            new Name("Tomek"),
            new Name("Klara"),
            new Name("Piotr"),
            new Name("Karolina"),
            new Name("Marcin"),
            new Name("Natalia"),
            new Name("Karol"),
            new Name("Anna"),
            new Name("Adam"),
            new Name("Zuzia"));

    public static List<Gender> GENDERS = ImmutableList.copyOf(Gender.values());
    public static List<University> UNIVERSITIES = ImmutableList.copyOf(University.values());
    public static List<Mail> MAILS = ImmutableList.of(
            new Mail("passarinho4@gmail.com"),
            new Mail("trololo@gmail.com"));
    public static List<Locale> NATIONALITIES = ImmutableList.copyOf(Locale.getAvailableLocales());
    public static List<Predicate<Employee>> HIRE_STRATEGIES = ImmutableList.of(
            HireStrategiesFactory.getOnlyAGH(),
            HireStrategiesFactory.getOnlyWomen());
}

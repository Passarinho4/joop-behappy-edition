package io.behappy.datasource;

import com.google.common.collect.ImmutableList;
import io.behappy.domain.employee.Name;

import java.util.List;

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
}

package io.behappy.service;

public final class ServiceProvider {

    private static final PrintService printService = new ConsolePrintService();
    private static final GeneratorService generatorService = new RandomGeneratorService();

    private ServiceProvider() {}

    public static PrintService getPrintService() {
        return printService;
    }

    public static GeneratorService getGeneratorService() {
        return generatorService;
    }


}

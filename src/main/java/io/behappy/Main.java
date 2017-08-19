package io.behappy;

import com.google.common.primitives.Ints;
import io.behappy.service.GeneratorService;
import io.behappy.service.PrintService;
import io.behappy.service.ServiceProvider;

import static com.google.common.base.Preconditions.checkArgument;

public class Main {

    public static void main(String[] args) {
        checkArgument(args.length == 1, "Wrong argument number, please specify company min-size.");
        checkArgument(Ints.tryParse(args[0]) != null, "Wrong argument format, please use int");

        GeneratorService generatorService = ServiceProvider.getGeneratorService();
        PrintService printService = ServiceProvider.getPrintService();

        //Some random company implementation... Probably will be very messy.


    }

}

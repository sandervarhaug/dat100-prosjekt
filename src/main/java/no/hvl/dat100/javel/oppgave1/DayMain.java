package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        DailyPower.printPowerPrices(powerprices_day);
        DailyPower.printPowerUsage(powerusage_day);
        double powerUseTotal = DailyPower.computePowerUsage(powerusage_day);
        System.out.println(powerUseTotal + " KwH");
        double priceTotal = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK",  priceTotal);
        System.out.println();
        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK",  support);
        System.out.println();
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("%.2f NOK",  norgesPris);
        System.out.println();

        double average = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("%.2f KwH",  average);
        System.out.println();



        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}

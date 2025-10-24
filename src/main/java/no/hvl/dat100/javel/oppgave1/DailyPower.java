package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        System.out.println("--------------\nPower Prices\n--------------");

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " NOK");
        }

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        System.out.println("--------------\nPower Usage\n--------------");

        for (int i = 0; i < usage.length; i++) {
            System.out.println(usage[i] + " KwH");
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {
        System.out.println("--------------\nPower Usage Per Day\n--------------");

        double sum = 0;

        for (double use : usage) {
            sum += use;
        }

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {
        System.out.println("--------------\nCompute Spot Price\n--------------");
        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price += prices[i] * usage[i];
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        double PricePerKwH = usage * price;
        PricePerKwH = PricePerKwH - THRESHOLD;
        if (PricePerKwH < 0) {

        }
        else if (PricePerKwH > 0) {
            support =  PricePerKwH * PERCENTAGE;
        }


        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {
        System.out.println("--------------\nCompute Support\n--------------");

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            support += getSupport(usage[i], prices[i]);
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {
        System.out.println("--------------\nCompute Norgespris\n--------------");
        double price = 0;

        for (double use : usage) {
            price += use * NORGESPRIS_KWH;
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        // TODO

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {
        System.out.println("--------------\nFind Average Power\n--------------");
        double average = 0;

        for (double use : usage) {
            average += use;
        }
        average = average / usage.length;

        return average;
    }
}
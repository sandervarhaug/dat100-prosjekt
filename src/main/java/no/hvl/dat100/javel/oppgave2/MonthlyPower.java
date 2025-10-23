package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i<usage.length; i++){
            System.out.print("Day " + i + ":");
            for (int k = 0; k<usage[i].length; k++){
                System.out.printf("%.2f" + " kWh ", usage[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("==============");
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i<prices.length; i++){
            System.out.print("Day " + i + ":");
            for (int k = 0; k<prices[i].length; k++){
                System.out.printf("%.2f" + " kr ", prices[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("==============");
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 550;

        for (int i = 0; i<usage.length; i++){
            for (int k = 0; k<usage[i].length; k++){
                sum += usage[i][k];
            }
        }
        System.out.printf("%.2f" + " kWh totalt (månad)", sum);
        System.out.println();
        System.out.println("==============");

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;

        while (computePowerUsage(powerusage) > threshold){
            exceeded = true;
            break;
        }
        System.out.println("Om forbruk er over 1000 kWh, får vi resultat true");
        System.out.print(exceeded);
        System.out.println();
        System.out.println("==============");
        return exceeded;
    }
    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        if (usage.length == prices.length) {
            for (int i = 0; i < usage.length; i++) {
                for (int k = 0; k < usage[i].length-1; k++) {
                    price += usage[i][k]*prices[i][k];
                }
            }
        }

        System.out.printf("%.2f" + " kr (spotpris, mådespris uten strømstøtte)", price);
        System.out.println();
        System.out.println("==============");
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        double threshold = 0.9375;
        double share = 0.9;

        for (int i = 0; i < usage.length; i++) {
            for (int k = 0; k <usage[i].length; k++) {
                double price = prices[i][k];
                double used = usage[i][k];

                if (price > threshold) {
                    double above = price - threshold;
                    support += used * above * share;
                }
            }
        }

        System.out.printf("%.2f" + "kr (strømstøtte, når prisen er over 0.9375 øre", support);
        System.out.println();
        System.out.println("==============");
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        int i = 0;
        for (double[] usageRad : usage) {
            int j = 0;
            for (double bruk : usageRad) {
                price += bruk * 0.5;
                j++;
            }
            i++;
        }

        System.out.printf("%.2f" + "kr (norgespris)", price);
        System.out.println();
        System.out.println("==============");
        return price;
    }
}


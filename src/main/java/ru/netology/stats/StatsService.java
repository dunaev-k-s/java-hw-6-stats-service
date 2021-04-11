package ru.netology.stats;

public class StatsService {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int arrayLength = monthlySales.length;

    public int calculateSumForSales(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverageSale(int[] monthlySales) {
        int sum = 0;
        double average = 0;
        for (int sale : monthlySales) {
            average = (sum += sale) / arrayLength;
        }
        return average;
    }

    public int calculateNumberLastMaxSale(int[] monthlySales) {
        int numberMax = 0;
        int number = 0;
        int currentMax = monthlySales[0];
        for (int sale : monthlySales) {
            number ++;
            if (currentMax < sale){
                currentMax = sale;
                number = numberMax;
            }
        }
        return numberMax;
    }
}
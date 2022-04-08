package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double residue = amount;
        while (residue > 0) {
            residue = (residue + residue * percent / 100) - salary;
            year++;
        }

        return year;
    }
}

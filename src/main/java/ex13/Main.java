package ex13;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Main app = new Main();
        double principal = app.inputPrincipal();
        double interest = app.inputRate();
        int years = app.inputYears();
        int compound = app.inputComp();
        double amount = app.calculation(principal, interest, years, compound);
        app.printOutput(principal, interest, years, compound, amount);
    }

    public double inputPrincipal(){
        System.out.print("What is the principal amount? ");
        String string = input.next();
        return Double.parseDouble(string);
    }

    public double inputRate(){
        System.out.print("What is the rate? ");
        String string = input.next();
        return Double.parseDouble(string);
    }

    public int inputYears(){
        System.out.print("What is the number of years? ");
        String string = input.next();
        return Integer.parseInt(string);
    }

    public int inputComp(){
        System.out.print("What is the number of times the interest is compounded per year? ");
        String string = input.next();
        return Integer.parseInt(string);
    }

    public double calculation(double principal, double interest, int years, int compound){
        double rate = interest / 100;
        return principal * Math.pow(1 + (rate / compound), compound * years);
    }

    public void printOutput(double principal, double interest, int years, int compound, double amount){
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f.", principal, interest, years, compound, amount);
    }
}
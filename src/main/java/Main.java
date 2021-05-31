import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Input input = new Input();
        input.main();
        Calculation calc = new Calculation();
        calc.main(input.principal, input.interest, input.years, input.compound);

        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f.", input.principal, input.interest, input.years, input.compound, calc.amount);
    }
}

class Input{
    double principal;
    float interest;
    int years;
    int compound;

    public void main(){
        System.out.print("What is the principal amount? ");
        Scanner input1 = new Scanner(System.in);
        String string1 = input1.next();
        this.principal = Double.parseDouble(string1);

        System.out.print("What is the rate? ");
        Scanner input2 = new Scanner(System.in);
        String string2 = input2.next();
        this.interest = Float.parseFloat(string2);

        System.out.print("What is the number of years? ");
        Scanner input3 = new Scanner(System.in);
        String string3 = input3.next();
        this.years = Integer.parseInt(string3);

        System.out.print("What is the number of times the interest is compounded per year? ");
        Scanner input4 = new Scanner(System.in);
        String string4 = input4.next();
        this.compound = Integer.parseInt(string4);
    }
}

class Calculation{
    double amount;

    public void main(double principal, float interest, int years, int compound){

        double rate = interest / 100;
        this.amount = principal * Math.pow(1 + (rate / compound), compound * years);
    }
}

package day6; // If it's inside your day 6 folder

class Calculator {
    int num1;
    int num2;

    int add() {
        System.out.println("Addition");
        System.out.println(num1 + num2);
        return 5;
    }
}

public class basic {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.num1 = 10;
        calc.num2 = 20;
        calc.add();
    }
}

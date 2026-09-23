package day6;


public class calculator {
    int add(int n1,int n2){
        return n1+n2;

    }
    int sub(int num1,int num2){
        return num1-num2;

    }
    int mul(int num1,int num2){
        return num1*num2;
    }
    double div(int num1,int num2){
        return num1/num2;

    }
    static void main() {

        calculator c1 =new calculator();

        System.out.println(c1.add(1,3));
        System.out.println(c1.sub(2,1));
        System.out.println(c1.mul(3,4));
        System.out.println((c1.div(4,5)));



    }

}

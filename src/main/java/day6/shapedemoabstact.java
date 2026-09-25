package day6;

abstract class shape{
    abstract double area();
    void display(){
        System.out.println("abstract calll");
    }
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }

    @Override
    double area() {
        System.out.println("area of circle is:");
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    double l;
    double b;

    rectangle(double l,double b){
        this.b=b;
        this.l=l;
        System.out.println();
    }
    @Override
    double area() {
        return l*b;
    }
}
public class shapedemoabstact {
    static void main() {
        shape s1 = new circle(5);
        shape s2 = new rectangle(10, 5);
        s1.display();
        System.out.println(s1.area());

        s2.display();
        System.out.println(s2.area());
        System.out.println();

    }
}

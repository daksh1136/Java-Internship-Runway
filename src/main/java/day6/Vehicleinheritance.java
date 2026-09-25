package day6;
class vehicle{
    String brand;
    Double speed;
    void info(){
        System.out.println(speed);
        System.out.println(brand);
    }
}
class car extends vehicle{

    int noofdoors;
    car(String name,double speed,int hasnoofdoor){
        this.speed=speed;
        this.brand=name;
        this.noofdoors=hasnoofdoor;
    }

    @Override
    void info() {
        System.out.println(brand);
        System.out.println(speed);
        System.out.println(noofdoors);
    }
}
class bike extends vehicle{
    boolean hasgear;
    void info(){
        System.out.println(brand);
        System.out.println(speed);
        System.out.println(hasgear);
    }
}
public class Vehicleinheritance {
    static void main(String[]args) {
        car c1=new car("bmw",333,3);
        c1.info();
        vehicle c3=new bike();




    }

}

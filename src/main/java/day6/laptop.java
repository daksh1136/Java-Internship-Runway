package day6;
class Laptops{
    String brand;
    String processor;
    String ram;
    Laptops(String brand, String ram,String processor){
        System.out.println("this is your laptop");
        this.ram=ram;
        this.brand=brand;
        this.processor=processor;




    }
    void info(){
        System.out.println(" brand:"+brand);
        System.out.println("processor:"+processor);
        System.out.println(ram);

    }
}

public class laptop {
    static void main() {
        Laptops l1=new Laptops("hp","16","i3");
        l1.info();

    }
}

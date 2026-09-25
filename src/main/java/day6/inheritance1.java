package day6;
class employeee{
    String name;
    double salary;
     void info(){
         System.out.println(name);
         System.out.println(salary);

     }

}
class Developer extends employeee{
    String Programminglanguage;
    void info(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(Programminglanguage);

    }
}



public class inheritance1 {
    static void main(String[]args) {
        employeee e1=new employeee();
        e1.name="daksj";
        e1.salary=202020;
        System.out.println(e1.name +"     "+e1.salary);
        Developer e2 = new Developer();
        e2.name="daksj";
        e2.salary=202020;
        e2.Programminglanguage="java";
        System.out.println(e2.name + "   "+ e2.salary+"  "+e2.Programminglanguage);
        employeee e3=new Developer();
        e3.name="daksj";
        e3.salary=202020;
        System.out.println(e3.name + "   "+ e3.salary+"  ");





    }
}

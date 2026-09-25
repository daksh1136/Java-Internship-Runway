package day6;
interface  workable{
    void work();
}
abstract class employeeeee implements workable{
    private String name;
    private int id;
    private double salary;
    employeeeee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void details(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);


    }
}


class developer extends employeeeee{
    String Programming_language;
    developer(int id,String name,double salary,String Programming_language){
        super(id,name,salary);
        this.Programming_language=Programming_language;




    }
    public void work(){
        System.out.println("Developer working on"+Programming_language);

    }
}
class Manager extends employeeeee{
    int teamsize;
    Manager(int id,String name,double salary,int teamsize){


        super(id,name,salary);
        this.teamsize=teamsize;


    }
    public void work(){
        System.out.println(teamsize);
    }
    void details() {
        System.out.println(teamsize);
    }

}

public class employeemanagement {
    static void main() {
        employeeeee e1 =
                new developer(101, "daksh", 50000, "Java");

        employeeeee e2 =
                new Manager(1022, "raj", 70000, 5);

        e1.details();
        e1.work();

        System.out.println();

        e2.details();
        e2.work();



    }
}

package day6;

class students{
     String name;
    int rollno;
    students(String name,int rollno){
        System.out.println("welcome to Constructor");
        this.name=name;
        this.rollno=rollno;


    }
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

}
public class cinstructor {
    static void main() {
        students s1=new students("raj",2);
        s1.display();


    }
}

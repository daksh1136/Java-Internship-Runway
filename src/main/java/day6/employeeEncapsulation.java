package day6;
class employee{
    private int balance;
    private String owner;

    public void setbalance(int balance){
        if(balance>=0){
            this.balance=balance;

        }else{
            System.out.println("invaid balance input");
        }


    }
    public int getBalance(){
        return balance;
    }
    public void setOwner(String name){
        this.owner=name;


    }
    public String getowner(){
        return owner;
    }
}

public class employeeEncapsulation {
    static void main() {
        employee e2=new employee();
        e2.setOwner("daksh");
        e2.setbalance(3333);
        System.out.println(e2.getBalance());
        System.out.println(e2.getowner());
    }

}

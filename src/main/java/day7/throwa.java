package day7;
 class minorage extends Exception{
    public minorage(String str){
        super(str);
    }
}
public class throwa {
    public static void main(String[] args) {
        int age =15;
        try{
            System.out.println("age is "+age);
            if(age<18){
                throw new minorage("age is less than 18");
            }
        }catch(minorage e){
            System.out.println("Exception occured: "+e);
        }
        
    }
    
}

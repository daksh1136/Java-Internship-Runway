package day6;
interface notifications{
    void send(String message);
}

class emailnotifiations implements notifications{
    @Override
    public void send(String message) {
        System.out.println("email"+ message);
    }
}
class sms implements notifications{
    @Override
    public void send(String message) {
        System.out.println("sms"+message);
    }
}
public class notiificationInterferance {
    static void main() {


        notifications n1 = new emailnotifiations();
        notifications n2 = new sms();
        n1.send("from dakshsharma1136@gamil.com");
        n2.send("nwfbAM");

    }
}

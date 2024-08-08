import adapter.*;
import singleton.AClass;
import singleton.BClass;
import singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
//        AClass aClass = new AClass();
//        BClass bClass = new BClass();
//
//        SocketClient aClient = aClass.getSocketClient();
//        SocketClient bClient = bClass.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }

}
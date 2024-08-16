import adapter.*;
import aop.AopBrowser;
import proxy.Browser;
import proxy.BrowserProxy;
import proxy.IBrowser;
import singleton.AClass;
import singleton.BClass;
import singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
////        AClass aClass = new AClass();
////        BClass bClass = new BClass();
////
////        SocketClient aClient = aClass.getSocketClient();
////        SocketClient bClient = bClass.getSocketClient();
////
////        System.out.println("두개의 객체가 동일한가?");
////        System.out.println(aClient.equals(bClient));
//
//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
//
//        Electronic110V adapter = new SocketAdapter(cleaner);
//        connect(adapter);
//
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V airAdapter = new SocketAdapter(airConditioner);
//        connect(airAdapter);

//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
            System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
            long now = System.currentTimeMillis();
                    end.set(now - start.get());
        }
                );
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }

    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }

}
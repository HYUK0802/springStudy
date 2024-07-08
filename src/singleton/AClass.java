package singleton;

public class AClass {

    private SocketClient socketClient;

    public AClass() {
//        this.socketClient = SocketClient.getInstance();
        this.socketClient = new SocketClient();
    }
    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BankService());
        System.out.println("Service Web deployed on http://0.0.0.0:9191");
    }
}

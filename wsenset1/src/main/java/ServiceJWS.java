import jakarta.xml.ws.Endpoint;
import ws.BanqueService;


public class ServiceJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/", new BanqueService());
        System.out.println("Service started");
    }
}

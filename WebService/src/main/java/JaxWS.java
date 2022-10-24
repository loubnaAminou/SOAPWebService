import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class JaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8085/", new BanqueService());
        System.out.println("Service web deployé !!");
    }
}

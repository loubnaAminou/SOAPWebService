import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

// Programmmation Orientée Objet Distribuée
public class Client {
    public static void main(String[] args) {
        // stub : proxy
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        // => création d'un middleware
        System.out.println(stub.convert(456));

        Compte compte = stub.getCompte(5);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}

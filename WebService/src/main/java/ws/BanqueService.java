package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*9983, new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, Math.random()*9983, new Date()));
        comptes.add(new Compte(2, Math.random()*9983, new Date()));
        comptes.add(new Compte(3, Math.random()*9983, new Date()));
        return comptes;
    }
}

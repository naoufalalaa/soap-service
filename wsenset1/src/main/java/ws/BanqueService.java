package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam double montant) {
        return montant * 10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        return new Compte(code, Math.random() * 9000, new Date());
    }
    @WebMethod
    public List<Compte> listComptes() {
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1, Math.random() * 9000, new Date()));
        comptes.add(new Compte(2, Math.random() * 9000, new Date()));
        comptes.add(new Compte(3, Math.random() * 9000, new Date()));
        return comptes;
    }
}

import java.rmi.*;
import java.rmi.registry.*;
public class AdditionServer {
    public static void main(String[] args) {
        try {
// Créer une instance du serveur 
            AdditionImpl add = new AdditionImpl();
// Créer un registre RMI sur le port 1099 par défaut 
            Registry registry=LocateRegistry.createRegistry(1099);
// Enregistrer l'objet distant dans le registre  
            registry.rebind("Add", add);
            System.out.println("Serveur RMI prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
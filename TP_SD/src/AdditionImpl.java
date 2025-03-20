import java.rmi.*;
import java.rmi.server.*;
public class AdditionImpl extends UnicastRemoteObject implements
        Addition {
    public AdditionImpl() throws RemoteException {
        super();
    }
    // Implémentation de la méthode add
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}

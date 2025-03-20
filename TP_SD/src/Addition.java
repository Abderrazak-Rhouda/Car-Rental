import java.rmi.RemoteException;

public interface Addition {
    public int add(int a, int b) throws RemoteException;
}

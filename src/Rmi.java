


import java.rmi.Remote;

import java.rmi.RemoteException;

public interface Rmi extends Remote {

    String receiveMessage(String x) throws RemoteException;

}

package rmi;

import javax.swing.*;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Serializable, Remote {

    public JPanel getGuiPanel() throws RemoteException;
}

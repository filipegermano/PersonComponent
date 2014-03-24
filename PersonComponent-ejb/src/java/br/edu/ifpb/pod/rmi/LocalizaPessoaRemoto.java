package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.entidades.Pessoa;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author filipe
 */
public interface LocalizaPessoaRemoto extends Remote {

    public Pessoa recuperaPessoaEmail(String email) throws RemoteException;
}

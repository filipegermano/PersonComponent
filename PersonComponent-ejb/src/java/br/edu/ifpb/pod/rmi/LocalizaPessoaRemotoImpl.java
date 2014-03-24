package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.dao.PessoaDAO;
import br.edu.ifpb.pod.entidades.Pessoa;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author filipe
 */
@Stateless
@Local
public class LocalizaPessoaRemotoImpl extends UnicastRemoteObject implements LocalizaPessoaRemoto {

    @EJB
    PessoaDAO pessoaDAO;

    public LocalizaPessoaRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public Pessoa recuperaPessoaEmail(String email) throws RemoteException {
        return pessoaDAO.buscaPessoaPorEmail(email);

    }
}

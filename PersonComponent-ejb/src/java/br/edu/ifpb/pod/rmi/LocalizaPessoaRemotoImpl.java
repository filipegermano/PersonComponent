package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.dao.PessoaDAO;
import br.edu.ifpb.pod.entidades.Pessoa;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
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
public class LocalizaPessoaRemotoImpl extends RemoteObject implements LocalizaPessoaRemoto {

    @EJB
    PessoaDAO pessoaDAO;

    @Override
    public Pessoa recuperaPessoaEmail(String email) throws RemoteException {
        try {
            LocalizaPessoaRemoto localizaPessoaRemoto = new LocalizaPessoaRemotoImpl();
            Naming.rebind("rmi://localhost:9999/BuscaPessoaEmail", localizaPessoaRemoto);
            return pessoaDAO.buscaPessoaPorEmail(email);
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(LocalizaPessoaRemotoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

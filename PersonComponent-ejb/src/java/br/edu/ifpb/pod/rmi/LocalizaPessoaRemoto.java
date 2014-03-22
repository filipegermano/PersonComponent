package br.edu.ifpb.pod.rmi;

import br.edu.ifpb.pod.entidades.Pessoa;
import java.rmi.Remote;

/**
 *
 * @author filipe
 */
public interface LocalizaPessoaRemoto extends Remote {

    public Pessoa recuperaPessoaEmail(String email);
}

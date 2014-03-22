package br.edu.ifpb.pod.dao;

import br.edu.ifpb.pod.entidades.Pessoa;
import javax.ejb.Local;

/**
 *
 * @author filipe
 */
@Local
public interface PessoaDAO {

    public void cadastraPessoa(Pessoa pessoa);

    public void alteraPessoa(Pessoa pessoa);

    public void removePessoa(Pessoa pessoa);

    public Pessoa buscaPessoaEmail(String email);
}

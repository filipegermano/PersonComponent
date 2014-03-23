package br.edu.ifpb.pod.dao;

import br.edu.ifpb.pod.entidades.Pessoa;
import java.util.List;
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

    public List<Pessoa> buscaPessoaEmail(String email);
    
    public Pessoa buscaPessoaPorEmail(String email);
    
    public List<Pessoa> buscaPessoas();
    
    public Pessoa buscaPessoasPorId(Long id);
}

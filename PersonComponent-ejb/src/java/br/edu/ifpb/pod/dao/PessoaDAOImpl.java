package br.edu.ifpb.pod.dao;

import br.edu.ifpb.pod.entidades.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author filipe
 */
@Stateless
public class PessoaDAOImpl implements PessoaDAO {

    @PersistenceContext(name = "POD-PU")
    private EntityManager manager;

    @Override
    public void cadastraPessoa(Pessoa pessoa) {
        manager.persist(pessoa);
    }

    @Override
    public void alteraPessoa(Pessoa pessoa) {
        manager.merge(pessoa);
    }

    @Override
    public void removePessoa(Pessoa pessoa) {
        manager.remove(pessoa);
    }

    @Override
    public Pessoa buscaPessoaEmail(String email) {
        try {
            Query query = manager.createQuery("select p from Pessoa p where p.email=:email");
            query.setParameter("email", email);
            return (Pessoa) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}

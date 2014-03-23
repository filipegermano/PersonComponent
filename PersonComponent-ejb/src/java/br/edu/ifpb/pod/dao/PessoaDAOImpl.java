package br.edu.ifpb.pod.dao;

import br.edu.ifpb.pod.entidades.Pessoa;
import java.util.List;
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

        if (pessoa.getId() == null) {
            manager.persist(pessoa);
        } else {
            manager.merge(pessoa);
        }

    }

    @Override
    public void alteraPessoa(Pessoa pessoa) {
        manager.merge(pessoa);
    }

    @Override
    public void removePessoa(Pessoa pessoa) {
        pessoa = manager.merge(pessoa);
        manager.remove(pessoa);
    }

    @Override
    public List<Pessoa> buscaPessoaEmail(String email) {
        try {
            Query query = manager.createQuery("select p from Pessoa p where p.email=:email");
            query.setParameter("email", email);
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Pessoa> buscaPessoas() {
        try {
            Query query = manager.createQuery("select p from Pessoa p");
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Pessoa buscaPessoasPorId(Long id) {
//        Pessoa pessoa = new Pessoa();
//        pessoa = manager.find(Pessoa.class, id);
//        return pessoa;
        return manager.find(Pessoa.class, id);
    }

    @Override
    public Pessoa buscaPessoaPorEmail(String email) {
        try {
            Query query = manager.createQuery("select p from Pessoa p where p.email=:email");
            query.setParameter("email", email);
            return (Pessoa) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}

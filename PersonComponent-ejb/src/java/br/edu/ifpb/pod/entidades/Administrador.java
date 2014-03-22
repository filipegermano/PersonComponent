package br.edu.ifpb.pod.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author filipe
 */
@Entity
public class Administrador implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_administrador" ,strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_administrador", allocationSize = 1)
    private Integer id;
    @Column(length = 20, nullable = false, unique = true)
    private String login;
    @Column(length = 10, nullable = false, unique = true)
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

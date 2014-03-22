package br.edu.ifpb.pod.entidades;

import java.io.ByteArrayInputStream;
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
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(generator = "seq_pessoa" ,strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_pessoa", allocationSize = 1)
    private Long id;
    @Column(length = 80, nullable = false)
    private String nome;
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;
    @Column(length = 80, nullable = false, unique = true)
    private String email;
    private String token;
    private ByteArrayInputStream[] fotos1;
    private ByteArrayInputStream[] fotos2;
    private ByteArrayInputStream[] fotos3;
    private ByteArrayInputStream[] fotos4;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ByteArrayInputStream[] getFotos1() {
        return fotos1;
    }

    public void setFotos1(ByteArrayInputStream[] fotos1) {
        this.fotos1 = fotos1;
    }

    public ByteArrayInputStream[] getFotos2() {
        return fotos2;
    }

    public void setFotos2(ByteArrayInputStream[] fotos2) {
        this.fotos2 = fotos2;
    }

    public ByteArrayInputStream[] getFotos3() {
        return fotos3;
    }

    public void setFotos3(ByteArrayInputStream[] fotos3) {
        this.fotos3 = fotos3;
    }

    public ByteArrayInputStream[] getFotos4() {
        return fotos4;
    }

    public void setFotos4(ByteArrayInputStream[] fotos4) {
        this.fotos4 = fotos4;
    }
}

package com.sat.apisat.entidade;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Number telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = true)
    private Number cpf;
    @Column(nullable = true)
    private Number cnpj;
  
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Number getTelefone() {
        return telefone;
    }
    public void setTelefone(Number telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Number getCpf() {
        return cpf;
    }
    public void setCpf(Number cpf) {
        this.cpf = cpf;
    }
    public Number getCnpj() {
        return cnpj;
    }
    public void setCnpj(Number cnpj) {
        this.cnpj = cnpj;
    }
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return id == other.id;
	}
    
    
    
}

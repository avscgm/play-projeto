package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model {

	public String nome;
	public int cpf;
	public int idade;
	public String sexo;
	public String endereco; 
}

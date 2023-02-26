package br.com.pessoa.model;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String senha;
	private int matricula;
	private Date dataInicio;


	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public String toString() {
		return "Funcionario [  nome=" + super.getNome() + " idade=" + super.getIdade() + " cpf=" + super.getCpf() + " senha=" + senha + ", matricula=" + matricula + ", dataInicio=" + dataInicio + "]";
	}

}

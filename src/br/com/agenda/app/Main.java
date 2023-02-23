package br.com.agenda.app;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		/*Contato contato = new Contato();
		contato.setNome("");
	    contato.setIdade(24);
	    contato.setDataCadastro(new Date());*/
	    
	    //contatoDAO.save(contato);

		for (Contato c: contatoDAO.getContatos()) {

			System.out.println(c.getNome());
		}
	}

}

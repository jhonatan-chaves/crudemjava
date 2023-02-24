package br.com.agenda.app;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("freeza");
	    contato.setIdade(26);
	    contato.setDataCadastro(new Date());
	    
	   // contatoDAO.save(contato);
	    
	    Contato contatoATL = new Contato();
	    
	    contatoATL.setNome("jhonatan chaves silva ribeiro");
	    contatoATL.setIdade(26);
	    contatoATL.setDataCadastro(new Date());
	    
	    contatoATL.setId(6);
	    
	    contatoDAO.update(contatoATL);

		for (Contato c: contatoDAO.getContatos()) {

			System.out.println(c.getNome());
		}
	}

}

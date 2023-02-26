package br.com.agenda.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;
import br.com.pessoa.model.Funcionario;
import br.com.pessoa.model.Pessoa;

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
	    
	   // contatoDAO.update(contatoATL);

	    Contato contatoDel = new Contato();
	   // contatoDAO.deleteById(4);
	    
	    
	    
	    
		/*for (Contato c: contatoDAO.getContatos()) {

			System.out.println(c.getNome());
			
		}*/
	    
	   SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	   Calendar calendario = Calendar.getInstance();
	   System.out.println(formatadorData.format(calendario.getTime()));
	   
	   
	   
	   Funcionario f1 = new Funcionario();
	   
	   f1.setNome("jhonatan chaves");
	   f1.setMatricula(524781);
	   f1.setSenha("@224488");
	   
	    
	    Pessoa pessoa1 = new Pessoa();
	 
	    
	    System.out.println(f1.getSenha());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}


}

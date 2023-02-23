package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {

	/**
	 * crud c: created r: read u: update d: delete
	 **/
	public void save(Contato contato) {
		String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

			int adiciona = pstm.executeUpdate();
			if (adiciona > 0) {
				System.out.println("adicionado com sucesso");
			} else {
				System.out.println("ocorreu um erro ao adicionar o conato no banco de dados");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

	public List<Contato> getContatos()  {
		String sql = "SELECT * FROM contatos";

		List<Contato> contatos = new ArrayList<Contato>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {

			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = (PreparedStatement) conn.prepareCall(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Contato contato = new Contato();

				contato.setId(rset.getInt("id"));

				contato.setNome(rset.getString("nome"));

				contato.setIdade(rset.getInt("idade"));

				contato.setDataCadastro(rset.getDate("dataCadastro"));

				contatos.add(contato);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if (rset != null) {
				rset.close();
			}
			if(conn != null) {
				conn.close();
			}
			if(pstm != null) {
				pstm.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		return contatos;

	}

}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cidade;

public class CidadeDao implements DaoBase<Cidade> {
	
	private DataSource dataSource;
	
	public CidadeDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public void create(Cidade object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cidade object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cidade object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cidade> read() {
		try {
			
			List<Cidade> resultado = new ArrayList<Cidade>();
			
			String sql = "SELECT ID, CIDADE, ESTADO, SIGLAESTADO, PAIS "
					+ "FROM T_CIDADE tc ";
			
			PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
			
			ResultSet rs =  stm.executeQuery();
			
			while(rs.next()) {
				Cidade cidade = new Cidade();
				cidade.setId(rs.getInt("ID"));
				cidade.setCidade(rs.getString("CIDADE"));
				cidade.setEstado(rs.getString("ESTADO"));
				cidade.setSiglaEstado(rs.getString("SIGLAESTADO"));
				cidade.setPais(rs.getString("PAIS"));
				
				resultado.add(cidade);
			}
			
			
			return resultado;
			
			
		}catch (Exception e) {
			System.out.println("ERRO AO LISTAR CIDADES: " + e.getMessage());
			return null;
		}
	}

}

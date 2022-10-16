package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.List;

import model.Cidade;
import model.Usuario;

public class UsuarioDao implements DaoBase<Usuario> {
	
	private DataSource dataSource;
	
	public UsuarioDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public void create(Usuario object) {
		try {
			String sql = "INSERT INTO T_USUARIO "
					+ " (NIVEL, GENERO, EMAIL, SENHA, NOME, FOTO, ID_CIDADE, DT_NASCIMENTO) "
					+ " VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
			stm.setString(1, object.getNivel());
			stm.setString(2, object.getGenero());
			stm.setString(3, object.getEmail());
			stm.setString(4, object.getSenha());
			stm.setString(5, object.getNome());
			stm.setString(6, object.getFoto());
			stm.setInt(7, object.getCidade().getId());
			stm.setString(8, object.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/YYY")));
			
			int res = stm.executeUpdate();
			if (res != 0) {
				System.out.println("Usuario criado com sucesso");
			} else {
				throw new RuntimeException("Erro ao atualizar usuario ");
			}
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("UsuarioDAO.create = " + ex.getMessage());
		}

		
	}

	@Override
	public void update(Usuario object) {
		//CONECTO COM O BD
		//EXECUTO COMANDO SQL
		//DESCONECTO COM O BD
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> read() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario getByEmailSenha(String email, String senha) {
		try {
			
			String sql = "SELECT  * "
						+ "FROM T_USUARIO tu "
						+ "INNER JOIN T_CIDADE tc  ON tu.ID_CIDADE  = tc.ID "
						+ "WHERE tu.EMAIL  = ? "
						+ "AND tu.SENHA  = ? ";
			
			
			PreparedStatement stm = dataSource.getConnection().prepareStatement(sql);
			stm.setString(1, email);
			stm.setString(2, senha);
			
			ResultSet rs =  stm.executeQuery();
			if(rs.next()) {

				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("ID"));
				usuario.setNome(rs.getString("NOME"));
				usuario.setNivel(rs.getString("NIVEL"));
				usuario.setGenero(rs.getString("GENERO"));
				usuario.setEmail(rs.getString("EMAIL"));
				usuario.setSenha(rs.getString("SENHA"));
				usuario.setFoto(rs.getString("FOTO"));
				usuario.setNascimento(rs.getDate("DT_NASCIMENTO").toLocalDate());
				
				Cidade cidade = new Cidade();
				cidade.setId(rs.getInt("ID_CIDADE"));
				cidade.setCidade(rs.getString("CIDADE"));
				cidade.setEstado(rs.getString("ESTADO"));
				cidade.setSiglaEstado(rs.getString("SIGLAESTADO"));
				cidade.setPais(rs.getString("PAIS"));
				
				usuario.setCidade(cidade);
				
				return usuario;
					
				
			}else {
				return null;
			}
			
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("UsuarioDAO.GETBYEMAILSENHA = " + ex.getMessage());
			return null;
		}
	}

	

}

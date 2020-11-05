package br.com.itaumon.dao;

import br.com.itaumon.beans.Usuario;

public interface UsuarioDAO {
	
	public Usuario findByEmailAndSenha(String email, String senha);

}

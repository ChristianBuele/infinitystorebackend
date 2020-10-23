package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
}

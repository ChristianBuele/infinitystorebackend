package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Categoria;

public interface CategoriaRespositorio extends JpaRepository<Categoria, Integer> {

}

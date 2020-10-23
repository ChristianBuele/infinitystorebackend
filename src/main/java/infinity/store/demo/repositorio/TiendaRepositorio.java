package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Tienda;

public interface TiendaRepositorio extends JpaRepository<Tienda, Integer>{

}

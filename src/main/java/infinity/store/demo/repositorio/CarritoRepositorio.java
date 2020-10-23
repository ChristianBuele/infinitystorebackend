package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import infinity.store.demo.modelo.Carrito;

public interface CarritoRepositorio extends JpaRepository<Carrito, Integer> {

}

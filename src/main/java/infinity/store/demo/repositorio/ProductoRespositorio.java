package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Producto;

public interface ProductoRespositorio extends JpaRepository<Producto, Integer> {

}

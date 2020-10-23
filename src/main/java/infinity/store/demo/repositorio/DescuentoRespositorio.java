package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Descuento;

public interface DescuentoRespositorio extends JpaRepository<Descuento, Integer>{

}

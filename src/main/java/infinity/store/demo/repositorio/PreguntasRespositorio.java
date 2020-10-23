package infinity.store.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import infinity.store.demo.modelo.Preguntas;

public interface PreguntasRespositorio extends JpaRepository<Preguntas, Integer>{

}

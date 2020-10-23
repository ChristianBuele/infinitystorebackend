package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_administrador")
	private int id;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contrasenia")
	private String contrasenia;
	
	@OneToMany(mappedBy = "administrador")
	private Set<Tienda> tiendas;
}

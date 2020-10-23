package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="subcategoria")
public class Subcategoria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_subcategoria")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
	private Categoria categoria;
	
	@OneToMany(mappedBy = "subcategoria")
	private Set<Producto> productos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

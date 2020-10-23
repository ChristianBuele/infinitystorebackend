package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name="categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_categoria")
	private int id;
	@Column(name="nombre_categoria")
	private String nombre;
	@OneToMany(mappedBy = "categoria")
	private Set<Tienda> tiendas;
	
	@OneToMany(mappedBy = "categoria")
	private Set<Subcategoria> subcategorias;

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

	public Set<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(Set<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public Set<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(Set<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
	
}

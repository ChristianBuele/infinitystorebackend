package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="carrito")
public class Carrito {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_carrito")
	private int id;
	@Column(name = "precio_carrito")
	private int precio;
	@ManyToOne
    @JoinColumn(name = "id_usuario_carrito", nullable = false)
    private Usuario usuario;
	
	@ManyToMany(mappedBy = "carritos", fetch = FetchType.LAZY)
    private Set<Producto> productos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}	

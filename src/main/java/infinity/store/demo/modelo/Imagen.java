package infinity.store.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name="imagen")
public class Imagen {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_imagen")
	private int id;
	@Column(name="imagen")
	private String imagen;
	@ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}

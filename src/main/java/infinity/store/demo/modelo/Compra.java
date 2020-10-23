package infinity.store.demo.modelo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="compra")
public class Compra {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_compra")
	private int id;
	@Column(name="precio_compra")
	private double precio;
	@Column(name="fecha_compra")
	private Date fecha;
	@ManyToMany(mappedBy = "compras", fetch = FetchType.LAZY)
    private Set<Usuario> usuarios;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}

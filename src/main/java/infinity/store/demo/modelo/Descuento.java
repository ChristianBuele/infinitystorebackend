package infinity.store.demo.modelo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "descuento")
public class Descuento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_descuento")
	private int id;
	@Column(name="valor_descuento")
	private double valor;
	@Column(name="fecha_descuento")
	private Date fecha;
	
	@OneToMany(mappedBy = "descuento")
	private Set<Producto> productos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}

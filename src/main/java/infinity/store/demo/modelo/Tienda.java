package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tienda")
public class Tienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_tienda")
	private int id;
	@Column(name="nombre_tienda")
	private String nombre;
	@Column(name="portada_producto")
	private String portada;
	@Column(name="descripcion_tienda")
	private String descricion;
	@Column(name="num_ventas_tienda")
	private int num_ventas;
	@Column(name="telefono")
	private String numero;
	@Column(name="facebbok")
	private String facebook;
	@Column(name="instagram")
	private String instagram;
	@OneToMany(mappedBy = "tienda")
	private Set<ComentarioTienda> comentarios;
	
	@OneToMany(mappedBy = "tienda")
	private Set<Producto> productos;
	
	@ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
	
	@ManyToOne
    @JoinColumn(name = "id_administrador", nullable = false)
    private Administrador administrador;
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
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public String getDescricion() {
		return descricion;
	}
	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}
	public int getNum_ventas() {
		return num_ventas;
	}
	public void setNum_ventas(int num_ventas) {
		this.num_ventas = num_ventas;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Set<ComentarioTienda> getComentarios() {
		return comentarios;
	}
	public void setComentarios(Set<ComentarioTienda> comentarios) {
		this.comentarios = comentarios;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	

}

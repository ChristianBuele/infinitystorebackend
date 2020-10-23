package infinity.store.demo.modelo;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_producto")
	private int id;
	@Column(name="nombre_producto")
	private String nombre;
	@Column(name="precio_producto")
	private double precio;
	@Column(name="estrellas_producto")
	private int estrellas;
	@Column(name="portada")
	private String portada;
	@Column(name="fecha_producto")
	private Date fecha;
//	@ManyToOne
//    @JoinColumn(name = "id_tienda", nullable = false)
//	private Producto producto;
	
	@ManyToOne
    @JoinColumn(name = "id_descuento", nullable = true)
	private Descuento descuento;
	
	
	@ManyToOne
    @JoinColumn(name = "id_subcategoria", nullable = true)
	private Subcategoria subcategoria;
	
	@ManyToOne
    @JoinColumn(name = "id_tienda", nullable = true)
	private Tienda tienda;
	
	@OneToMany(mappedBy = "producto")
	private Set<Preguntas> preguntas;
	
	@ManyToMany(mappedBy = "productos", fetch = FetchType.LAZY)
    private Set<Usuario> usuarios;
	
	@ManyToMany
	@JoinTable(name="producto_carrito",joinColumns =@JoinColumn(name="id_producto"),inverseJoinColumns = @JoinColumn(name="id_carrito") )
	private Set<Carrito> carritos;
	
	@OneToMany(mappedBy = "producto")
	private Set<Imagen> imagenes;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public Descuento getDescuento() {
		return descuento;
	}
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	public Subcategoria getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public Set<Preguntas> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(Set<Preguntas> preguntas) {
		this.preguntas = preguntas;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Set<Carrito> getCarritos() {
		return carritos;
	}
	public void setCarritos(Set<Carrito> carritos) {
		this.carritos = carritos;
	}
	public Set<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(Set<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
	
	
}

package infinity.store.demo.modelo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_usuario")
	private int id;
	@Column(name="nombre_usuario")
	private String nombre;
	@Column(name="apellido_usuario")
	private String apellido;
	@Column(name="correo_usuario")
	private String correo;
	@Column(name="contrasenia_usuario")
	private String contrasenia;
	@Column(name="telefono_usuario")
	private String telefono;
	
	//muchos a muchos en deseos
	@ManyToMany
	@JoinTable(name="usuario_producto",joinColumns =@JoinColumn(name="id_usuario"),inverseJoinColumns = @JoinColumn(name="id_producto") )
	private Set<Producto> productos;
	
	@ManyToMany
	@JoinTable(name="usuario_compra",joinColumns =@JoinColumn(name="id_usuario"),inverseJoinColumns = @JoinColumn(name="id_compra") )
	private Set<Compra> compras;
	
	@OneToMany(mappedBy = "usuario")
	private Set<Carrito> carritos;
	
	@OneToMany(mappedBy = "usuario")
	private Set<Preguntas> preguntas;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	public Set<Carrito> getCarritos() {
		return carritos;
	}
	public void setCarritos(Set<Carrito> carritos) {
		this.carritos = carritos;
	}
	

//	
	
	
}

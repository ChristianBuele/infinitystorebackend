package infinity.store.demo.modelo;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="pregunta")
public class Preguntas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_pregunta")
	private int id;
	@Column(name="pregunta_pregunta")
	private String pregunta;
	@Column(name="repuesta_pregunta")
	private String respuesta;
	@Column(name="fecha_pregunta")
	private Date fecha;
	
	@ManyToOne
    @JoinColumn(name = "id_producto", nullable = true)
	private Producto producto;
	@ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
	private Usuario usuario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}

package infinity.store.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name="comentario_tienda")
public class ComentarioTienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_comentario")
	private int id;
	@Column(name="comentario_tienda")
	private String comentario;
	
	@ManyToOne
    @JoinColumn(name = "id_tienda", nullable = false)
	private Tienda tienda;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}

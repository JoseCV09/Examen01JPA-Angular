package pe.edu.upeu.examen.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCATEGORIA")
	private Long idcategoria;
	
	@Column(name = "NOMBRE_CAT")
	private String nombre_cat;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL )
	private List<Producto> productos = new ArrayList<>();

	public Long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre_cat() {
		return nombre_cat;
	}

	public void setNombre_cat(String nombre_cat) {
		this.nombre_cat = nombre_cat;
	}
	
}

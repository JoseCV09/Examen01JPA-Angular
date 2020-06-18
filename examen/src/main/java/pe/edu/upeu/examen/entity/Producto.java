package pe.edu.upeu.examen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idproducto;
	
	@Column(name = "NOMBRE_PROD")
	private String nombre_prod;
	@Column(name = "PRECIO")
	private double precio;
	@Column(name = "CANTIDAD")
	private int cantidad;
	@ManyToOne()
	@JoinColumn(name = "IDCATEGORIA")
	private Categoria categoria;

	public Long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre_prod() {
		return nombre_prod;
	}

	public void setNombre_prod(String nombre_prod) {
		this.nombre_prod = nombre_prod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}

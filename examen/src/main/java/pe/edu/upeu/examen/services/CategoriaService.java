package pe.edu.upeu.examen.services;

import java.util.List;

import pe.edu.upeu.examen.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcategoria);
	public Categoria save(Categoria categoria);
	public void deleteById(Long idcategoria);
	public Categoria update(Categoria categoria);
	
	
}

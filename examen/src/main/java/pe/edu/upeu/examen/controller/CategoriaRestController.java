package pe.edu.upeu.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.examen.entity.Categoria;
import pe.edu.upeu.examen.services.CategoriaService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/examen")
public class CategoriaRestController {
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	@GetMapping("categoria/{id}")
	public Categoria read(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	@DeleteMapping("/categoria/eliminar/{id}")
	public void delete(@PathVariable("id") Long id) {
		categoriaService.deleteById(id);	
	}
	@PutMapping("/categoria/modificar/{id}")
	public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
		Categoria actual_Categoria = categoriaService.findById(id);
		actual_Categoria.setNombre_cat(categoria.getNombre_cat());
		return categoriaService.save(actual_Categoria);
	}
}


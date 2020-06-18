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

import pe.edu.upeu.examen.entity.Producto;
import pe.edu.upeu.examen.services.ProductoService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/examen")
public class ProductoRestController {
	@Autowired
	private ProductoService productoService;
	@GetMapping("/producto")
	public List<Producto> readAll(){
		return productoService.findAll();
	}
	@GetMapping("/producto/{id}")
	public Producto read(@PathVariable Long id) {
		return productoService.findById(id);
	}
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	@DeleteMapping("/producto/eliminar/{id}")
	public void delete(@PathVariable("id") Long id) {
		productoService.deleteById(id);	
	}
	@PutMapping("/producto/modificar/{id}")
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto actual_Producto = productoService.findById(id);
		actual_Producto.setNombre_prod(producto.getNombre_prod());
		actual_Producto.setPrecio(producto.getPrecio());
		actual_Producto.setCantidad(producto.getCantidad());
		actual_Producto.setCategoria(producto.getCategoria());
		return productoService.save(actual_Producto);
	}
}







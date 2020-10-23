package infinity.store.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import infinity.store.demo.modelo.Carrito;
import infinity.store.demo.modelo.Usuario;
import infinity.store.demo.repositorio.CarritoRepositorio;
import infinity.store.demo.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/infinity")
public class UsuarioControlador {
	@Autowired
	UsuarioRepositorio usuarioRepo;
	@Autowired
	CarritoRepositorio carritoRepo;
	 
	//gets posts puts deletes
	/* Carrito*/
	@GetMapping("/carrito")
	public Iterable<Carrito> getAll(){
		return carritoRepo.findAll();
	}
	@GetMapping("/carrito/{id}")
	public Carrito getById(@PathVariable(value="id") Integer id) {
		return carritoRepo.findById(id).orElseGet(()->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Carrito no encontrado");
		});
	}
	@PostMapping("/carrito")
	public Carrito addCarrito(@RequestBody Carrito carrito) {
		return carritoRepo.save(carrito);
	}
	@PutMapping("/carrito")
	public Carrito actualizarCarrito(@RequestBody Carrito carrito) {
		Usuario usuario=usuarioRepo.findById(carrito.getUsuario().getId()).orElseGet(()->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuario no disponible");
		});
		carrito.setUsuario(usuario);
		return carritoRepo.save(carrito);
	}
	
	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		System.out.println("Llega un usuario con correo "+usuario.getCorreo());
		return usuarioRepo.save(usuario);
	}
	
	
	
	
	
	/*fin carrito*/
	/*Usuarios*/
	@GetMapping("/usuario")
	public Iterable<Usuario> getAllUsuarios(){
		return usuarioRepo.findAll();
	}
	@GetMapping("/usuario/{id}")
	public Usuario getUsuarioById(@PathVariable(value="id") Integer id) {
		return usuarioRepo.findById(id).orElseGet(()->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuario no encontrado");
		});
	}
	
	//posts
	
	@PostMapping
	public Carrito guardar(@RequestBody Carrito carrito) {
		System.out.println("el ide del usuario es "+carrito.getUsuario().getId());
		Usuario usuario=usuarioRepo.findById(carrito.getUsuario().getId()).orElseGet(()->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario Incorrecto");
		});
		carrito.setUsuario(usuario);
		return carritoRepo.save(carrito);
	}
	
	//puts
	
	
	//deletes
}

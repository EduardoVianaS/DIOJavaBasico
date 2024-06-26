package eduardoviana.WEBAPIEDUARDO.Controller;


import eduardoviana.WEBAPIEDUARDO.Model.Usuario;
import eduardoviana.WEBAPIEDUARDO.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users/{username}")
    public List<Usuario>getUsers(){
       return repository.listAll();
    }


    public Usuario getOne(@PathVariable("username") String username){
        return repository.finByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }

   /* @GetMapping("/users/{username}")
    public Usuario procurarUsername(@PathVariable("username") String username){
        return repository.findAll(username);
    }*/
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }




}
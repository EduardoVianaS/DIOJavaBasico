package eduardoviana.WEBAPIEDUARDO.Repository;
import eduardoviana.WEBAPIEDUARDO.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {


    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Eduardo","password"));
        //usuarios.add(new Usuario("Viana Eduardo","masterpass"));
        System.out.print(usuarios);
        return usuarios;
    }

    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
       // System.out.print(listAll());

    }

    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario();

    }

    public Usuario finByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o id: %d para localizar um usuário", username));
        return new Usuario("gleyson","password");
    }

    /*public  Usuario findAll(String username){
        System.out.println(String.format("FIND/username - Recebendo o id: %d para localizar um usuário", username));
        return (new Usuario());
    }*/
}

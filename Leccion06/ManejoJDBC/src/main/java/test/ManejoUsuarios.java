package test;

import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC();
        
        //Ejecutnado el listado de usuarios
        List<UsuarioDTO> usuarios =  usuarioJdbc.select();
        
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        }); //insertar un nuevo registro
//        UsuarioDTO usuario = new UsuarioDTO("carlos.juarez","123");
//        usuarioJdbc.insertar(usuario);
        //modificar usuario existente
//        UsuarioDTO usuario = new UsuarioDTO(3, "carlos.juarez", "456");
//        usuarioJdbc.actualizar(usuario);
//          usuarioJdbc.eliminar(new UsuarioDTO(3));

    }
}

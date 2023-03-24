package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutnado el listado de usuarios
        List<Usuario> usuarios =  usuarioJdbc.seleccionar();
        for (Usuario usuario : usuarios) {
            System.out.println("usuario = " + usuario);
        }
        
        //insertar un nuevo registro
//        Usuario usuario = new Usuario("carlos.juarez","123");
//        usuarioJdbc.insertar(usuario);
        
        //modificar usuario existente
//        Usuario usuario = new Usuario(3, "carlos.juarez", "456");
//        usuarioJdbc.actualizar(usuario);

          usuarioJdbc.eliminar(new Usuario(3));

    }
}

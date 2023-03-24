package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            //manejamos el tipo interface
            //para separar las capas y responsabilidades
            //son las mejores practicas para nuestra 
            //capa de datos
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas = personaDao.select();
            
            for (PersonaDTO persona : personas) {
                System.out.println("Persona DTO = " + persona);
            }
            

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}

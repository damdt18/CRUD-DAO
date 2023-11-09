
package com.mycompany.funcionarios;

import controller.FuncionarioController;
import domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppFuncionarios {
    
    public static void crear(FuncionarioController funcionarioController) {
        
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el numero de Identificacion");
            String numero_identificacion = sc.nextLine();
            System.out.println("El numero de identificacion es = " + numero_identificacion);
            System.out.println("_________________________________ ");

            System.out.println("Digite el Nombre");
            String nombres = sc.nextLine();
            System.out.println("El nombre es = " + nombres);
            System.out.println("_________________________________ ");

            System.out.println("Digite el Apellido");
            String apellidos = sc.nextLine();
            System.out.println("El apellido es = " + apellidos);
            System.out.println("_________________________________ ");

            System.out.println("Digite el Genero");
            String genero = sc.nextLine();
            System.out.println("El genero es = " + genero);
            System.out.println("_________________________________ ");

            System.out.println("Digite la Direccion");
            String direccion = sc.nextLine();
            System.out.println("La direccion es = " + direccion);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite el Telefono");
            String telefono = sc.nextLine();
            System.out.println("el telefono es = " + telefono);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite la Fecha de Nacimiento");
            String fecha_nacimiento = sc.nextLine();
            System.out.println("La fecha de nacimiento es = " + fecha_nacimiento);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite la Fecha de Creacion");
            String fecha_creacion = sc.nextLine();
            System.out.println("La fecha de creacion es = " + fecha_creacion);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite la Fecha de Actualizacion");
            String fecha_actualizacion = sc.nextLine();
            System.out.println("La fecha de actualizacion es = " + fecha_actualizacion);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite su Estado Civil");
            String estado_civil_id = sc.nextLine();
            System.out.println("El estado civil es = " + estado_civil_id);
            System.out.println("_________________________________ ");
            
            System.out.println("Digite el Tipo de Documento");
            String tipo_documento_id = sc.nextLine();
            System.out.println("El tipo de documento es = " + tipo_documento_id);
            System.out.println("_________________________________ ");
            
            Funcionario funcionario = new Funcionario();
            funcionario.setNombres(nombres);
            funcionario.setApellidos(apellidos);
            funcionario.setGenero(genero);
            funcionario.setDireccion(direccion);
            funcionarioController.crear(funcionario);
            System.out.println("Funcionario creado con éxito ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionarios();
            if (funcionarios.isEmpty()) {
                System.out.println("No hay funcionarios ");
            } else {
                funcionarios.forEach(funcionario -> {
                    System.out.println("funcionario_id: " + funcionario.getFuncionario_id());
                    System.out.println("Numero_identificacion: " + funcionario.getNumero_identificacion());
                    System.out.println("Nombres: " + funcionario.getNombres());
                    System.out.println("Apellidos " + funcionario.getApellidos());
                    System.out.println("Genero: " + funcionario.getGenero());
                    System.out.println("Direccion: " + funcionario.getDireccion());
                    System.out.println("Telefono: " + funcionario.getTelefono());
                    System.out.println("Fecha_nacimiento: " + funcionario.getFecha_nacimiento());
                    System.out.println("Fecha_creacion: " + funcionario.getFecha_creacion());
                    System.out.println("Fecha_actualizacion: " + funcionario.getFecha_actualizacion());
                    System.out.println("Estado_civil_id: " + funcionario.getEstado_civil_id());
                    System.out.println("Tipo_documento_id: " + funcionario.getTipo_documento_id());
                    System.out.println("___________________________________________ ");
                    System.out.println("___________________________________________ ");
                    System.out.println("___________________________________________ ");
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        //crear(carroController);
        obtenerFuncionarios(funcionarioController);
    }
}

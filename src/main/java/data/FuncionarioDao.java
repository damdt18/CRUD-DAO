package data;

import com.mycompany.funcionarios.util.ConectionUtil;
import domain.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    // CRUD CREATE, READ, UPDATE, DELETE, LISTAR POR ID
    private static final String GET_FUNCIONARIOS = "select * from funcionarios ";

    private static final String CREATE_FUNCIONARIO = "INSERT INTO funcionarios "
            + "(numero_identificacion, nombres, apellidos, genero, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, estado_civil_id, tipo_documento_id) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_FUNCIONARIO_BY_ID = "select * from funcionarios where id = ? ";

   // private static final String UPDATE_FUNCIONARIO = "update funcionarios set numero_identificacion = ?, nombres = ?, "
       //     + "apellidos = ?, genero = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, fecha_creacion = ?, fecha_actualizacion = ?, estado_civil_id = ?, tipo_documento_id where funcionario_id = ? ";

    private static final String UPDATE_FUNCIONARIO = "update funcionarios set numero_identificacion = ?, nombres = ?, "
        + "apellidos = ?, genero = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, fecha_creacion = ?, fecha_actualizacion = ?, estado_civil_id = ?, tipo_documento_id = ? where funcionario_id = ? ";

    
    private static final String DELETE_FUNCIONARIO = "delete from funcionarios where funcionario_id = ? ";

    public List<Funcionario> obtenerFuncionarios() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> funcionarios = new ArrayList<>();

        try {

            connection = ConectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setFuncionario_id(resultSet.getInt("funcionario_id"));
                funcionario.setNumero_identificacion(resultSet.getInt("numero_identificacion"));
                funcionario.setNombres(resultSet.getString("nombres"));
                funcionario.setApellidos(resultSet.getString("apellidos"));
                funcionario.setGenero(resultSet.getString("genero"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getLong("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                funcionario.setFecha_creacion(resultSet.getDate("fecha_creacion"));
                funcionario.setFecha_actualizacion(resultSet.getDate("fecha_actualizacion"));
                funcionario.setEstado_civil_id(resultSet.getInt("estado_civil_id"));
                funcionario.setTipo_documento_id(resultSet.getInt("tipo_documento_id"));
                funcionarios.add(funcionario);
            }
            return funcionarios;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void crear(Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
            preparedStatement.setInt(1, funcionario.getNumero_identificacion());
            preparedStatement.setString(2, funcionario.getNombres());
            preparedStatement.setString(3, funcionario.getApellidos());
            preparedStatement.setString(4, funcionario.getGenero());
            preparedStatement.setString(5, funcionario.getDireccion());
            preparedStatement.setLong(6, funcionario.getTelefono());
            preparedStatement.setDate(7, funcionario.getFecha_nacimiento());
            preparedStatement.setTimestamp(8, new java.sql.Timestamp(System.currentTimeMillis())); // Establece fecha_creacion
            preparedStatement.setTimestamp(9, new java.sql.Timestamp(System.currentTimeMillis())); // Establece fecha_actualizacion
            //preparedStatement.setDate(8, funcionario.getFecha_creacion());
            //preparedStatement.setDate(9, funcionario.getFecha_actualizacion());
            preparedStatement.setInt(10, funcionario.getEstado_civil_id());
            preparedStatement.setInt(11, funcionario.getTipo_documento_id());
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public Funcionario obtenerFuncionario(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Funcionario funcionario = null;

        try {

            connection = ConectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new Funcionario();
                funcionario.setFuncionario_id(resultSet.getInt("funcionario_id"));
                funcionario.setNumero_identificacion(resultSet.getInt("numero_identificacion"));
                funcionario.setNombres(resultSet.getString("nombres"));
                funcionario.setApellidos(resultSet.getString("apellidos"));
                funcionario.setGenero(resultSet.getString("genero"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getLong("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                funcionario.setFecha_creacion(resultSet.getDate("fecha_creacion"));
                funcionario.setFecha_actualizacion(resultSet.getDate("fecha_actualizacion"));
                funcionario.setEstado_civil_id(resultSet.getInt("estado_civil_id"));
                funcionario.setTipo_documento_id(resultSet.getInt("tipo_documento_id"));

            }
            return funcionario;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

    public void actualizarFuncionario(int id, Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIO);
            preparedStatement.setInt(1, funcionario.getNumero_identificacion());
            preparedStatement.setString(2, funcionario.getNombres());
            preparedStatement.setString(3, funcionario.getApellidos());
            preparedStatement.setString(4, funcionario.getGenero());
            preparedStatement.setString(5, funcionario.getDireccion());
            preparedStatement.setLong(6, funcionario.getTelefono());
            preparedStatement.setDate(7, funcionario.getFecha_nacimiento());
            preparedStatement.setTimestamp(8, new java.sql.Timestamp(System.currentTimeMillis()));
            //preparedStatement.setDate(8, funcionario.getFecha_creacion());
            preparedStatement.setTimestamp(9, new java.sql.Timestamp(System.currentTimeMillis()));
            preparedStatement.setInt(10, funcionario.getEstado_civil_id());
            preparedStatement.setInt(11, funcionario.getTipo_documento_id());
            preparedStatement.setInt(12, id);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public void eliminarFuncionario(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}

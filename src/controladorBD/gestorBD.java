/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorBD;

/**
 *
 * @author User
 */

//clase que realiza la conexion y operaciones sobre la base de datos de mysql
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gestorBD {
    
    String usuario,password,host;
    Connection con;
    Statement statement;  
    ResultSet resultado;
    String[][] Datos;
    int columnas;
    int filas;
    
    /**
     * metodo contructor de la clse
     */
    public gestorBD()
    { 
        host = "jdbc:mysql://localhost/bodegacolmovil";
        usuario = "root";
        password = "root";
        con = abrirConexion();
    }
    
    
    /**
     * funcion que permite crear una conexion a la base de datos
     * @return Connection con: Devuelve el objeto de conexion 
     */
    public Connection abrirConexion(){   
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(host, usuario, password);
            //System.out.print("\nEstamos conectados");
            return con;
        }
        catch (Exception e)  {
            System.out.println("No se pudo abrir la conexion a la base de datos");
        }
        return null;
    }
    
    /**
     * funcion que permite cerrar la conexion a la base de datos
     * @param c hace referencia al objeto de conexion
     */
    public void cerrarConexion(Connection c){
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("No se pudo cerrar la conexion a la base de datos");
        }
    }
    
    /**
     * funcion que permite ejecutar query de consultas 
     * @param consulta hace referencia al string de consulta o query ->("select * from table_name;s");
     * @return ResultSet objeto de respuesta con la consulta a la base de datos;
     */
    public ResultSet ejecutarConsulta(String consulta){
        
        ResultSet resultado = null;
        //System.out.println(consulta);
        try {
            statement = con.createStatement();
            resultado = statement.executeQuery(consulta);
        }
        catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta");
        }
        catch (Exception e) {
            System.out.println("Error al ejecutar la consulta");
        }
        return resultado;
    }
    
    public String[][] generarConsulta(String consulta) throws SQLException
    {
        //ejecutar o relizar la consulta
        resultado = ejecutarConsulta(consulta);
       
           
        
        //guardar la tabla consultada
        ResultSetMetaData metadatos = resultado.getMetaData();
        
        
        //se ubica un apuntador en la ultima de las columnas
        resultado.last();
        
        columnas = metadatos.getColumnCount();
        filas = resultado.getRow();
        //System.out.println(columnas);
        //System.out.println(filas);
        
         
        
        //crear la matriz que guardara la tabla consultada 
        Datos = new String[filas][columnas];
        
        resultado.beforeFirst();
        
        //recorrer la matriz consultada para guardar la información
            for(int i=0;i<filas;i++)
            {

                //Va a la siguiente fila

                resultado.next();

                for(int j=0;j<columnas;j++)
                {

		//Obtiene el valor de cada una de las columnas en la fila actual

		 Datos[i][j]=resultado.getString(j+1);
                 //System.out.print("\n"+Datos[i][j]);
                  
                }

             }
            
        //cerrar conexion
       cerrarConexion(con);
        
        return Datos;
       
   
        
    }
    

    public int getColumnas(){
    
    return this.columnas;
    
    }
    
    public int getFilas(){
    
    return this.filas;
    
    }
    
}
    
    
   
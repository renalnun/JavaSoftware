/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ariel
 */
public class Conexion {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DBMS = "mysql";
    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DATABASE = "softfitness";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    void Conexcion (){} 
    
    public static Connection conectar () throws Exception {
        
        try{
           Class.forName(DRIVER);   
        }catch(ClassNotFoundException ce){
            System.out.println("Error: Driver no encontrado!" + ce);
        }
        try{
            System.out.println("Conectando a la base de datos");
            return DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);                
        }catch(SQLException exception){
            System.out.println("Error: No es posible la conexion!" +exception);
            return null;
        }  
    } 
}
 
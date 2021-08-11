/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Clases.Clshistory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author agos1
 */
public class Modelhistoria {
    DbData dbdata;
    
    public Modelhistoria(){
        this.dbdata = new DbData();
        
    }
    
    public boolean Createhistory(Clshistory history){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPassword())){
            String query = "INSERT INTO tb_historias (id, titulo, descripcion_corta, tipo_historia, historia,autor,fecha) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statementhistory = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementhistory.setInt(1, history.getId());
            statementhistory.setString(2, history.getTitulo());
            statementhistory.setString(3, history.getDescripcion_corta());
            statementhistory.setString(4, history.getTipo_historia());
            statementhistory.setString(5, history.getHistoria());
            statementhistory.setString(6, history.getAutor());
            statementhistory.setString(7, history.getFecha());
            int rowsInserted = statementhistory.executeUpdate();
            
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean Edithistory (Clshistory history){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPassword())){
            String query = "UPDATE tb_historias SET titulo = ?, descripcion_corta = ?, tipo_historia = ?, historia = ?, autor = ?, fecha = ? WHERE id = ?";
            
            PreparedStatement statementhistory =conn.prepareStatement(query);
            statementhistory.setString(1, history.getTitulo());
            statementhistory.setString(2, history.getDescripcion_corta());
            statementhistory.setString(3, history.getTipo_historia());
            statementhistory.setString(4, history.getHistoria());
            statementhistory.setString(5, history.getAutor());
            statementhistory.setString(6, history.getFecha());
            statementhistory.setInt(7, history.getId());
                        
            int rowsUpdatehistory = statementhistory.executeUpdate();
            return true;
            
        }catch (SQLException e){
            return false;
        }
    }
    
    public boolean Deletehistory (String titulo){
        
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPassword())){
            String query = "DELETE FROM tb_historias WHERE titulo= ? ";
            PreparedStatement statementhistory = conn.prepareStatement(query);
            statementhistory.setString(1, titulo);
            
            int result = statementhistory.executeUpdate();
            System.out.println("entre al metodo");
            System.out.println(result);
            System.out.println(statementhistory);
            
            return true;
            
            
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Clshistory Searchhistorybytitulo (String titulo){
        Clshistory history = null;
            try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPassword())){
            //String query = "SELECT * FROM tb_historias WHERE titulo = ? ";
            String query = "SELECT * FROM tb_historias WHERE titulo LIKE'%" + titulo +"%'";
            PreparedStatement statementhistory = conn.prepareStatement(query);
            //statementhistory.setString(1, titulo);
            ResultSet result = statementhistory.executeQuery();
                      
            
            while(result.next()){
                int historyid = result.getInt(1);
                String historytitulo = result.getString(2);
                String historydescripcion_corta = result.getString(3);
                String historytipo_historia = result.getString(4);
                String historyhistoria = result.getString(5);
                String historyautor = result.getString(6);
                String historyfecha = result.getString(7);
                history = new Clshistory(historyid, historytitulo, historydescripcion_corta, historytipo_historia, historyhistoria, historyautor, historyfecha);
                                                  
                                        
                }
            
            return history;
        }catch(SQLException e){
            e.printStackTrace();
            return history;
        }
    }
    
    public Clshistory Searchhistorybydescripcion (String descripcion_corta){
        Clshistory history = null;
            try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPassword())){
            //String query = "SELECT * FROM tb_historias WHERE titulo = ? ";
            String query = "SELECT * FROM tb_historias WHERE descripcion_corta LIKE'%" + descripcion_corta +"%'";
            PreparedStatement statementhistory = conn.prepareStatement(query);
            //statementhistory.setString(1, titulo);
            ResultSet result = statementhistory.executeQuery();
                      
            
            while(result.next()){
                int historyid = result.getInt(1);
                String historytitulo = result.getString(2);
                String historydescripcion_corta = result.getString(3);
                String historytipo_historia = result.getString(4);
                String historyhistoria = result.getString(5);
                String historyautor = result.getString(6);
                String historyfecha = result.getString(7);
                history = new Clshistory(historyid, historytitulo, historydescripcion_corta, historytipo_historia, historyhistoria, historyautor, historyfecha);
                     
                }
            
            return history;
        }catch(SQLException e){
            e.printStackTrace();
            return history;
        }
               
    }
    
    
    
    
    
    
}

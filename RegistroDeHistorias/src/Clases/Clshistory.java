/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.Ihistoria;
import java.sql.Timestamp;

/**
 *
 * @author agos1
 */
public class Clshistory implements Ihistoria {
    
   private int id;
   private String titulo;
   private String descripcion_corta;
   private String tipo_historia;
   private String historia;
   private String fecha;
   private String autor;

    public Clshistory(int id, String titulo, String descripcion_corta, String tipo_historia, String historia, String fecha, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion_corta = descripcion_corta;
        this.tipo_historia = tipo_historia;
        this.historia = historia;
        this.fecha = fecha;
        this.autor = autor;
    }

   
   
   

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion_corta
     */
    public String getDescripcion_corta() {
        return descripcion_corta;
    }

    /**
     * @param descripcion_corta the descripcion_corta to set
     */
    public void setDescripcion_corta(String descripcion_corta) {
        this.descripcion_corta = descripcion_corta;
    }

    /**
     * @return the tipo_historia
     */
    public String getTipo_historia() {
        return tipo_historia;
    }

    /**
     * @param tipo_historia the tipo_historia to set
     */
    public void setTipo_historia(String tipo_historia) {
        this.tipo_historia = tipo_historia;
    }

    /**
     * @return the historia
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * @param historia the historia to set
     */
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    

    @Override
    public String getTipoHistoria() {
        return "historias reales";
    }
   
   

   
    
}

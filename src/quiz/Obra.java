/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author ESTUDIANTE
 */
public class Obra {
   private String Nombre; 
   private String Estilo;
   private String tecnica; 
   private int precio; 

    public Obra(String Nombre, String Estilo, String tecnica, int precio) {
        this.Nombre = Nombre;
        this.Estilo = Estilo;
        this.tecnica = tecnica;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
   
    
}

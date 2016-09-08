/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pared
 */
public class Password 
{
  private String contraseña;
  private String longitud;
  
  public Password (String contraseña, String longitud)
  {
      this.contraseña= contraseña;
      this.longitud= longitud;
  }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    
  
}

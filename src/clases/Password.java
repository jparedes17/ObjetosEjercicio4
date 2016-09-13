/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Password 
{
  private String contraseña;
  private String longitud;
  
  public Password (String contraseña)
  {
      this.contraseña= contraseña;
      
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
    
    public  String mostrar ()
    {   
        char[] caracteres;
        caracteres = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        this.contraseña += caracteres;
        
        
        if (this.contraseña.length()<6)
        {
            this.longitud = "Debil";
            
        }
        if (this.contraseña.length()>8)
        {
            JOptionPane.showMessageDialog(null, "La clave es mayor a 8 dijitos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if (this.contraseña.length()>=6 && this.contraseña.length()<=8)
        {
           this.longitud = "Fuerte";
           
        }
        
        return longitud;
    }
  public Password CambiarContraseña (Password usuario2)
  {
        String longt; String contra;
        Password usuario;
        char[] caracteres;
        caracteres = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        contra= usuario2.contraseña += caracteres;
        longt= usuario2.longitud= (usuario2.contraseña);
        
        usuario = new Password (contra);
        return usuario;
  }
}

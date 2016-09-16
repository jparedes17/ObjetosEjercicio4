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
  private int longitud;
  
  public Password (String contraseña)
  {
      this.contraseña= contraseña;
      this.longitud= 8;
  }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
     public String Validar ()
  {
        String aux;
       if (this.getContraseña().length()<6)
       {
           aux = "Debil";
       }
       else if (this.getContraseña().length()>=6 && this.getContraseña().length()<=8)
       {
           aux = " Fuerte " +" - " + "Contraseña Creada Correctamente";
       }
       else if (this.getContraseña().length()>8)
       {
           aux = "La contraseña no puede ser mayor a 8 digitos";
       }
       else
       {
           aux = "Contraseña Creada correctamente";
       }
       return aux;
  }
        public String mostrar() 
        {
        String aux;
        aux = ("La contraseña es: " + this.getContraseña() + "\n"
            +  "La longitud de la contraseña es de: " + this.getContraseña().length());
        
        return aux;
    }
        
        public void CambiarContraseña (String contraseña2)
        {
            this.contraseña = contraseña2;
        }
    
}

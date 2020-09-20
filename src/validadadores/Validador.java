/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadadores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Stefano
 */
public class Validador {
    
    public static boolean ValorENumeroInteiro(String valor)
    {
        try
        {
          Integer.parseInt(valor);
          return true;
        }         
        catch(Exception e)   
        {
            return false;
        }
    }
    
    public static boolean ValorEDataValida(String valor)
    {
        try
        {
          SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
          new java.sql.Date(format.parse(valor).getTime());
          return true;
        }         
        catch(Exception e)   
        {
            return false;
        }
    }
    
    
}

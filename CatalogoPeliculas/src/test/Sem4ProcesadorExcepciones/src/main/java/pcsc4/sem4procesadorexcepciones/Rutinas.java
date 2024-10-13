/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcsc4.sem4procesadorexcepciones;

/**
 *
 * @author deiv
 */ 
public class Rutinas {
    public void dividirNumeros(double primerNumero, double segundoNumero)
    {
        double total = 0;
        try
        {
            if(segundoNumero == 0)
            {
                throw new ArithmeticException("Error: No se puede dividir entre cero");
                //throw new Exception();
            }
            total = primerNumero / segundoNumero;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            //Captura los errores de ejecución a través de la clase exception
            System.out.println("Ocurrió un error desconocido");
        }
        finally
        {
            System.out.println("En este caso el resultado es: " + total);
        }
    }
}

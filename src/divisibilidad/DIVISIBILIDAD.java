/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisibilidad;

import javax.swing.JOptionPane;

/**
 *
 * @author KAICES
 */
public class DIVISIBILIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String salir;
        int opc = 0;
        
        
         DIVISIBILIDAD div = new DIVISIBILIDAD();
         DIVISIBILIDAD mcd = new DIVISIBILIDAD();
         
         
         do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion para la teoria de numeros a mirar:"
                    + "\n"
                    + "\n1.Divisivilidad"
                    + "\n"
                    + "\n2.MCD (Minimo comun divisor)"
                    + "\n"
            
            ));
            
            switch (opc) {
                case 1:
                    
                    int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));  
                    div.euclides(a, b);
                    break;
                    
                case 2:
                    
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));  
                    mcd.MaximoComunDivisor(c, d);
                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
            salir = JOptionPane.showInputDialog("Desea ejecutar otra accion? (s-n)");
        }  while (salir.equals("s") || salir.equals("S"));
         
         
         
        
    }
            
    public int euclides (int a, int b){
        
            int n = 0;
            int resto = a % b ;  
            int division = a / b;
            n = (b * division)+ resto ;
            
            if ( a == n ) {
                JOptionPane.showMessageDialog(null, "El numero " + a + " es divisible con " + b," DIVISIBILIDAD ENTRE DOS NUMEROS ",JOptionPane.INFORMATION_MESSAGE); 
            }else {
                JOptionPane.showMessageDialog(null, "El numero " + a + " NO es divisible con " + b," DIVISIBILIDAD ENTRE DOS NUMEROS ",JOptionPane.INFORMATION_MESSAGE); 
            }    
            
       return a ;
    } 
    
    public int MaximoComunDivisor (int c, int d){
   
        while ( d != 0 ){
            int t =d;
            d = c % d ;
            c = t ;
            
        }
            JOptionPane.showMessageDialog(null, "El MDC es : \n" + c,"MAXIMO COMUN DIVISOR",JOptionPane.INFORMATION_MESSAGE); 
            return c ;
    } 
    
}

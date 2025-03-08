/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrante1115beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Quadrante1115Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int X = 0;
        int Y = 0;     
         
        for (int c = 0; c < 2;) {            
        
            X = teclado.nextInt();
            Y = teclado.nextInt();
        
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }
            
            if (X == 0 || Y == 0) {
                break;
            }
        }
    }    
}

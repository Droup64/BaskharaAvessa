
package AulaPI;

import java.util.Scanner;





public class Bhaskaravesso {
    public static void main(String[] args) {
       Scanner console = new Scanner (System.in);
       
       System.out.println("X1: "); 
       double x1 = console.nextDouble();
       System.out.println("X2: ");
       double x2 = console.nextDouble();
       System.out.println("C: ");
       double c = console.nextDouble(); 
       double s = (x1+x2);
       double p = (x1*x2);
       double a = (c/p);
       double b = (-s*a);
       System.out.println ("A equação que tem como raizes " + x1 + " e " + x2 + " é ax² + bx + " + c);
        
       
    }
    
}

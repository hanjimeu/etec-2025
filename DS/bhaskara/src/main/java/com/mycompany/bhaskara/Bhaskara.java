
package com.mycompany.bhaskara;

import javax.swing.JOptionPane;
public class Bhaskara {
public static void main(String[] args) {
        
    double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
    double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
    double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));
    
    double delta = (b * b) - (4 * a * c);
     
    
    if (delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
    } else {
    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
    JOptionPane.showMessageDialog(null, "As raízes da equação são iguais a:\nX1 = " + x1 + "\nX2 = " + x2);
    
    
        }
    }
}

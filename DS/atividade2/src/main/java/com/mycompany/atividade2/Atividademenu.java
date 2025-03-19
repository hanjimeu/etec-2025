package com.mycompany.atividade2;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Atividademenu { 
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Menu de Operações"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 400);        
        JPanel panel = new JPanel(); 
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        JTextField num1Field = new JTextField(10); 
        JTextField num2Field = new JTextField(10); 
        JTextArea resultArea = new JTextArea(10, 10);
        num1Field.setBackground(new Color(152,251,152));
        num2Field.setBackground(new Color(152,251,152));
        resultArea.setBackground(new Color(152,251,152));
        resultArea.setEditable(false);        
        panel.setBackground(new Color(255,192,203));
        panel.add(new JLabel("Número 1:")); 
        panel.add(num1Field); 
        panel.add(new JLabel("Número 2:")); 
        panel.add(num2Field); 
        panel.add(new JLabel("Resultado")); 
        panel.add(resultArea);      

        JMenuBar menuBar = new JMenuBar(); 
        JMenu operationsMenu = new JMenu("Operações"); 
        String[] operations = { "Soma", "Subtração", "Multiplicação", "Divisão", "Resto da divisão", 
                                "Dobro", "Quadrado", "Cubo", "Raiz quadrada" }; 

        for (String operation : operations) { 
            JMenuItem menuItem = new JMenuItem(operation); 
            menuItem.setBackground(new Color(152,251,152));
            menuItem.addActionListener(new ActionListener() {@Override 
                public void actionPerformed(ActionEvent e) { 
                    try { 
                        double num1 = Double.parseDouble(num1Field.getText()); 
                        double num2 = Double.parseDouble(num2Field.getText()); 
                        StringBuilder result = new StringBuilder(); 
                        
                        switch (operation) { 
                            case "Soma": 
                                result.append("A soma é igual a: ").append(num1 + num2).append("\n"); 
                                break; 

                            case "Subtração": 
                                result.append("A subtração é igual a: ").append(num1 - num2).append("\n"); 
                                break; 
                                
                            case "Multiplicação": 
                                result.append("A multiplicação é igual a: ").append(num1 * num2).append("\n"); 
                                break; 

                            case "Divisão": 
                                if (num2 != 0) { 
                                    result.append("A divisão é igual a: ").append(num1 / num2).append("\n"); 
                                } else { 
                                    result.append("Erro: Divisão por zero.\n"); 
                                } 
                                break; 

                            case "Resto da divisão": 
                                result.append("O resto da divisão é igual a: ").append(num1 % num2).append("\n"); 
                                break; 
                                
                            case "Dobro": 
                                result.append("O dobro de " + num1 + " é igual a: " + (num1 * 2)).append("\n"); 
                                break; 

                            case "Quadrado": 
                                result.append("Quadrado de " + num1 + "é igual a: " + (num1 * num1)).append("\n"); 
                                break; 

                            case "Cubo": 
                                result.append("Cubo de " + num1 + "é igual a: " + (num1 * num1 * num1)).append("\n"); 
                                break; 

                            case "Raiz quadrada": 
                                if (num1 >= 0) { 
                                    result.append("A raiz quadrada de " + num1 + "é igual a: " + Math.sqrt(num1)).append("\n"); 
                                } else { 
                                    result.append("Erro: Raiz quadrada de número negativo.\n"); 
                                } 

                                break; 
                                
                        }

                        resultArea.setText(result.toString()); 
                    } catch (NumberFormatException ex) { 
                        resultArea.setText("Erro: Insira números válidos."); 

                    } 

                } 

            }); 

            operationsMenu.add(menuItem); 

        } 

           menuBar.add(operationsMenu); 

        JMenu exitMenu = new JMenu("Sair"); 
        JMenuItem exitItem = new JMenuItem("Sair"); 
        exitItem.addActionListener(new ActionListener() {@Override 
            public void actionPerformed(ActionEvent e) { 
                System.exit(0); 
            } 
        }); 
        exitMenu.add(exitItem); 
        menuBar.add(exitMenu); 
        frame.setJMenuBar(menuBar); 
        frame.getContentPane().add(panel, BorderLayout.CENTER); 
        frame.setVisible(true); 
        
    } 

}

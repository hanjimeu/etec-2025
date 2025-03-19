package com.mycompany.atividademenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Atividademenu2 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Segundo Menu de Operações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255,192,203));
        JMenuBar menuBar = new JMenuBar();
        JMenu operationsMenu = new JMenu("Operações");
        String[] operations = { "Soma", "Subtração", "Multiplicação", "Divisão", "Resto da divisão", 
                                "Dobro", "Quadrado", "Cubo", "Raiz quadrada" };

        for (String operation : operations) {
            JMenuItem menuItem = new JMenuItem(operation);
            menuItem.setBackground(new Color(152,251,152));
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {                      
                        double num1 = 8;
                        double num2 = 8;                      

                        StringBuilder result = new StringBuilder();
                        switch (operation) {
                            case "Soma":
                                result.append("A soma é igual a: ").append(num1 + num2);
                                break;
                            case "Subtração":
                                result.append("A subtração é igual a: ").append(num1 - num2);
                                break;
                            case "Multiplicação":
                                result.append("A multiplicação é igual a: ").append(num1 * num2);
                                break;
                            case "Divisão":
                                if (num2 != 0) {
                                    result.append("A divisão é igual a: ").append(num1 / num2);
                                } else {
                                    result.append("Erro: Divisão por zero.");
                                }
                                break;
                            case "Resto da divisão":
                                result.append("O resto da divisão é igual a: ").append(num1 % num2);
                                break;
                            case "Dobro":
                                result.append("O dobro de ").append(num1).append(" é igual a: ").append(num1 * 2);
                                break;
                            case "Quadrado":
                                result.append("Quadrado de ").append(num1).append(" é igual a: ").append(num1 * num1);
                                break;
                            case "Cubo":
                                result.append("Cubo de ").append(num1).append(" é igual a: ").append(num1 * num1 * num1);
                                break;
                            case "Raiz quadrada":
                                if (num1 >= 0) {
                                    result.append("A raiz quadrada de ").append(num1).append(" é igual a: ").append(Math.sqrt(num1));
                                } else {
                                    result.append("Erro: Raiz quadrada de número negativo.");
                                }
                                break;
                        }

                        JOptionPane.showMessageDialog(frame, result.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro: Insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            operationsMenu.add(menuItem);
        }

        menuBar.add(operationsMenu);
        JMenu exitMenu = new JMenu("Sair");
        JMenuItem exitItem = new JMenuItem("Sair");
        exitItem.addActionListener(new ActionListener() {
            @Override
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



package com.mycompany.exercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio19 {

    public static void main(String[] args) {
        String frase;
        int n;
        frase = JOptionPane.showInputDialog("Digite uma frase:");
        n = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você quer rodar essa frase?"));
        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, frase);
        }

    }

}
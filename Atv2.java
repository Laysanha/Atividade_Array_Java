package vector;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Fa�a um programa em que o usu�rio informe 3 n�meros inteiros. 
//Considere que o usu�rio ir� informar tr�s n�meros diferentes. Ap�s o cadastro fa�a a ordena��o em
//ordem crescente desses n�meros, de modo que o vetor original fique ordenado. Mostre o
//vetor ordenado na tela.

public class Atv2 {
	public static void main(String[] args) {
	
		int nums[] = new int[3]; 
		int ordemCrescente[] = new int[3]; 
		
		for (int i = 0; i < 3; i++) {
			nums[i] = Integer.parseInt (JOptionPane.showInputDialog ("Informe o " + i + "� valor"));
			ordemCrescente[i] = nums[i]; 
		}
		
		 Arrays.sort(ordemCrescente);
		 
		 for (int j = 0; j < 3; j++) {
			 JOptionPane.showMessageDialog(null, "Ordem crescente:" + ordemCrescente[j]); 
		 }
	}
}

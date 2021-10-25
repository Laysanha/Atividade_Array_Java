package vector;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Faça um programa em que o usuário informe 3 números inteiros. 
//Considere que o usuário irá informar três números diferentes. Após o cadastro faça a ordenação em
//ordem crescente desses números, de modo que o vetor original fique ordenado. Mostre o
//vetor ordenado na tela.

public class Atv2 {
	public static void main(String[] args) {
	
		int nums[] = new int[3]; 
		int ordemCrescente[] = new int[3]; 
		
		for (int i = 0; i < 3; i++) {
			nums[i] = Integer.parseInt (JOptionPane.showInputDialog ("Informe o " + i + "º valor"));
			ordemCrescente[i] = nums[i]; 
		}
		
		 Arrays.sort(ordemCrescente);
		 
		 for (int j = 0; j < 3; j++) {
			 JOptionPane.showMessageDialog(null, "Ordem crescente:" + ordemCrescente[j]); 
		 }
	}
}

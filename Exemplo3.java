package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplo3 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
		Integer X;
		Integer qtd =  0;
		char opcao = 'S';
		
		while (opcao == 'S') {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
			numeros.add(numero);
			
			opcao = JOptionPane.showInputDialog("Cadastrar mais dadods:").charAt(0);
		}
		
		X = Integer.parseInt(JOptionPane.showInputDialog("Busque um número:"));
		
		for (Integer i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == X) {
				qtd++;
			}
		}
		
		if(qtd > 0) {
			System.out.println("Ok");
		} else {
			System.out.println("Eita lasquiera");
		}
		
		System.out.println("Tamanho:" + numeros.size());
	}
}

package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//Faça um programa Java que Leia o Nome e a Média Final de N alunos,
//após mostre os dados dos alunos com Média maior que a Média;

public class AtividadeEmAula1 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();

		char opcao = 'S';
		
		while (opcao == 'S') {
			
			nomes.add(JOptionPane.showInputDialog("Informe o nome:"));
			
			notas.add(Double.parseDouble(JOptionPane.showInputDialog("Informe a média:")));
		
			opcao = JOptionPane.showInputDialog("Cadastrar mais dadods:").charAt(0);
		}
		
		for (Integer i = 0; i <= notas.size(); i++) {
			if (notas.get(i) >= 6) {
				JOptionPane.showMessageDialog(null,"Medias dos alunos acima da média: \n" + nomes.get(i) + " - média: " + notas.get(i) + "");
			}
		}
	}
}

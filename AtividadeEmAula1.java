package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//Fa�a um programa Java que Leia o Nome e a M�dia Final de N alunos,
//ap�s mostre os dados dos alunos com M�dia maior que a M�dia;

public class AtividadeEmAula1 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();

		char opcao = 'S';
		
		while (opcao == 'S') {
			
			nomes.add(JOptionPane.showInputDialog("Informe o nome:"));
			
			notas.add(Double.parseDouble(JOptionPane.showInputDialog("Informe a m�dia:")));
		
			opcao = JOptionPane.showInputDialog("Cadastrar mais dadods:").charAt(0);
		}
		
		for (Integer i = 0; i <= notas.size(); i++) {
			if (notas.get(i) >= 6) {
				JOptionPane.showMessageDialog(null,"Medias dos alunos acima da m�dia: \n" + nomes.get(i) + " - m�dia: " + notas.get(i) + "");
			}
		}
	}
}

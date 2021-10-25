package vector;

import javax.swing.JOptionPane;

//Faça um programa em que o usuário faça o cadastro de N marcas, placas e
//ano de fabricação de carros. Possibilite o cadastro de no máximo 50 carros. Utilize um
//menu com as seguintes opções:
//1 – Cadastrar Carro (o usuário informa a marca e a placa do carro)
//2 – Listar os carros do ano (o programa mostra todas as informações de todos os carros
//fabricados no ano de 2021).
//3 – Buscar carros por marca (o programa mostra todos os dados de todos os carros que
//possuem a marca pesquisada).
//OBS: Nas opções 2 e 3, caso não tenha nenhum registro que atenda aos filtros, deve ser
//dado uma mensagem ao usuário de que não existe nenhum cadastro que atenda à busca.

public class Atv3 {
	public static void main(String[] args) {
		
		String placas[] = new String[50];
		int dataFrabrics[] = new int[50];
		String marcas[] = new String[50];
		
		String menu = "1 – Cadastrar Carro \n"
				+ "2 – Listar os carros do ano \n"
				+ "3 – Buscar carros por marca \n";
		
		int acao = 1;
		int contDataFabric = 0;
		
		for (int i = 0; i < 50; i++) {
			
			acao = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Restão"+ " " + "carros a serem castrados"));	
			
			if(acao == 1) { 
				placas[i] = JOptionPane.showInputDialog("Informe a placa do " + i + "º carro:");
				marcas[i] = JOptionPane.showInputDialog("Informe a marca do " + i + "º carro:");
				dataFrabrics[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a data do " + i + "º carro:"));
				
				if (dataFrabrics[i] == 2021) {
					contDataFabric++;
				}
			} 
			
			if(acao == 2) {
				JOptionPane.showMessageDialog(null, "O total de carros do ano de 2021: " + contDataFabric);
			}
			
			if(acao == 3) {
				String buscaMarca = JOptionPane.showInputDialog("Deseja buscar por qual marca? ");
				boolean achou = false;
				String reg = "";
				
				for(int j = 0; j < 50; j++) {
					if(marcas[j].equals(buscaMarca)) {
						achou = true;
						i = j;
					}
					
					if(achou == true) {
						reg += buscaMarca + " está cadastrado(a). \n Placa: " + placas[i] + "\n Ano de fabricação: " + dataFrabrics[i] + "\n";
					} else {
						JOptionPane.showMessageDialog(null, buscaMarca + " não encontrado(a)");		
					}
					
				}
				JOptionPane.showMessageDialog(null, reg);
			}
		}	
	}
}

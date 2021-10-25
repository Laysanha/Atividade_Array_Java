package vector;

import javax.swing.JOptionPane;

//Fa�a um programa em que o usu�rio fa�a o cadastro de N marcas, placas e
//ano de fabrica��o de carros. Possibilite o cadastro de no m�ximo 50 carros. Utilize um
//menu com as seguintes op��es:
//1 � Cadastrar Carro (o usu�rio informa a marca e a placa do carro)
//2 � Listar os carros do ano (o programa mostra todas as informa��es de todos os carros
//fabricados no ano de 2021).
//3 � Buscar carros por marca (o programa mostra todos os dados de todos os carros que
//possuem a marca pesquisada).
//OBS: Nas op��es 2 e 3, caso n�o tenha nenhum registro que atenda aos filtros, deve ser
//dado uma mensagem ao usu�rio de que n�o existe nenhum cadastro que atenda � busca.

public class Atv3 {
	public static void main(String[] args) {
		
		String placas[] = new String[50];
		int dataFrabrics[] = new int[50];
		String marcas[] = new String[50];
		
		String menu = "1 � Cadastrar Carro \n"
				+ "2 � Listar os carros do ano \n"
				+ "3 � Buscar carros por marca \n";
		
		int acao = 1;
		int contDataFabric = 0;
		
		for (int i = 0; i < 50; i++) {
			
			acao = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Rest�o"+ " " + "carros a serem castrados"));	
			
			if(acao == 1) { 
				placas[i] = JOptionPane.showInputDialog("Informe a placa do " + i + "� carro:");
				marcas[i] = JOptionPane.showInputDialog("Informe a marca do " + i + "� carro:");
				dataFrabrics[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a data do " + i + "� carro:"));
				
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
						reg += buscaMarca + " est� cadastrado(a). \n Placa: " + placas[i] + "\n Ano de fabrica��o: " + dataFrabrics[i] + "\n";
					} else {
						JOptionPane.showMessageDialog(null, buscaMarca + " n�o encontrado(a)");		
					}
					
				}
				JOptionPane.showMessageDialog(null, reg);
			}
		}	
	}
}

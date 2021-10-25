package ArrayList;

import java.util.ArrayList;

public class Exemplo1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		
		System.out.println("Números.size():" + numeros.size());
		
		for(Integer i = 0; i < numeros.size(); i++) {
			System.out.println("Números:" + numeros.get(i));
		}
	}
}

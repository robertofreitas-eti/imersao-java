package br.eti.freitas.aula08.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main (String[] args) {
		
		Map<Integer,String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(10, "Rosa");
		hashMap.put(410, "Verde");
		hashMap.put(2, "Azul");
		hashMap.put(8, "Amarelo");
		hashMap.put(18, "Preto");
		
		System.out.println(hashMap);
		System.out.println("\n");
		
		System.out.println("Lista as chaves (ids): " + hashMap.keySet());
		System.out.println("Lista o conteúdo: " + hashMap.values());
		System.out.println("\n");
		
		for (Map.Entry item : hashMap.entrySet()) {
			System.out.println("Conteúdo: " + item.getKey() + " = " + item.getValue());
		}
		System.out.println("\n");

		System.out.println("Existe a chave 410? " + hashMap.containsValue(410));
		System.out.println("Existe a chave 7? " + hashMap.containsValue(7));
		System.out.println("\n");

		System.out.println("Existe o Amarelo? " + hashMap.containsValue("Amarelo"));
		System.out.println("Existe o Bege? " + hashMap.containsValue("Bege"));
		
		
	}
}

package com.estudoslambdas.aula01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Para o uso de Lambdas! interfaces funcional
 * �nico m�todo abstrato. Al�m desse m�todo ela pode ter outros m�todos,
 * contanto que sejam default ou 'static'. Essa estrutura � fundamental,pois
 * assim o compilador sabe exatamente que o corpo da express�o lambda que
 * escrevemos � a implementa��o de seu �nico m�todo abstrato
 * 
 * @author Valnei
 *
 */
public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Valnei");
		palavras.add("Vagner");
		palavras.add("Agusto");

		Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);

		/*
		 * for (String p : palavras) { System.out.println(p); }
		 */

		Consumer<String> consumer = new ImprimeNaLinha();
		palavras.forEach(consumer);

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}
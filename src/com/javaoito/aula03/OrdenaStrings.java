package com.javaoito.aula03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Valnei");
		palavras.add("Vagner");
		palavras.add("Agusto");
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);

		palavras.forEach(System.out::println);

	}

}



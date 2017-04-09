package ordena.strings.main;

import java.util.Arrays;
import java.util.List;

import ordena.strings.ordenador.OrdenadorDeString;
import ordena.strings.ordenador.OrdenadorTamanhoCrescente;
import ordena.strings.ordenador.OrdenadorTamanhoDecrescente;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("ABC", "ABCDEF", "ABCDE", "AB", "ABCD");
		
		OrdenadorDeString ordenadorTamanhoCrescente = new OrdenadorTamanhoCrescente();
		ordenadorTamanhoCrescente.ordena(palavras);
		
		OrdenadorDeString ordenadorTamanhoDecrescente = new OrdenadorTamanhoDecrescente();
		ordenadorTamanhoDecrescente.ordena(palavras);
		
		ordenadorTamanhoCrescente.exibeMensagem();
		ordenadorTamanhoDecrescente.exibeMensagem();
		
		new Thread(() -> System.out.println("Executando um Runnable!")).start();
	}

}

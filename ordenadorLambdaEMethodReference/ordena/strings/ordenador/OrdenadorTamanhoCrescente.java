package ordena.strings.ordenador;

import java.util.Comparator;
import java.util.List;

public class OrdenadorTamanhoCrescente implements OrdenadorDeString {

	@Override
	public void ordena(List<String> palavras) {
		System.out.println("### Ordenação por tamanho crescente:");
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(p -> System.out.println(p));
	}

	@Override
	public void exibeMensagem() {
		System.out.println("Override do método default :)");
	}

}
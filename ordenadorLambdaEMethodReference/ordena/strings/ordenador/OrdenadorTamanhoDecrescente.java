package ordena.strings.ordenador;

import java.util.List;

public class OrdenadorTamanhoDecrescente implements OrdenadorDeString {

	@Override
	public void ordena(List<String> palavras) {
		System.out.println("### Ordenação por tamanho decrescente:");
		palavras.sort((s1, s2) -> s2.length() - s1.length());
		palavras.forEach(p -> System.out.println(p));
	}

}
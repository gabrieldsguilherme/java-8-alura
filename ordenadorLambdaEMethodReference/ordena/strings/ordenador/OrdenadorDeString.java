package ordena.strings.ordenador;

import java.util.List;

public interface OrdenadorDeString {
	
	void ordena(List<String> palavras);
	
	default void exibeMensagem() {
		System.out.println("Método default da interface :)");
	}

}

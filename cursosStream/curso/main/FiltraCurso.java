package curso.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import curso.model.Curso;

public class FiltraCurso {
	
	private static final List<Curso> CURSOS = Arrays.asList(
			new Curso("Python", 45),
			new Curso("Javascript", 150),
			new Curso("Java 8", 113),
			new Curso("C", 55));
	
	public static void main(String[] args) {
		CURSOS.sort(Comparator.comparing(Curso::getAlunos));
		
		exibeCursosComMaisDe100Alunos();
		exibeNumeroDeAlunosDeCursosComMaisDe100Alunos();
		exibeSomaDeAlunosDeCursosComMaisDe100Alunos();
		exibeQualquerCursoComMaisDe100Alunos();
		exibeNovaListaComCursosComMaisDe100Alunos();
		exibeMapaComCursosComMaisDe100Alunos();
	}

	private static void exibeCursosComMaisDe100Alunos() {
		System.out.println("### Cursos com mais de 100 alunos: ");
		CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.forEach(c -> System.out.println(c.getNome()));
	}
	
	private static void exibeNumeroDeAlunosDeCursosComMaisDe100Alunos() {
		System.out.println("### Número de alunos dos cursos com mais de 100 alunos: ");
		CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getAlunos)
			.forEach(totalAlunos -> System.out.println(totalAlunos));
	}
	
	private static void exibeSomaDeAlunosDeCursosComMaisDe100Alunos() {
		int sum = CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.mapToInt(Curso::getAlunos)
			.sum();
		System.out.println("### Soma de alunos dos cursos com mais de 100 alunos: ");
		System.out.println(sum);
	}
	
	private static void exibeQualquerCursoComMaisDe100Alunos() {
		System.out.println("### Algum curso com mais de 100 alunos: ");
		CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
	}
	
	private static void exibeNovaListaComCursosComMaisDe100Alunos() {
		List<Curso> cursosFiltrados = CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toList());
		System.out.println("### Nova lista com todos os cursos com mais de 100 alunos: ");
		cursosFiltrados.stream()
			.forEach(cf -> System.out.println(cf.getNome()));
	}
	
	private static void exibeMapaComCursosComMaisDe100Alunos() {
		System.out.println("### Mapa com todos os cursos com mais de 100 alunos: ");
		String mensagem = "O curso %s tem %s alunos";
		CURSOS.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toMap(
				Curso::getNome,
				Curso::getAlunos))
			.forEach((nome, valor) -> System.out.println(String.format(mensagem, nome, valor)));
	}

}

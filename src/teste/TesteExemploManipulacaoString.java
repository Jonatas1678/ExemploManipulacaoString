package teste;

public class TesteExemploManipulacaoString {

	public static void main(String[] args) {

		ExemploManipulacaoString teste = new ExemploManipulacaoString();

		teste.setNomeTeste("Jonatas Lima Barbosa");
		teste.setNumeroTeste(1);

		System.out.println(teste.getNomeTeste() + " " + teste.getNumeroTeste());

		System.out.println(teste.getNomeTeste());

		// Substring para mostrar parte do conteúdo
		System.out.println(teste.getNomeTeste().substring(2, 6));
		System.out.println(teste.getNomeTeste().substring(0, 2));
		System.out.println(teste.getNomeTeste().substring(2, 4));
		System.out.println(teste.getNomeTeste().substring(4, 6));
		System.out.println(teste.getNomeTeste().substring(4, 9));
		System.out.println(teste.getNomeTeste().substring(3, 9));// a
		System.out.println(teste.getNomeTeste().substring(7, 14));

		System.out.println(teste.getNomeTeste().substring(0, teste.getNomeTeste().length() / 2));
		System.out.println(teste.getNomeTeste().substring(7, teste.getNomeTeste().length() / 2 + 4));

		if (teste.getNomeTeste().startsWith("Jonatas")) {
			System.out.println("O nome começa com Jona");
		} else {
			System.out.println("O nome não começa com Jona");
		}

		if (teste.getNomeTeste().endsWith("bosa")) {
			System.out.println("O nome termina com bosa");
		} else {
			System.out.println("O nome não termina com bosa");
		}
		
		System.out.println(teste.getNomeTeste().replace('a', '@').replace('o', '0'));
		
		String testeNome = " Jonatas ";
		String testeNomeCompleto = " Jonatas Lima ";

		System.out.println(testeNome);
		System.out.println(testeNome.trim());
		System.out.println(testeNomeCompleto.trim());
		
		teste.setNumeroTeste(teste.getNomeTeste().length());
		System.out.println("Quantidade de caracteres do nome " + teste.getNumeroTeste());
		
		String nomeDois = " J0n@t@s Lim@ B@rb0s@ ";
		
		System.out.println(teste.getNomeTeste().substring(0,16));
		System.out.println(nomeDois);
		System.out.println(teste.getNomeTeste().substring(0,18).replace('@', 'a').replace('0', 'o').trim());
	}
}

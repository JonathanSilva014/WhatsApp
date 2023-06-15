import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Contato> listaDeContato = new ArrayList<>();
		String opcao;

		do {
			exibirMenu();
			opcao = scanner.next().toUpperCase();

			switch (opcao) {
			case "A":
				// Lógica para a opção 1
				System.out.println("Opção A selecionada.");
				System.out.println("Digite o nome do contato Por favor.");
				String nome = scanner.next();
				System.out.println("Digite o telefone do contato Por favor.");
				int numTelm = scanner.nextInt();
				
				Contato c = new Contato(nome, numTelm, "Amigos"); 
				listaDeContato.add(c);
				
				break;
			case "B":
				// Lógica para a opção 2
				System.out.println("Opção B selecionada.");
				System.out.println("Digite o Numero de Telefone");
				int numTelm1 = scanner.nextInt();
				System.out.println("Qual é o novo nome?");
				String nome1 = scanner.next();
				
				boolean contatoEncontrado = false;
				
				for(int i = 0 ; i < listaDeContato.size();i++) {
					Contato c2 = listaDeContato.get(i);
					if ( numTelm1 == c2.getNumTelm()) {
						listaDeContato.get(i).setNome(nome1);
						System.out.println("Contato alterado com sucesso.");
						
						contatoEncontrado = true;
						
						break;
					}
						
				}
				
				if (!contatoEncontrado) {
					System.out.println("Contato não encontrado");
				}
				break;
			case "C":
				// Lógica para a opção 3
				System.out.println("Opção C selecionada.");
				for(int i = 0 ; i < listaDeContato.size();i++) {
					System.out.println(listaDeContato.get(i).getNome() + "," + listaDeContato.get(i).getNumTelm() + "," + listaDeContato.get(i).getTipoContato());
				}

				break;

			case "D":
				System.out.println("Encerrando o programa.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (!opcao.equalsIgnoreCase("D"));

		scanner.close();
	}

	public static void exibirMenu() {
		System.out.println("===== MENU =====");
		System.out.println("Opção A Inserir Contatos Por favor.");
		System.out.println("Opção B Alterar o Nome de um Contato Por Favor.");
		System.out.println("Opção C Essse é o todo os Dados do Contato");
		System.out.println("Opção D Para Sair.");

	}

}

// Rodar Servidor: rmiregistry

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Client {

  private Client() {}
	
	public static void main (String args[]) {
		
		String host = (args.length < 1) ? null : args[0];
		
		Scanner ler = new Scanner(System.in);
		
		try {						
			Registry registry = LocateRegistry.getRegistry(host);
			Correio stub = (Correio) registry.lookup("Correio");
		
		
			//boolean response = stub.autenticar(userName, senha);
			//System.out.println("Response: " + response);
						
			int opcao=1;
			
			while (opcao!=0) {
				System.out.printf("--------------------------------\n");
				System.out.printf("1 Login\n");
				System.out.printf("2 Cadastro\n");
				System.out.printf("0 Sair\n");
				System.out.printf("--------------------------------\n");
				System.out.printf("Opção: ");
				opcao = ler.nextInt();
				
				if (opcao==2) {
							
					String userName;
					System.out.printf("Username: ");
					userName = ler.next();
					
					String senha;
					System.out.printf("Senha: ");
					senha = ler.next();
		
					Usuario usuario = new Usuario(userName, senha);
					boolean situacaoCadastro = stub.cadastrarUsuario(usuario);
					
					if (situacaoCadastro == true) {
						System.out.printf("--------------------------------\n");
						System.out.printf("Usuário Cadastrado com Sucesso!\n");	
					}
					else {
						System.out.printf("--------------------------------\n");
						System.out.printf("Erro no Cadastro!\n");	
					}
		
		
				}
				
				if (opcao==1) {
					
					String userName;
					System.out.printf("Username: ");
					userName = ler.next();
					
					String senha;
					System.out.printf("Senha: ");
					senha = ler.next();
					
					boolean situacaoLogin = stub.autenticar(userName, senha);
					
					if (situacaoLogin == true) {
						System.out.printf("--------------------------------\n");
						System.out.printf("Login Realizado com Sucesso!\n");	
						//int qtdMensagens = stub.nMensagens(userName);
						int qtdMensagens = 0;
						mensagens(qtdMensagens);
					}
					else {
						System.out.printf("--------------------------------\n");
						System.out.printf("Erro no Login!\n");	
					}
					
				}
				
			}
				
		}
		
		catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
		
	}
	
	
	public static void mensagens (int qtdMensagens) {
	
	//Registry registry = LocateRegistry.getRegistry(host);
	//Correio stub = (Correio) registry.lookup("Correio");
	
	Scanner ler = new Scanner(System.in);
	
	int opcao=1;
			
	while (opcao!=0) {
		
		if (qtdMensagens > 0) {
			System.out.printf("--------------------------------\n");
			System.out.printf("1 Enviar Mensagem\n");
			System.out.printf("2 Ler Mensagens (%d)\n", qtdMensagens);
			System.out.printf("0 Sair\n");
			System.out.printf("--------------------------------\n");
			System.out.printf("Opção: ");
		}
		
		else {
			System.out.printf("--------------------------------\n");
			System.out.printf("1 Enviar Mensagem\n");
			System.out.printf("Você Não Possui Mensagens\n");
			System.out.printf("0 Sair\n");
			System.out.printf("--------------------------------\n");
			System.out.printf("Opção: ");

		}
		
		opcao = ler.nextInt();

	}
	
}
	
  }






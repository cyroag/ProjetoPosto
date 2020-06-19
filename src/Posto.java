import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao1,opcao2,escolha;
		Double aux;
		BombaCombustivel bomba[];
		
		bomba = new BombaCombustivel[5];
		bomba[1] = new BombaCombustivel("Gasolina", 2000, 3.80);
		bomba[2] = new BombaCombustivel("Alcool", 1500, 2.90);
		bomba[3] = new BombaCombustivel("Diesel", 4000, 2.50);
				
		do {
			System.out.println("Selecione a bomba desejada:\n1-Gasolina\n2-Alcool\n3-Diesel");			
			do {
				System.out.println("Posto de combustível\n1-Exibir Volume da Bomba\n2-Exibir Valor do Litro\n3-Abastecer");
				opcao1 = teclado.nextInt();
				switch (opcao1) {
					case 1:
						System.out.printf("%.2f L\n", bomba[escolha].getLitros());
						break;
					case 2:
						System.out.printf("R$ %.2f\n",bomba[escolha].getPreco());
						break;
					case 3:
						System.out.println("Selecione a opção de abastecimento:\n1-Volume\n2-Valor\n0-Voltar a opção anterior");
						opcao2 = teclado.nextInt();
						switch(opcao2) {
							case 1:
								System.out.println("Informe o volume desejado:");
								aux = teclado.nextDouble();
								System.out.printf("Total: R$ %.2f\n",bomba[escolha].custo(aux));
								break;
							case 2:
								System.out.println("Informe o valor desejado:");
								aux = teclado.nextDouble();
								System.out.printf("Volume: %.2f L\n",bomba[escolha].volume(aux));
								break;
							case 0:
								System.out.println("Retornando ao menu anterior");
								break;
						}
					break;
				case 0:
					System.out.println("Obrigado!");
					break;
				}
			}while(opcao1 != 0);
//falta
		}while()
		
		teclado.close();

	}

}

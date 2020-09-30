package concessionária;

import java.util.Scanner;

public class Esportivo {
  private String[] esportivoMenos200 = {"(1)Audi A5 - R$170.000,00","(2)Chevrolet Camaro - R$160.000,00", "(3)Lexus CT – R$ 165.990.00", "(4)Voltar ao inicio"};
  private String[] esportivoMais200 = {"(1)Ford Mustang - R$300.000,00","(2)Porsche Boxster - R$350.000,00","(3)Mercedes-Benz A 250 - R$250.000,00", "(4)Voltar ao inicio"};


public void esportivoNovo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if(investimento > 200000){

			for(int i = 0; i < esportivoMais200.length; i++){
				System.out.println("\n" + esportivoMais200[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch(carroEscolhido){
			case 1:
				System.out.print("Voce comprou o Webcarro " + esportivoMais200[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + esportivoMais200[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + esportivoMais200[carroEscolhido - 1]);
				break;
      case 4:
        chamada();
        break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		}else {
			for(int i = 0; i < esportivoMenos200.length; i++){
				System.out.println("\n" + esportivoMenos200[i]);
      }
				System.out.print("\nQual dos carros voce deseja? ");

				int carroEscolhido = sc.nextInt();

				switch(carroEscolhido){
				case 1:
					System.out.print("Voce comprou o " + esportivoMenos200[carroEscolhido - 1]);
					break;
				case 2:
					System.out.print("Voce comprou o " + esportivoMenos200[carroEscolhido - 1]);
					break;
				case 3:
					System.out.print("Voce comprou o " + esportivoMenos200[carroEscolhido - 1]);
					break;
        case 4:
          chamada();
        break;
        default:
          System.out.println("Nao possuimos este carro na Webconcessionaria");
          break;
				}
			}
		}
  
  Scanner sc = new Scanner(System.in);

  public void chamada(){

    System.out.println("Deseja um esportivo: 1:NOVO 2:SEMINOVO");
    int opcao = sc.nextInt();
    
    switch(opcao){
      case 1:
        esportivoNovo();
        break;
      default:
        System.out.println("Nao possuimos esta opcao na concessionaria");
    }
  }
}

package concessionária;

import java.util.Scanner;

public class Convencional {
	  private String[] HatchNovoMais60 = {"(1)Volkswagen Polo - R$90.000", "(2)Peugeot 308 - R$70.000", "(3)Fiat Argo - R$75.000", "(4)Voltar ao inicio"};
	  private String[] HatchNovoMenos60 = {"(1)Volkswagen Fox - R$45.000", "(2)Ford KA - R$55.000", "(3)Renault Kwid $37.490", "(4)Voltar ao inicio"};
	  private String[] HatchSemiMenos60 = {"(1)Chevrolet Agile 2011 - R$20.000,00","(2)Kia Picanto 2012 - R$25.000","(3)Citroen C3 2011 - R$18.000,00", "(4)Voltar ao inicio"}; 
	  private String[] HatchSemiMais60 = {"(1)MiniCooper 2018 - R$90.000,00", "(2)Peugeot 2008 - R$71.000,00", "(3)Ford Focus 2017 - R$65.000,00", "(4)Voltar ao inicio"};
	  
    private String[] SedanNovoMais60 = {"(1)Volkswagen Jetta - R$123.000,00","(2)Honda Civic - R$103.000,00","(3)Hyundai Azera - R$270.000,00"};
    private String[] SedanNovoMenos60 = {"(1)Chevrolet Prisma - R$53.000,00", "(2)Ford Focus - R$59.000,00", "(3)Hyundai HB20s - R$55.000,00"};
    private String[] SedanSemiMais60 = {"(1)Audi A3 Sedan 2018 - R$125.000,00","(2)Mercedez Bens E 250 2016 - R$215.000,00","(3)BMW 335i - R$78.000,00"};
    private String[] SedanSemiMenos60 = {"(1)Fiat Grand Siena - R$ 51.290,00","(2)Toyota Etios - R$ 59.390,00","(3)Renault Logan Life - R$ 56.190,00"};
    
	Scanner sc = new Scanner(System.in);

	public void escolhaHatch() {
		System.out.println("\nDeseja um carro: 1:NOVO 2:SEMINOVO");
		int opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			carroHatchNovo();
			break;

		case 2:
			carroSemiHatchNovo();
			break;
		}
	}

  
	public void escolhaSedan() {
		System.out.println("\nDeseja um carro convencional: 1:NOVO 2:SEMINOVO");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			carroSedanNovo();
			break;

		case 2:
			carroSemiSedanNovo();
			break;
		}
	}

	
	
	
	public void carroHatchNovo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if(investimento > 60000){

			for(int i = 0; i < HatchNovoMais60.length; i++){
				System.out.println("\n" + HatchNovoMais60[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch(carroEscolhido){
			case 1:
				System.out.print("Voce comprou o Webcarro " + HatchNovoMais60[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + HatchNovoMais60[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + HatchNovoMais60[carroEscolhido - 1]);
				break;
      case 4:
        chamada();
        break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		}else {
			for(int i = 0; i < HatchNovoMenos60.length; i++){
				System.out.println("\n" + HatchNovoMenos60[i]);
      }
				System.out.print("\nQual dos carros voce deseja? ");

				int carroEscolhido = sc.nextInt();

				switch(carroEscolhido){
				case 1:
					System.out.print("Voce comprou o " + HatchNovoMenos60[carroEscolhido - 1]);
					break;
				case 2:
					System.out.print("Voce comprou o " + HatchNovoMenos60[carroEscolhido - 1]);
					break;
				case 3:
					System.out.print("Voce comprou o " + HatchNovoMenos60[carroEscolhido - 1]);
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
	
	
	public void carroSemiHatchNovo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if(investimento > 60000){

			for(int i = 0; i < HatchSemiMais60.length; i++){
				System.out.println("\n" + HatchSemiMais60[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch(carroEscolhido){
			case 1:
				System.out.print("Voce comprou o Webcarro " + HatchSemiMais60[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + HatchSemiMais60[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + HatchSemiMais60[carroEscolhido - 1]);
				break;
      case 4:
        chamada();
        break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		} else {
			for(int i = 0; i < HatchSemiMenos60.length; i++){
				System.out.println("\n" + HatchSemiMenos60[i]);
			}
				System.out.print("\nQual dos carros voce deseja? ");

				int carroEscolhido = sc.nextInt();

				switch(carroEscolhido){
				case 1:
					System.out.print("Voce comprou o " + HatchSemiMenos60[carroEscolhido - 1]);
					break;
				case 2:
					System.out.print("Voce comprou o " + HatchSemiMenos60[carroEscolhido - 1]);
					break;
				case 3:
					System.out.print("Voce comprou o " + HatchSemiMenos60[carroEscolhido - 1]);
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

    public void carroSedanNovo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if(investimento > 60000){

			for(int i = 0; i < SedanNovoMais60.length; i++){
				System.out.println("\n" + SedanNovoMais60[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch(carroEscolhido){
			case 1:
				System.out.print("Voce comprou o Webcarro " + SedanNovoMais60[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + SedanNovoMais60[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + SedanNovoMais60[carroEscolhido - 1]);
				break;
      case 4:
        chamada();
        break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		}else {
			for(int i = 0; i < SedanNovoMenos60.length; i++){
				System.out.println("\n" + SedanNovoMenos60[i]);

				System.out.print("\nQual dos carros voce deseja? ");

				int carroEscolhido = sc.nextInt();

				switch(carroEscolhido){
				case 1:
					System.out.print("Voce comprou o " + SedanNovoMenos60[carroEscolhido - 1]);
					break;
				case 2:
					System.out.print("Voce comprou o " + SedanNovoMenos60[carroEscolhido - 1]);
					break;
				case 3:
					System.out.print("Voce comprou o " + SedanNovoMenos60[carroEscolhido - 1]);
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
	}

  public void carroSemiSedanNovo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if(investimento > 60000){

			for(int i = 0; i < SedanSemiMais60.length; i++){
				System.out.println("\n" + SedanSemiMais60[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch(carroEscolhido){
			case 1:
				System.out.print("Voce comprou o Webcarro " + SedanSemiMais60[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + SedanSemiMais60[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + SedanSemiMais60[carroEscolhido - 1]);
				break;
      case 4:
        chamada();
        break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		} else {
			for(int i = 0; i < SedanSemiMenos60.length; i++){
				System.out.println("\n" + SedanSemiMenos60[i]);
			}
				System.out.print("\nQual dos carros voce deseja? ");

				int carroEscolhido = sc.nextInt();

				switch(carroEscolhido){
				case 1:
					System.out.print("Voce comprou o " + SedanSemiMenos60[carroEscolhido - 1]);
					break;
				case 2:
					System.out.print("Voce comprou o " + SedanSemiMenos60[carroEscolhido - 1]);
					break;
				case 3:
					System.out.print("Voce comprou o " + SedanSemiMenos60[carroEscolhido - 1]);
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
		


	public void chamada() {
		System.out.println("\nProcura um carro - 1:HATCH ou 2:SEDAN");
		System.out.print("Escolha: ");
		int opt = sc.nextInt();

		switch (opt) {

		case 1:
			escolhaHatch();
			break;

		case 2:
			escolhaSedan();
			break;

		}

	}

}

package concessionária;

import java.util.Scanner;

public class SUV {
	private String[] suvMais120 = { "(1)Jeep Compass - R$151.000", "(2)Mercedes Gla200 - R$160.000",
			"(3)Wolks T-Cross - R$140.000" };
	private String[] suvMenos120 = { "(1)Honda HRV - R$99.000,00", "(2)Chevrolet Tracker - R$70.000,00",
			"(3)Hyundai Creta - R$69.000,00" };

	Scanner sc = new Scanner(System.in);

	public void suv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nQuanto pretende investir no seu carro?");
		System.out.print("Valor em R$: ");
		int investimento = sc.nextInt();

		if (investimento > 120000) {

			for (int i = 0; i < suvMais120.length; i++) {
				System.out.println("\n" + suvMais120[i]);
			}

			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch (carroEscolhido) {
			case 1:
				System.out.print("Voce comprou o Webcarro " + suvMais120[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o Webcarro " + suvMais120[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o Webcarro " + suvMais120[carroEscolhido - 1]);
				break;
			case 4:
				chamada();
				break;
			default:
				System.out.println("Nao possuimos este carro na Webconcessionaria");
				break;
			}
		} else {
			for (int i = 0; i < suvMenos120.length; i++) {
				System.out.println("\n" + suvMenos120[i]);
			}
			System.out.print("\nQual dos carros voce deseja? ");

			int carroEscolhido = sc.nextInt();

			switch (carroEscolhido) {
			case 1:
				System.out.print("Voce comprou o " + suvMenos120[carroEscolhido - 1]);
				break;
			case 2:
				System.out.print("Voce comprou o " + suvMenos120[carroEscolhido - 1]);
				break;
			case 3:
				System.out.print("Voce comprou o " + suvMenos120[carroEscolhido - 1]);
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

		System.out.println("Deseja um SUV: 1:NOVO 2:SEMINOVO");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			suv();
			break;
		default:
			System.out.println("Nao possuimos esta opcao na concessionaria");
		}
	}
}

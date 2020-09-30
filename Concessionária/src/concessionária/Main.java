package concessionária;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Qual tipo de carro está procurando? (1:Convencional - 2:Esportivo - 3:SUV): ");
    int opcao = sc.nextInt();

    switch (opcao) {
      case 1: 
    	  Convencional carroConvencional = new Convencional();
    	  carroConvencional.chamada();
    	  break;
      case 2:
        Esportivo carroEsportivo = new Esportivo();
        carroEsportivo.chamada();
        break;
      case 3:
        SUV carroSUV = new SUV();
        carroSUV.chamada();
        break;
     default: 
    	 System.out.println("Inexistente");
    	 break;
     
  

  }
}
}

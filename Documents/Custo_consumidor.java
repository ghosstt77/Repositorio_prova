import java.util.Scanner;
public class Custo_consumidor {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("A seguir insira o preço de fabrica de um carro para calcularmos seu custo final ");
		
		System.out.println("Preço de fabrica:");
		double preco_fabrica = input.nextDouble();
		
		double distribuidor = (preco_fabrica / 100) * 28;
		
		double imposto = (preco_fabrica / 100) * 45;
		
		double preco_final = (preco_fabrica + distribuidor + imposto);
		
		System.out.println("Preço Final -  ao consumidor: " + preco_final);
		System.out.println("Preço Fabrica: " + preco_fabrica);
		System.out.println("Preço distribuidor: " + distribuidor);
		System.out.println("Preço dos importos: " + imposto);
		
		input.close();
	}

}

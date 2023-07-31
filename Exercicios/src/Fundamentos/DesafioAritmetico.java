package Fundamentos;

public class DesafioAritmetico {
public static void main(String[] args) {
	
	int a = 6;
	int primeraSoma= (3+2);
	int multiplicacao=3*2;
	float primeiraSubtracao=(1-5);
	float segundaSubtracao=(2-7);
	
	float primeiroResultado = (primeiraSubtracao)*(segundaSubtracao);
	double segundoResultado = primeiroResultado/2;
	double terceiroResultado = 	Math.pow(segundoResultado, 2);
	
	System.out.println(primeiraSubtracao);
	System.out.println(segundaSubtracao);
	System.out.println(primeiroResultado);
	System.out.println(segundoResultado);
	System.out.println(terceiroResultado);
		
	int quartoResultado = a * (primeraSoma);
	double quintoResultado = Math.pow(quartoResultado, 2);
	double sextoResultado =  quintoResultado/multiplicacao;
	
	System.out.println(quartoResultado);
	System.out.println(quintoResultado );
	System.out.println(sextoResultado);
	
	double antepenultimoResultado = sextoResultado-terceiroResultado;
	System.out.println(antepenultimoResultado);
	
	double penultimoResultado = Math.pow(antepenultimoResultado, 3);
	
	System.out.println(penultimoResultado );
	
	double dezElevado = Math.pow(10, 3);
	
	double ultimoResultado = penultimoResultado / dezElevado;
	
	System.out.println(ultimoResultado);
	
	}
}

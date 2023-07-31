package Fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
	//ATIVIDADE: ler n1, ler n2, ler e + - * / %; Não pode usar if/else
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número inteiro: ");
		
        String primeiro = scanner.nextLine();
        int primeiroInt = Integer.parseInt(primeiro);
        
        System.out.print("Digite o segundo número inteiro: ");
        String segundo = scanner.nextLine();
        int segundoInt = Integer.parseInt(segundo);
        
        System.out.print("Digite '+' para somar, '-' para subtrair, '*' para multiplicar, '/' para dividir e '%' para obter o módulo: ");
        String sinal = scanner.nextLine();

        System.out.println("Operadores: " + primeiroInt + sinal + segundoInt); 
        
        int resultado = 0;
        resultado = somar(primeiroInt, sinal, segundoInt);
        resultado = subtrair(resultado, sinal, segundoInt);
        resultado = multiplicar(resultado, sinal, segundoInt);
        resultado = dividir(resultado, sinal, segundoInt);
        resultado = modulo(resultado, sinal, segundoInt);

        System.out.println("Resultado: " + resultado);
    	}
    
		public static int somar(int a, String sinal, int b) {
			return (sinal.equals("+")) ? a + b : a;
		}
    
		public static int subtrair(int a, String sinal, int b) {
			return (sinal.equals("-")) ? a - b : a;
		}
    
		public static int multiplicar(int a, String sinal, int b) {
			return (sinal.equals("*")) ? a * b : a;
		}
    
		public static int dividir(int a, String sinal, int b) {
			return (sinal.equals("/")) ? a / b : a;
		}
    
		public static int modulo(int a, String sinal, int b) {
			return (sinal.equals("%")) ? a % b : a;
		}
}

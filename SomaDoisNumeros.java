import java.util.Scanner;
public class SomaDoisNumeros{
    public static void main(String [] args){
      //declaração de variáveis
      //sistema de tipos estático(compilador)
      Scanner leitor = new Scanner(System.in);
      double primeiroOperando;
      double segundoOperando;

      //entrada
      System.out.println("digite o primeiro operando");
      primeiroOperando = leitor.nextDouble();  
      System.out.println("digite o segundo operando");
      segundoOperando = leitor.nextDouble();

      //processamento
      double resultado = primeiroOperando + segundoOperando;

      //saída
      System.out.println(resultado);
    }
}
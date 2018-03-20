import java.util.Scanner;
public class ThaisClass
{
  public static void main(String []args){
      
    int numero;
    int somaImpar = 0, somaPar = 0;
    float contadorImpar = 0, contadorPar = 0;
    float taxaImpar, taxaPar;
      
    Scanner entrada = new Scanner (System.in);
      
    do{
    	System.out.print("Digite um número: ");
    	numero = entrada.nextInt();
      
    	if (numero%2 == 0 && numero>=0){
	    	somaPar = somaPar + numero;
	    	contadorPar = contadorPar + 1;
	    	System.out.println("O número " + numero + " é par.");
      	} else {
        	if (numero>=0){
        		somaImpar = somaImpar + numero;
        		contadorImpar = contadorImpar + 1;
        		System.out.println("O número " + numero + " é impar.");
        	}
    	}
    } while (numero >= 0);
   
	taxaImpar = (contadorImpar/(contadorPar + contadorImpar))*100;
	taxaPar = (contadorPar/(contadorPar + contadorImpar))*100;

	System.out.println ("A soma dos números impares é: " + somaImpar);
	System.out.println ("A soma dos números pares é: " + somaPar);
	System.out.println ("A porcentagem de números impares é: " + taxaImpar + "%");
	System.out.println ("A porcentagem de números pares é: " + taxaPar  + "%");
    }
}

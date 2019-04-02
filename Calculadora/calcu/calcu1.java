//rosa1
import java.util.Scanner;
package calcu1;
public class calcu1 {
	int num1=0;
	int num2=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Introduce numero 1 ");
	num1=sc.nextInt();
	System.out.println("Introduce numero 2 ");
	num2=sc.nextInt();
	
	int suma=num1+num2;
	int resta=num1-num2;
	int division=num1/num2;
	int multiplicacion=num1*num2;
	
	System.out.println("El resultado de la suma es: "+suma);
	System.out.println("El resultado de la resta es: "+resta);
	System.out.println("El resultado de la division es: "+division);
	System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
	
}

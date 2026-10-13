import java.util.Scanner;
public class While{
public static void main (String[] args) {
		//crear objeto
		Scanner EntradaTeclado = new Scanner(System.in);
int num;
System.out.println("Ciclo WHILE");
System.out.println("Dame un num");
num=EntradaTeclado.nextInt();

//inicia ciclo
int i = 1;
while (i <=num){

		
		
		System.out.println("Num: " + i);
i++;
}
}
}
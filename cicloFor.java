import java.util.Scanner;
class CicloFor{
public static void main (String[] args) {
		//crear objeto
		Scanner EntradaTeclado = new Scanner(System.in);
int num;
System.out.println("Dame un num");
num=EntradaTeclado.nextInt();
		
		for (int i= 1; i <=num; i++){
		System.out.println("Num: " + i);
}
}
}
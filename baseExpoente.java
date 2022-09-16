package lacoExercicios;
import java.util.*;
public class baseExpoente {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int base, e, i=1, n;
		System.out.println("Dgite o valor da base");
		base=in.nextInt();
		System.out.println("Digite o valor do expoente");
		e=in.nextInt();
		n=base*1;
		while (i<e) {
			n=n*base;
			i++;
		}
		System.out.println("O número da potência é:"+n);
	}
}

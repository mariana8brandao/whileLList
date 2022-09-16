package lacoExercicios;
import java.util.*;
public class somatoria {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i=1, n=0;
		while (i<=100) {
			n=n+i;
			i++;
			System.out.println(n);
		}in.close();
	}
}

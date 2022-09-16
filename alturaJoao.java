import java.util.*;
public class alturaJoao {
	public static void main (String[]args) {
		Scanner in =new Scanner (System.in);
		double j=134,p=145;
		int i=1;
		while (j<=p) {
			j=j+2.5;
			p=p+2;
			i++;
				
		}
		System.out.println( " A quantide de anos para João ficar mais alto que Pedro é:"+i);
		System.out.println("Tendo João em centímetros "+j );
		System.out.println("e Pedro" +p );
	}
	
}

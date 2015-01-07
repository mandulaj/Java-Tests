import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = scan.nextDouble();
		System.out.print("b = ");
		double b = scan.nextDouble();
		System.out.print("c = ");
		double c = scan.nextDouble();
		
		double nb = 0-b;
		
		double qp = (nb + Math.sqrt((b*b)-(4*a*c))) / (2*a);
		double qn = (nb - Math.sqrt((b*b)-(4*a*c))) / (2*a);
		
		System.out.println("The roots of the function are\nx="+qp+" n="+qn);
	}

}

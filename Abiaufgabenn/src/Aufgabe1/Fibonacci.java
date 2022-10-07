package Aufgabe1;
public class Fibonacci {
	public static void main(String[] args) {
		long f1 = 0;
		long f2 = 1;
		long f3 = 0;
		System.out.println("1.Zahl: "+f2);
		for (int i=0; i<50; i++) {			
			f3 = f1+f2;
			System.out.println((i+2)+".Zahl: "+ f3);
			f1=f2;
			f2=f3;
		}
	}
}



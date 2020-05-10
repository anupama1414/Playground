import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner po = new Scanner(System.in);
      int n = po.nextInt();
      int secLast = (n%100)/10;
      System.out.println(secLast);
	}
}
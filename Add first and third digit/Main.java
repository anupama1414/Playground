import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner me = new Scanner(System.in);
      int n = me.nextInt();
      int first = n/100;
      int last = n%10;
      int sum = first+last;
      System.out.println(sum);
	}
}
import java.util.Scanner;
class Palindrome {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int temp= num;
		int r= 0;
		int sum = 0;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(temp==sum){
			System.out.print("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
		
		
	}
 }

 
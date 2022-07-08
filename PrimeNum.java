import java.util.Scanner;
public class PrimeNum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number  :");
            boolean flag=false;
            int num=sc.nextInt();
            int i=2;
            while(i<num/2) {
                if(num%i==0) {
                    flag=true;
                    break;
                }
                i++;
            }
            if(!flag)
                System.out.println("This number is prime");
            else
                System.out.println("This number is not prime");
        }
}

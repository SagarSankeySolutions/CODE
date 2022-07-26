import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nFind Number is Even or Odd\n");
        System.out.println("Enter a Number");

        int num = sc.nextInt();
        

        if(num % 2 ==0 ){
            System.out.println(num+" Number is Even");
        }else
            System.out.println(num+" Number is Odd");
    }
    
}

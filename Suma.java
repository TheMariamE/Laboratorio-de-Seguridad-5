import java.util.Scanner;
public class SumaDeNumeros {

    public static void main(String[] args) {
        
        int no1, no2, suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        no1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        no2 = sc.nextInt();
        
        sc.close();
        suma = no1 + no2;
        System.out.println("Sum of these numbers is: "+suma);
    }
}

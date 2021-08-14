import java.util.Scanner;

//your code goes here
class Converter{
    public static String toBinary(int num){
        String binary = "";
        while(num >0){
            binary = (num%2)+binary;
            num /=2;
        }
        return binary;
    }
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Decimal To Binary --");
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
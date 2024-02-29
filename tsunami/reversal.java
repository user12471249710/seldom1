import java.util.Scanner;

public class reversal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();
    scanner.close();
        
        StringBuilder stringBuildervarible = new StringBuilder();
        stringBuildervarible.append(inputString);
        stringBuildervarible.reverse();
        System.out.println( "Reversed String  : " +stringBuildervarible);
    }
}
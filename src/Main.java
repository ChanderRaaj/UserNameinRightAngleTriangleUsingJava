import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Word : ");
        String word = input.next();

        for (int i = 1; i<= word.length(); i++){
            for (int j=1; j<=i; j++){
                System.out.print(word.charAt(j-1));
            }
            System.out.println();
        }
    }
}
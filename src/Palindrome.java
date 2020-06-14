import java.util.Scanner;

public class Palindrome {

  public  static void main(String... args) {
        Scanner sc = new Scanner(System.in);

          while (true) {
              System.out.println("Введіть слово - ");
              String input = sc.nextLine();
              String isPalindrome = new StringBuffer(input).reverse().toString();

              if (input.length() != 5) {
                  throw new RuntimeException("СЛОВО НЕ З 5 БУКВ!!!");
              }
              if (isPalindrome.equalsIgnoreCase(input)) {
                  System.out.println("Так, це паліндром");
              } else {
                  System.out.println("Ні, це не паліндром");
              }
          }
    }
}

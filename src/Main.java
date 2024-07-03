import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Exquisite Corpse");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Write a verb (third person form): It... ");
    String word = scanner.nextLine();
    System.out.printf("The big bird %s the scared Rabbit.", word);
    scanner.close();
  }
}

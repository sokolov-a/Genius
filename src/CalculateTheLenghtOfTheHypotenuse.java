import java.util.Scanner;

public class CalculateTheLenghtOfTheHypotenuse {

  public static void main(String[] args) {
    TheLegsAndTheHypotenuse Hypotenuse = new TheLegsAndTheHypotenuse();
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите размеры катетов: ");
    Hypotenuse.a = scan.nextInt();
    Hypotenuse.b = scan.nextInt();
    Hypotenuse.c = Math.sqrt(Math.pow(Hypotenuse.a, 2) + Math.pow(Hypotenuse.b, 2));
    System.out.print("Гипотенуза равна " + Hypotenuse.c);
  }
}

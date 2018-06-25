import java.util.Scanner;

public class TheLengthOfHypotenuseCalculator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите размеры катетов: ");
    RightTriangle rightTriangle = new RightTriangle(scan.nextDouble(),scan.nextDouble());
    System.out.print("Гипотенуза равна " + rightTriangle.getHypotenuse());
  }
}

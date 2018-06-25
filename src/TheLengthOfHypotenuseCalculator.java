import java.util.Scanner;

public class TheLengthOfHypotenuseCalculator {

  public static void main(String[] args) {
    RightTriangle rightTriangle = new RightTriangle();
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите размеры катетов: ");
    rightTriangle.setFirstCathetus(scan.nextInt());
    rightTriangle.setSecondCathetus(scan.nextInt());
    System.out.print("Гипотенуза равна " + rightTriangle.getHypotenuse());
  }
}

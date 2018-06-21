public class TheLengthOfHypotenuseCalculator {

  public static void main(String[] args) {
    RightTriangle rightTriangle = new RightTriangle();
    System.out.println("Введите размеры катетов: ");
    rightTriangle.setFirstCathetus();
    rightTriangle.setSecondCathetus();
    System.out.print("Гипотенуза равна " + rightTriangle.getHypotenuse());
  }
}

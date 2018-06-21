public class CalculateTheLenghtOfTheHypotenuse {

  public static void main(String[] args) {
    TheLegsAndTheHypotenuse Hypotenuse = new TheLegsAndTheHypotenuse();
    Hypotenuse.a = 2;
    Hypotenuse.b = 3;
    Hypotenuse.c = Math.sqrt(Math.pow(Hypotenuse.a, 2) + Math.pow(Hypotenuse.b, 2));
    System.out.print("Гипотенуза равна " + Hypotenuse.c);
  }
}

import java.util.Scanner;

public class RightTriangle {
    private double firstCathetus;
    private double secondCathetus;

    public RightTriangle(double firstCathetus, double secondCathetus) {
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    public double getHypotenuse() {
        return Math.sqrt(firstCathetus * firstCathetus + secondCathetus * secondCathetus);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры катетов: ");
        RightTriangle rightTriangle = new RightTriangle(scan.nextDouble(), scan.nextDouble());
        System.out.print("Гипотенуза равна " + rightTriangle.getHypotenuse());
    }
}

import java.util.Scanner;

public class RightTriangle {
    private int firstCathetus;
    Scanner scan = new Scanner(System.in);

    public int setFirstCathetus(){
        return firstCathetus = scan.nextInt();
    }

    private int secondCathetus;
    public int setSecondCathetus(){
        return secondCathetus = scan.nextInt();
    }

    private double hypotenuse;
    public double getHypotenuse(){
        return hypotenuse = Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
    }
}

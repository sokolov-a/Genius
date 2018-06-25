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
}

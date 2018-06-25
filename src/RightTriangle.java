public class RightTriangle {
    private int firstCathetus;
    private int secondCathetus;

    public void setFirstCathetus(int firstCathetus) {
        this.firstCathetus = firstCathetus;
    }

    public void setSecondCathetus(int secondCathetus) {
        this.secondCathetus = secondCathetus;
    }

    public double getHypotenuse() {
        return Math.sqrt(firstCathetus * firstCathetus + secondCathetus * secondCathetus);
    }
}

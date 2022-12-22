package MyArt;

public class Triangle extends Figure {

    private int base;
    private int heigth;

    public Triangle (char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.heigth = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public int calculateArea(int side) {
        return 0;
    }

    @Override
    public void drawFigure(int side) {

    }

    @Override
    public void paintFigure() {

    }
}

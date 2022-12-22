package MyArt;

public  abstract class Figure implements Artist, Painter {

    private char symbol;
    Color color;

    public Figure (char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public void calculateArea() {
        System.out.println("Я считаю площадь фигур");
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void drawFigure() {

    }

    public abstract void calculateArea(int longSide, int shortSide);

    //Считает площадь
    public abstract int calculateArea(int side);

    public abstract void drawFigure(int side);

    @Override
    public void paintFigure() {

    }

    public abstract void drawFigure(int side, int side2);
}

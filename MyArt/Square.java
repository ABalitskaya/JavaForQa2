package MyArt;

public class Square extends Figure {
    public static void main(String[] args) {
    }

    private int side;

    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea(int longSide, int shortSide) {

    }

    //Считает площадь
    @Override
    public int calculateArea(int side) {
        int squareArea = side * side;
        return squareArea;

    }
    // Рисует
    @Override
    public void drawFigure(int side) {
        String string = "*";
        for (int i = 0; i <= side ; i++) {
            string = string + "*";
        }
        for (int i = 0; i <= side; i++) {
            System.out.println(string);
        }

    }

    @Override
    public void paintFigure() {

    }
}

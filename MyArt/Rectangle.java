package MyArt;

public class Rectangle extends Figure {

    private int longSide;
    private int shortSide;

    public Rectangle(char symbol, Color color) {
        super(symbol, color);
    }

    @Override
    public void calculateArea(int longSide, int shortSide) {
       int area = longSide * shortSide;
       System.out.println(area);

    }

    @Override
    public int calculateArea(int side) {
        return 0;
    }

    @Override
    public void drawFigure(int side) {

    }


    @Override
    public void drawFigure(int side, int side2) {
        String string = "*";
        for (int i = 0; i <= side ; i++) {
            string = string + "*";
        }
        for (int i = 0; i <= side2; i++) {
            System.out.println(string);
        }

    }



}

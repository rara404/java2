public class Square extends Shape {

    private int side;

    public Square(int s) {
        this.side = s;
    }

    @Override
    public String draw() {
    String shape = "";

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
               if(i == 0 || i == (side - 1) || j == 0 || j == side -1 )
                   shape += "*";
               else
                   shape += " ";
            }
            shape += "\n";
        }
        return shape;
    }
}
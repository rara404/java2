public class Rectangle extends Shape{

    private int length;
    private int height;
    public Rectangle(int l, int h) {
        this.height = h;
        this.length = l;
    }


    @Override
    public String draw() {
        String shape = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if(i == 0 || i == (height - 1) || j == 0 || j == length -1 )
                    shape += "*";
                else
                    shape += " ";
            }
            shape += "\n";
        }
        return shape;
        }

}

public class Rectangle {
    int length;
    int width;
    Rectangle(){
        System.out.println("Area and perimeter of rectangle:");
    }
    Rectangle(int l,int w){
        length = l;
        width = w;
    }
    void area(){
        System.out.println(length*width);
    }
    void perimeter(){
        System.out.println(2*(length+width));
    }
    public static void main(String[] args) {
        Rectangle v1 = new Rectangle(5,6);
        v1.area();
        Rectangle v2 = new Rectangle(20,15);
        v2.perimeter();
    }
    }


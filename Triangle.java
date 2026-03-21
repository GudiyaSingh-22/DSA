public class Triangle {
    int base;
    int height;
    Triangle(){
        System.out.println("Area of triangle:");
    }
    Triangle(int b,int h){
        base = b;
        height = h;
    }
   /* void area(){
        System.out.println((base*height)/2);
    }
    public static void main(String[] args) {
        Triangle t1 = new Triangle (45,40);
        t1.area();
    }*/
   int getArea(){
 return (base*height/2);
   }
   public static void main(String[] args) {
    Triangle t1 = new Triangle(4,5);
    //System.out.println(t1.getArea());
    t1.getArea();
   }
}

package Inheritance;

 class box {
    int length;
    int width;
    int height;
    int weight;

box(){
    this.length=2;
    this.width=4;
    this.height=2;
}
box(int side){
    this.height=side;
    this.length=side;
    this.width=side;
}
box(int l,int h,int wi){
    this.length=l;
    this.height=h;
    this.width=wi;
}
box(box old){
this.height=old.height;
this.length=old.length;
this.width=old.width;
}
 public void info(){
    System.out.println("Running the code:");
}
}
class boxweight extends box {
    int weight;

    boxweight() {
     this.weight=6;
    }

    boxweight(int l, int h, int wi , int weight) {
        super(l, h, wi);
        this.weight=weight;
        System.out.println(this.weight);
        System.out.println(super.weight);
    }
    
    
}
public class Main{
public static void main(String[] args) {
    box b = new box(4);
    b.info();
    System.out.println(b.length + " " + b.width + " " + b.height );
    //box Box2=new box(Box2);
    //System.out.println(Box2.length + " " + Box2.height + " " + Box2.width);
    box b1 = new box(b);
    System.out.println(b1.width + " " + b1.height + " " + b1.length);
    box b2 = new boxweight(4,6,8,2);
    System.out.println(b2.height);
}
}

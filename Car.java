public class Car {
    int price;
    String Brand;
    int speed;
    Car(){
        System.out.println("Car properties:");
    }
    Car(int p,String b,int s){
        price=p;
        Brand=b;
        speed=s;
    }
    String getBrand(){
        return Brand;
    }
    int getprice(){
        return price;
    }
    public static void main(String[] args) {
        Car c1 = new Car(20000000, "bmw" ,120);
        Car c2 = new Car(40000000,"Ferrari",140);
        System.out.println(c1.getBrand());
        System.out.println(c2.getBrand());
        System.out.println(c1.getprice()); 
}
}


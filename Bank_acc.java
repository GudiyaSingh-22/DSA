public class Bank_acc {
    String Account_holder_name;
    String Address;
    int total_amount;
    Bank_acc(){
        System.out.println("Details of user:");
    }
    Bank_acc(String A,String add,int tot){
    Account_holder_name = A; 
    Address = add;
    total_amount = tot;
    }
    void display(){
        System.out.println("Name:" + Account_holder_name );
        System.out.println("add:" + Address);
        System.out.println("Balance:" + total_amount  );
    }
    void show(){
        System.out.println("Balance:" + total_amount  );
    }
    public static void main(String[] args) {
        // Default constructor
        Bank_acc b1 = new Bank_acc();
        b1.display();
        //Parameter cons
        Bank_acc b2 = new Bank_acc("gudiya", "xyz", 1500);
        b2.show();
    }  
}  


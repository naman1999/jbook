package ch7;
public class ObjectOrientedDemo {
    public static void main(String[] args) {
        Staff Sam = new Staff("Sam");
        Sam.setHoursWorked(160);
        int pay = Sam.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        
    }
}

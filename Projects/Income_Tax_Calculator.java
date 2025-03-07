import java.util.Scanner;
public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        float income = sc.nextFloat();
        float tax = 0;
        if (income<=2.5f){
            tax = tax+0;
        }
        else if (income>4 && income<=8f) {
            tax = tax + (income-2.5f)*0.05f;
        }
        else if (income<8 && income<=12) {
            tax = tax + (5.0f-2.5f)*0.05f;
            tax = tax + (income-5.0f)*0.2f;
        }
        else if (income>=20){
            tax = tax + (5.0f-2.5f)*0.05f;
            tax = tax + (10.0f-5.0f)*0.2f;
            tax = tax + (income-10.0f)*0.3f;
        }
        System.out.println("The total tax that have to to be paid is "+tax);

    }
}

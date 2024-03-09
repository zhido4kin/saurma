import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose saurma type");
        System.out.println("1 - Kebab");
        System.out.println("2 - GirosPita");
        System.out.println("3 - Burrito");
        int type = sc.nextInt();
        ArrayList<Saurma> saurmas = new ArrayList<>();
        Kebab k = new Kebab("cheddar", "pork", "+", "mayonnaise", "-", "+", "+");
        GirosPita g = new GirosPita("-", "grill chicken", "+", "mayonnaise+ketchup", "+", "+", "+",".");
        Burrito b = new Burrito("-", "chicken", "+", "barbeque", "+", "+", "+", ".");
        int size = 0;
        int price = 0;
        if (type == 1) {
            System.out.println("Chosen saurma - Kebab");
            saurmas.add(k);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20) {
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thank you!");
            } else {
                System.out.println("Come again!");
            }
        } else if (type == 2) {
            System.out.println("Chosen saurma - GirosPita");
            saurmas.add(g);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        } else if (type == 3) {
            System.out.println("Chosen saurma - Burrito");
            saurmas.add(b);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        } else {
            System.out.println("Error - you did something wrong, try again");
        }

        String str = "";
        for (Saurma saurma : saurmas) {
            str += "Chosen saurma type!" + "\n";
            if (saurma instanceof Kebab) {
                str += "Kebab: " + ((Kebab) saurma).printInfo() + "\n";
            } else if (saurma instanceof GirosPita) {
                str += "GirosPita: " + ((GirosPita) saurma).printInfo() + "\n";
            } else if (saurma instanceof Burrito) {
                str += "Burrito: " + ((Burrito) saurma).printInfo() + "\n";
            }
            str += "Choose your size : 20cm, 30cm, 40cm, 50cm" + "\n";
            price = 0;
            if (size == 20) {
                price = 6;
                str += "Price - " + price + "\n";
            } else if (size == 30) {
                price = 8;
                str += "Price - " + price + "\n";
            } else if (size == 40) {
                price = 10;
                str += "Price - " + price + "\n";
            } else if (size == 50) {
                price = 12;
                str += "Price - " + price + "\n";
            } else {
                str += "Size is not available" + "\n";
            }
            str += "Accept your order, press 1 - agree, press 2 - decline" + "\n";
            int o = sc.nextInt();
            if (o == 1) {
                str += "Thanks!" + "\n";
            } else {
                str += "Come again!" + "\n";
            }
        }
        System.out.println(str);
        try {
            FileWriter fw = new FileWriter("savermas.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

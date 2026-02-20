import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            
            Invoice[] invoices = new Invoice[n];
            
            for (int i = 0; i < n; i++) {
                
                String num = sc.nextLine();
                String desc = sc.nextLine();
                int qty = sc.nextInt();
                double price = sc.nextDouble();
                sc.nextLine();
                
                invoices[i] = new Invoice(num, desc, qty, price);
            }
            
            for (int i = 0; i < n; i++) {
                System.out.println(invoices[i].getInvoiceAmount());
            }
        }
    }
}

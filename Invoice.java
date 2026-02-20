class Invoice {

    String partNumber;
    String description;
    int quantity;
    double price;

    Invoice(String p, String d, int q, double pr) {
        partNumber = p;
        description = d;
        quantity = q;
        price = pr;
    }

    double getInvoiceAmount() {
        if (quantity < 0) quantity = 0;
        if (price < 0) price = 0;
        return quantity * price;
    }
}

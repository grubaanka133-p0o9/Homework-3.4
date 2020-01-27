public class SpecialOffer {
    Product product;
    String description;
    String start;
    String end;
    double discount;

    SpecialOffer(Product p, String d, String s, String e, double dis){
        product = p;
        description = d;
        start = s;
        end = e;
        discount = dis;
    }
    void showOffer(){
        double priceAfterDiscount = product.price - product.price * discount;
        System.out.println("Special offer on: "+ product.name);
        System.out.println(description);
        System.out.println("Start offer: "+ start);
        System.out.println("End offer: " + end);
        System.out.println("Discount: "+ discount * 100 + "%");
        System.out.println("Price after discount: "+ priceAfterDiscount + "zł");
    }
}

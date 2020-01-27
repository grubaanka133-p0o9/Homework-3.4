public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double p, String d, Category c){
        name = n;
        price = p;
        description = d;
        category = c;
    }
    Product(String n, double p, String d){
        name = n;
        price = p;
        description = d;
    }
    void showProduct(){
        System.out.println("Name: "+ name);
        System.out.println("Description: "+ description);
        System.out.println("Price: "+ price + "zł");
        if(category != null){
            System.out.println("Category: " + category.name);
        }
        else{
            System.out.println();
        }
    }
}

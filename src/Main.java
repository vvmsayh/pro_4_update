import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("John", "Lennon", "asgaj@gmail.com", "Qwret15");
        User u2 = new User("gohna@gmail.com");
        u2.User_Guest("Hue", "Janus", "asqwr124");

        Product p1 = new Product("Milk", 10, "696969", 2);
        Product p2 = new Product("Chocolate", 14, "12345");
        Product p3 = new Product("Walter", 9999, "192837465", 10);
        p2.ChangePrice(3);
        p3.changeNUmofPieces(1);

        // Create categories using different constructors
        Category category1 = new Category();
        Category category2 = new Category("Electronics");
        Category category3 = new Category("Gadgets", Arrays.asList(p1, p2));

        category1.addProduct(p1);
        category2.addProduct(p2);
        category3.addProduct(p3);

        // Create shopping carts using different constructors
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(u1);
        ShoppingCart cart3 = new ShoppingCart(u2, Arrays.asList(p3));

        // Add products to shopping carts
        cart1.addProduct(p1);
        cart1.addProduct(p2);

        cart2.addProduct(p2);
        cart2.addProduct(p3);

        // Remove product from cart2
        cart2.removeProduct(p3);

        // Pay for purchases
        System.out.println("Total price for cart1: $" + cart1.pay());
        System.out.println("Total price for cart2: $" + cart2.pay());
        System.out.println("Total price for cart3: $" + cart3.pay());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Owner theresa = new Owner("Theresa", 69, "420 Blaze street");
        Owner david = new Owner("David", 21, "Watssnei Plus ten");

        new Cat(2, "Bob", true, "ball", david);
        new Cat(5, "Oliver", false, "toy mouse", theresa);
        new Cat(7, "Yemen", false, "The hardcover copy of To Kill a Mockingbird", theresa);

        for (Cat kitty : Cat.cats) {
            kitty.printData();
        }
    }
}

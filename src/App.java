public class App {
    public static void main(String[] args) throws Exception {
        new Cat(2, "Bob", true, "ball");
        new Cat(5, "Oliver", false, "toy mouse");
        new Cat(7, "Yemen", false, "The hardcover copy of To Kill a Mockingbird");

        for (Cat kitty : Cat.cats) {
            kitty.printData();
        }
    }
}

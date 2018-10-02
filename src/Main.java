public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("mleko", 2.5);
        Product product2 = new Product("mleko", 2.5);

        if (product1.equals(product2)) {
            System.out.println("Produkty równe");

        } else {
            System.out.println("Produkty różne");
        }
/////////////////////
//        String str1 = new String("Ania");
//        String str2 = new String("Ania");
//
//        if (str1.equals(str2)) {
//            System.out.println("Napisy równe");
//
//        } else {
//            System.out.println("Napisy różne");
//        }
    }
}

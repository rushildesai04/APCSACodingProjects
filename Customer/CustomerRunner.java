//Customer Runner - Rushil Desai
public class CustomerRunner {
    public static void main(String[] args) {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Smith", 1002);
        System.out.println(c1.getName());
        System.out.println(c1.getID());
        System.out.println(c1.toString());
        System.out.println(c1.compare(c2));
    }
}

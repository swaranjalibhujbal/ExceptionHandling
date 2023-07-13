public class TestControlFlow {
    public static void main(String[] args) {
        try {
            //riskycode
            System.out.println("Statement1");
            System.out.println(100 / 0);
//            System.out.println("Statment3");
        } catch (Exception e) {
//            Handling code
            System.out.println(100 / 5);
            System.out.println(10/0);
        }
        System.out.println("Statment3");
        System.out.println("Statement5");
    }
}

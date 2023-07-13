public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println("swaranjali");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("is not divisible");
        }
        System.out.println("janvi");
    }
//    nullpointerException
    String text = null;
    int length =text.length();
}

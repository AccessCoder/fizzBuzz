public class Main {

    public static void main(String[] args) {
        Fizz fizz = new Fizz();
        for (int i = 1;i<=100;i++){
            System.out.println(fizz.fizzBuzz(i));
        }
    }

}

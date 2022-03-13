package lab_1;

public class Main {

    public static void main(String[] args) {
        Fib obj = new Fib();
        System.out.println("sum of even num:" + obj.getSumOfEvenNumbers(4000));
        System.out.println("number of odd number:" + obj.getNumberOfOdds());
        System.out.println("average of prime number that start of 9:  " + obj.get_avg_prime(1000));
    }
}

package lab_1;

import java.util.stream.IntStream;

public class Fib {
    private long[] Fibonacci;

    public Fib() {
        Fibonacci = null;
    }

    public void setFibonacci() {
        Fibonacci = new long[100];
        Fibonacci[0] = Fibonacci[1] = 1;
        IntStream.range(2, this.Fibonacci.length).forEach(i -> Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2]);

    }

    public void print_Fibonacci() {
        for (long index : Fibonacci) {
            System.out.println(index);
        }
    }

    public long getSumOfEvenNumbers(int goal) {
        if (Fibonacci == null) this.setFibonacci();
        long result = 0;
        for (long index : Fibonacci) {
            if (index % 2 == 0 && index < goal) {
                result += index;
            }
        }
        return result;
    }

    public long getNumberOfOdds() {

        if (Fibonacci == null) this.setFibonacci();
        long count = 0;
        for (long index : Fibonacci) {
            if (index % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public double get_avg_prime(double goal) {
        double sum_prime = 0.0;
        double cont = 0.0;

        if (Fibonacci == null)
            this.setFibonacci();

        for (long l : this.Fibonacci) {

            if ((this.Is_prime(l)) && (l % 10 == 9) && ((sum_prime + l) < goal)) {

                sum_prime += l;
                cont += 1;

            }
        }
        return sum_prime / cont;
    }

    public boolean Is_prime(long num) {
        if (num != 1) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
        } else {
            return false;
        }
        return true;
    }

}



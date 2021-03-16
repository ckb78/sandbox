// Import statement:
import java.util.ArrayList;

class PrimeDirective {
    
    // Checks if a number is prime.
    public boolean isPrime(int number){
        if (number == 2) return true;
        else if (number < 2) return false;
        else
            for(int i = 2; i < number; i++)
                if (number % i == 0){
                    return false;
                }
        return true;
    }

    // Creates an arraylist called primes, that only contains primers.
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers){
            if (isPrime(number) == true){
                primes.add(number);
            }
            else;

        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println();
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " is prime: " + pd.isPrime(numbers[i]));
        }
        System.out.println("The following are prime numbers:");
        System.out.println(pd.onlyPrimes(numbers));

    }
}
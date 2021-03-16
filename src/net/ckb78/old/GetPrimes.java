public class GetPrimes {

    public static void main(String[] args) {
        getPrimes(1000000);
        isPrime(499, true);
    }

    private static void getPrimes(int maxNum) {
        for (int num = 2; num < maxNum; num++){
            if (isPrime(num, false)){
                System.out.println(num);
            }
        }
    }

    private static boolean isPrime(int num, boolean printPrimeStatus) {
        boolean isPrime = true;
        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                isPrime = false;
                break;
            }
        }
        if (printPrimeStatus)
            printPrimeStatus(num);
        return isPrime;
    }

    private static void printPrimeStatus(int num){
        if (isPrime(num, false))
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number.");
    }
}



public class main {
    public static void main(String[] args) {

        String primeNumbers = "";
        int counter = 0;
        
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter ++;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}

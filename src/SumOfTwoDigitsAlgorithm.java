class SumOfTwoDigitsAlgorithm {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int randomNumber = (int)(Math.random() * 1000000);
            System.out.print(randomNumber + " -> ");
            solution(randomNumber);
        }
    }
    static void solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
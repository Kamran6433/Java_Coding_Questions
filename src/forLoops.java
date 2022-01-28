public class forLoops {
    public static void main (String[] args) {
        String[] programmer_hideout = {"Harry", "Jack", "Kill me now"};
        for (int i = 0; i < programmer_hideout.length; i++) {
            System.out.print(programmer_hideout[i] + " ");
        }
        System.out.println(" "); // this separates the two outputs
        int j;
        for (j = 100; j > 1; j-=2) {
            System.out.print(j + " ");
        }
    }
}

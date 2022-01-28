public class Maths {
    public static void main(String[] args){
        System.out.println(question1());
        System.out.println(question2());
        System.out.println(question3());
        System.out.println(question4());
        System.out.println(question5());
        System.out.println(question6());
    }
    public static int question1(){
        int a = (101 + 0) / 3;
        return a;
    }
    public static double question2(){
        double b = 3.0e-6 * 10000000.1;
        return b;
    }
    public static boolean question3(){
        boolean c = true && true;
        return c;
    }
    public static boolean question4(){
        boolean d = false && true;
        return d;
    }
    public static boolean question5(){
        boolean e = (false && false) || (true && true);
        return e;
    }
    public static boolean question6(){
        boolean f = (false || false) && (true && true);
        return f;
    }
}

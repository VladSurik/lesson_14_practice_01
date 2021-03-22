public class Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 35);
        TimeSpan t2 = new TimeSpan(1, 45);
        TimeSpan t3 = new TimeSpan(1, 15);
        t1.add(t2);
        System.out.println(t1.toString());
        t1.sub(t3);
        System.out.println(t1.toString());
        t1.mult(0.5);
        System.out.println(t1.toString());
    }
}

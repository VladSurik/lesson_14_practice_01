public class Main {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(1, 35);
        timeSpan.add(3, 55);
        timeSpan.sub(2, 45);
        timeSpan.mult(2.0);
        System.out.println(timeSpan.toString());
    }
}

package singleton;

public class pr2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 100; i *= 3) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}

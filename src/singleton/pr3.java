package singleton;

public class pr3 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for (int k = 0; k < 3; k++) {
            if((++i > 1) && (++j > 1)) {
                i++;
                System.out.println(i);
                System.out.println(j);
            }
        }
        System.out.println(i + " " + j);
    }
}

package Practice;

public class PYQ2022q1 {
    public static void main(String[] args) {
        int x = 5, y = 4;
        System.out.println(++x ^ y-- | (x = y & 1100));
    }
}

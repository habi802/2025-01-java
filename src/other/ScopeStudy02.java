package other;

public class ScopeStudy02 {
    int sum = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            System.out.println(i);
        }

        {
            int sum = 0;
            //System.out.println(i);
        }
        {
            int sum = 0;
            //System.out.println(i);
        }
    }
}

package classActivity12A;

public class JavaExceptionEx {

    public static void main(String[] args) {


        try {
            int num = 50 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Run other parts of the code");
    }
}

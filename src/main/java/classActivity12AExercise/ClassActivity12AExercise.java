package classActivity12AExercise;

public class ClassActivity12AExercise {

    public static void main(String[] args) {

        int num1 = 50;

        int num2 = 0;

        int num3;

       try {
           num3 = num1 / num2;
       } catch (Exception e) {
           System.out.println(e);
          num3 = num1 / (num2 + 2);
           System.out.println(num3);
       }
    }
}

package classActivity1A;

public class Main {

    public static void main(String[] args) {

//        InternshipForm obj1 = new InternshipForm("John Doe", 21, "Male");
//
//        InternshipForm obj2 =  new InternshipForm("Jane Doe", 18, "Female");
//
//        System.out.println("Name : " + obj1.getName());
//        System.out.println("Age : " + obj1.getAge());
//        System.out.println("Gender : " + obj1.getGender());
//
//
//        System.out.println("*******************obj2*******************");
//
//        System.out.println("Name : " + obj2.getName());
//        System.out.println("Age : " + obj2.getAge());
//        System.out.println("Gender : " + obj2.getGender());


        UBA uba = new UBA();
        double ubaRate = uba.interest(8.0);
        System.out.println("This is UBA rate " + ubaRate + "%");


        GTB gtb = new GTB();
        double gtbRate = gtb.interest(7.0);
        System.out.println("This is GTB rate " +gtbRate + "%");

        Zenith zenith = new Zenith();
        double zenithRate = zenith.interest(9.0);
        System.out.println("This is Zenith rate " +zenithRate + "%");
    }
}

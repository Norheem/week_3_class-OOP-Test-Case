package classActivity1A;

public class InternshipForm {

    public InternshipForm() {
    }

    private  String name;

    private int age;

    private String gender;

    public InternshipForm(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

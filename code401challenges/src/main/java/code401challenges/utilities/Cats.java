package code401challenges.utilities;

public class Cats {
    public String name;
    public String color;
    public int age;
    public String gender;
    public String picture;

    public Cats(String name, String color, int age, String gender, String picture) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.picture = picture;
    }

    public void catInfo(){
        System.out.println(("name: " + name + "age: " + age));
    }
}

package code401challenges.utilities;
// resource: https://beginnersbook.com/2013/03/constructors-in-java/

public class Dogs {

    public String name;
    public String color;
    public int age;
    public String gender;
    public String picture;


    public Dogs(String name, String color, int age, String gender, String picture) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.picture = picture;
    }

    public void dogInfo(){
        System.out.println(("name: " + name + "age: " + age));
    }

}

package haocai.gson.bean;

/**
 * Created by xionhgu on 2016/9/2.
 * Email：965705418@qq.com
 */
public class Person {




    /**
     * name : Tom
     * age : 90
     */

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

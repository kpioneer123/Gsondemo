package haocai.gson.bean5;

import java.util.Date;

/**
 * Created by xionhgu on 2016/9/3.
 * Email：965705418@qq.com
 */
public class Student5 {


    /**
     * id : 1
     * name : 李坤
     * birthDay : Jun 22, 2012 10:04:12 PM
     */

    private int id;
    private String name;
    private Date birthDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}

package haocai.gson.bean4;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by xionhgu on 2016/9/3.
 * Email：965705418@qq.com
 */
public class Student4 {

    private int id;

    @Expose
    private String name;

    @Expose
    @SerializedName("bir")
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
        return "Student4 [birthDay=" + birthDay + ", id=" + id + ", name="
                + name + "]";
    }

}

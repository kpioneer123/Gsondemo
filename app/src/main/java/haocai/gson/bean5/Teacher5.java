package haocai.gson.bean5;

/**
 * Created by xionhgu on 2016/9/3.
 * Email：965705418@qq.com
 */
public class Teacher5 {


    /**
     * id : 2
     * name : 丁老师
     * title : 讲师
     */

    private int id;
    private String name;
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

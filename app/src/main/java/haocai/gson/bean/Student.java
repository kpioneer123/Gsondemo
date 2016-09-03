package haocai.gson.bean;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

/**
 * Created by xionhgu on 2016/9/2.
 * Email：965705418@qq.com
 */
public class Student {


    /**
     * email : 965705418@qq.com
     * nickName : 熊虎
     * id : 1
     * age : 24
     */

    public String email;
    public String nickName;
    public int id;
    public int age;
    public List<String> books;
    /**
     * 3 : 英语
     * 2 : 语文
     * 1 : 数学
     * 6 : 生物
     * 5 : 化学
     * 4 : 物理
     */

    public HashMap<String, String> booksMap;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }









}

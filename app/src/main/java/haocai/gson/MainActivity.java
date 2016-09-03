package haocai.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import haocai.gson.bean.Person;
import haocai.gson.bean.Student;
import haocai.gson.bean3.Student3;
import haocai.gson.bean4.Student4;
import haocai.gson.bean5.Student5;
import haocai.gson.bean5.TableData;
import haocai.gson.bean5.Teacher5;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void test1(View view)
    {
        Gson gson = new Gson();

        /**
         * 将给定的 JSON 字符串转换成指定的类型对象
         */
        String json = "{\"name\":\"Tom\",\"age\":90}";
        Person person = gson.fromJson(json, Person.class);
        Log.d("GSON", person.toString());

        /**
         * 将给定的目标对象转换成 JSON 格式的字符串
         */
        String json_Person = gson.toJson(person);
        Log.d("GSON", json_Person);

        /**
         * 将给定的集合对象转换成 JSON 格式的字符串
         */
        ArrayList<Person> persons = new ArrayList<Person>();
        Collections.addAll(persons, new Person("tom",10), new Person("jon",20));
        String json_list = gson.toJson(persons);
        Log.d("GSON", json_list);

        /**
         * 将给定的 JSON 格式字符串转换为带泛型的集合对象
         */
        List<Person> retList = gson.fromJson(json_list, new TypeToken<List<Person>>() {}.getType());
        for (Person p : retList) {
            Log.d("GSON", p.toString());
        }
    }
    public void test2(View view)
    {


        Gson gson = new Gson();
        Student student = new Student();
        student.id = 1;
        student.nickName = "熊虎";
        student.age = 24;
        student.email = "965705418@qq.com";
        Log.e(TAG, gson.toJson(student));
       //  {"age":24,"email":"965705418@qq.com","id":1,"nickName":"熊虎"}


        Gson gson2 = new Gson();
        Student student2 = new Student();
        student2.id = 1;
        student2.nickName = "熊虎";
        student2.age = 24;
        student2.email = "965705418@qq.com";
        ArrayList<String> books = new ArrayList<String>();
        books.add("数学");
        books.add("语文");
        books.add("英语");
        books.add("物理");
        books.add("化学");
        books.add("生物");
        student2.books = books;
        Log.e(TAG, gson2.toJson(student2));
//{"age":24,"books":["数学","语文","英语","物理","化学","生物"],"email":"965705418@qq.com","id":1,"nickName":"熊虎"}


        Gson gson3 = new Gson();
        Student student3 = new Student();
        student3.id = 1;
        student3.nickName = "小熊";
        student3.age = 24;
        student3.email = "965705418@qq.com";
        ArrayList<String> books3 = new ArrayList<String>();
        books3.add("数学");
        books3.add("语文");
        books3.add("英语");
        books3.add("物理");
        books3.add("化学");
        books3.add("生物");
        student3.books = books3;
        HashMap<String, String> booksMap3 = new HashMap<String, String>();
        booksMap3.put("1", "数学");
        booksMap3.put("2", "语文");
        booksMap3.put("3", "英语");
        booksMap3.put("4", "物理");
        booksMap3.put("5", "化学");
        booksMap3.put("6", "生物");
        student3.booksMap = booksMap3;
        Log.e(TAG, gson3.toJson(student3));
     // {"age":24,"books":["数学","语文","英语","物理","化学","生物"],"booksMap":{"5":"化学","4":"物理","1":"数学","3":"英语","6":"生物","2":"语文"},"email":"965705418@qq.com","id":1,"nickName":"小熊"}

        Gson gson4 = new Gson();
        Student student4 = new Student();
        student4.id = 1;
        student4.nickName = "小熊";
        student4.age = 24;
        student4.email = "965705418@qq.com";
        ArrayList<String> books4 = new ArrayList<String>();
        books4.add("数学");
        books4.add("语文");
        books4.add("英语");
        books4.add("物理");
        books4.add("化学");
        books4.add("生物");
        student4.books = books4;
        HashMap<String, String> booksMap4 = new HashMap<String, String>();
        booksMap4.put("1", "数学");
        booksMap4.put("2", "语文");
        booksMap4.put("3", "英语");
        booksMap4.put("4", "物理");
        booksMap4.put("5", "化学");
        booksMap4.put("6", "生物");
        student4.booksMap = booksMap4;
        String result = gson4.toJson(student4);

        Student studentG = gson4.fromJson(result, Student.class);

        Log.e(TAG, "id:" + studentG.id);
        Log.e(TAG, "nickName:" + studentG.nickName);
        Log.e(TAG, "age:" + studentG.age);
        Log.e(TAG, "email:" + studentG.email);
        Log.e(TAG, "books size:" + studentG.books.size());
        Log.e(TAG, "booksMap size:" + studentG.booksMap.size());



    }

    /**
     * 简单对象转化和带泛型的List转化
     * @param view
     */
    public void test3(View view) {
        Gson gson = new Gson();

        Student3 student1 = new Student3();
        student1.setId(1);
        student1.setName("李坤");
        student1.setBirthDay(new Date());

        // //////////////////////////////////////////////////////////
        System.out.println("----------简单对象之间的转化-------------");
        // 简单的bean转为json
        String s1 = gson.toJson(student1);
        System.out.println("简单Bean转化为Json===" + s1);

        // json转为简单Bean
        Student student = gson.fromJson(s1, Student.class);
        System.out.println("Json转为简单Bean===" + student);
        // 结果:
        // 简单Bean转化为Json==={"id":1,"name":"李坤","birthDay":"Jun 22, 2012 8:27:52 AM"}
        // Json转为简单Bean===Student [birthDay=Fri Jun 22 08:27:52 CST 2012, id=1,
        // name=李坤]
        // //////////////////////////////////////////////////////////

        Student3 student2 = new Student3();
        student2.setId(2);
        student2.setName("曹贵生");
        student2.setBirthDay(new Date());

        Student3 student3 = new Student3();
        student3.setId(3);
        student3.setName("柳波");
        student3.setBirthDay(new Date());

        List<Student3> list = new ArrayList<Student3>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println("----------带泛型的List之间的转化-------------");
        // 带泛型的list转化为json
        String s2 = gson.toJson(list);
        System.out.println("带泛型的list转化为json==" + s2);

        // json转为带泛型的list
        List<Student3> retList = gson.fromJson(s2,
                new TypeToken<List<Student3>>() {
                }.getType());
        for (Student3 stu : retList) {
            System.out.println(stu);
        }
//        ----------简单对象之间的转化-------------
//                简单Bean转化为Json==={"birthDay":"Sep 3, 2016 2:52:48 PM","id":1,"name":"李坤"}
//        Json转为简单Bean===haocai.gson.bean.Student@756953a
//                ----------带泛型的List之间的转化-------------
//                带泛型的list转化为json==[{"birthDay":"Sep 3, 2016 2:52:48 PM","id":1,"name":"李坤"},{"birthDay":"Sep 3, 2016 2:52:48 PM","id":2,"name":"曹贵生"},{"birthDay":"Sep 3, 2016 2:52:48 PM","id":3,"name":"柳波"}]
//        Student3{id=1, name='李坤', birthDay=Sat Sep 03 14:52:48 GMT+08:00 2016}
//        Student3{id=2, name='曹贵生', birthDay=Sat Sep 03 14:52:48 GMT+08:00 2016}
//        Student3{id=3, name='柳波', birthDay=Sat Sep 03 14:52:48 GMT+08:00 2016}

    }


    /**   Gson注解和GsonBuilder
     * @param view
     */
    public void test4(View view) {

        //注意这里的Gson的构建方式为GsonBuilder,区别于test1中的Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation() //不导出实体中没有用@Expose注解的属性
                .enableComplexMapKeySerialization() //支持Map的key为复杂对象的形式
                .serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS")//时间转化为特定格式
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)//会把字段首字母大写,注:对于实体上使用了@SerializedName注解的不会生效.
                .setPrettyPrinting() //对json结果格式化.
                .setVersion(1.0)    //有的字段不是一开始就有的,会随着版本的升级添加进来,那么在进行序列化和返序列化的时候就会根据版本号来选择是否要序列化.
                //@Since(版本号)能完美地实现这个功能.还的字段可能,随着版本的升级而删除,那么
                //@Until(版本号)也能实现这个功能,GsonBuilder.setVersion(double)方法需要调用.
                .create();



        Student4 student1 = new Student4();
        student1.setId(1);
        student1.setName("李坤");
        student1.setBirthDay(new Date());

        // //////////////////////////////////////////////////////////
        System.out.println("----------简单对象之间的转化-------------");
        // 简单的bean转为json
        String s1 = gson.toJson(student1);
        System.out.println("简单Bean转化为Json===" + s1);

        // json转为简单Bean
        Student4 student = gson.fromJson(s1, Student4.class);
        System.out.println("Json转为简单Bean===" + student);
        // //////////////////////////////////////////////////////////

        Student4 student2 = new Student4();
        student2.setId(2);
        student2.setName("曹贵生");
        student2.setBirthDay(new Date());

        Student4 student3 = new Student4();
        student3.setId(3);
        student3.setName("柳波");
        student3.setBirthDay(new Date());

        List<Student4> list = new ArrayList<Student4>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println("----------带泛型的List之间的转化-------------");
        // 带泛型的list转化为json
        String s2 = gson.toJson(list);
        System.out.println("带泛型的list转化为json==" + s2);

        // json转为带泛型的list
        List<Student4> retList = gson.fromJson(s2,
                new TypeToken<List<Student4>>() {
                }.getType());
        for (Student4 stu : retList) {
            System.out.println(stu);
        }



//
//        ----------简单对象之间的转化-------------
//                简单Bean转化为Json==={
//                "bir": "2016-09-03 15:33:59:714",
//                "Name": "李坤"
//        }
//        Json转为简单Bean===Student4 [birthDay=Sat Sep 03 15:33:59 GMT+08:00 2016, id=0, name=李坤]
//        ----------带泛型的List之间的转化-------------
//                带泛型的list转化为json==[
//        {
//            "bir": "2016-09-03 15:33:59:714",
//                "Name": "李坤"
//        },
//        {
//            "bir": "2016-09-03 15:33:59:732",
//                "Name": "曹贵生"
//        },
//        {
//            "bir": "2016-09-03 15:33:59:732",
//                "Name": "柳波"
//        }
//        ]
//        Student4 [birthDay=Sat Sep 03 15:33:59 GMT+08:00 2016, id=0, name=李坤]
//        Student4 [birthDay=Sat Sep 03 15:33:59 GMT+08:00 2016, id=0, name=曹贵生]
//        Student4 [birthDay=Sat Sep 03 15:33:59 GMT+08:00 2016, id=0, name=柳波]

}

    /** 实际开发中的特殊需求处理
     * @param view
     */
    public void test5(View view) {

        // 对象转为Json-->start
        Student5 student1 = new Student5();
        student1.setId(1);
        student1.setName("李坤");
        student1.setBirthDay(new Date());

        Student5 student2 = new Student5();
        student2.setId(2);
        student2.setName("曹贵生");
        student2.setBirthDay(new Date());

        Student5 student3 = new Student5();
        student3.setId(3);
        student3.setName("柳波");
        student3.setBirthDay(new Date());

        List<Student5> stulist = new ArrayList<Student5>();
        stulist.add(student1);
        stulist.add(student2);
        stulist.add(student3);

        Teacher5 teacher1 = new Teacher5();
        teacher1.setId(1);
        teacher1.setName("米老师");
        teacher1.setTitle("教授");

        Teacher5 teacher2 = new Teacher5();
        teacher2.setId(2);
        teacher2.setName("丁老师");
        teacher2.setTitle("讲师");
        List<Teacher5> teacherList = new ArrayList<Teacher5>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        TableData td1 = new TableData();
        td1.setTableName("students");
        td1.setTableData(stulist);

        TableData td2 = new TableData();
        td2.setTableName("teachers");
        td2.setTableData(teacherList);

        List<TableData> tdList = new ArrayList<TableData>();
        tdList.add(td1);
        tdList.add(td2);
        Gson gson = new Gson();
        String s = gson.toJson(tdList);

        System.out.println(s);
        // 结果:[{"tableData":[{"birthDay":"Sep 3, 2016 3:31:35 PM","id":1,"name":"李坤"},{"birthDay":"Sep 3, 2016 3:31:35 PM","id":2,"name":"曹贵生"},{"birthDay":"Sep 3, 2016 3:31:35 PM","id":3,"name":"柳波"}],"tableName":"students"},{"tableData":[{"id":1,"name":"米老师","title":"教授"},{"id":2,"name":"丁老师","title":"讲师"}],"tableName":"teachers"}]
        // 对象转为Json-->end

        // /////////////////////////////////////////////////////////////////////

        // 将json转为数据-->start
        List<TableData> tableDatas2 = gson.fromJson(s,
                new TypeToken<List<TableData>>() {
                }.getType());
        for (int i = 0; i < tableDatas2.size(); i++) {
            TableData entityData = tableDatas2.get(i);
            String tableName = entityData.getTableName();
            List tableData = entityData.getTableData();
            String s2 = gson.toJson(tableData);
            // System.out.println(s2);
            // System.out.println(entityData.getData());
            if (tableName.equals("students")) {
                System.out.println("students");
                List<Student5> retStuList = gson.fromJson(s2,
                        new TypeToken<List<Student5>>() {
                        }.getType());
                for (int j = 0; j < retStuList.size(); j++) {
                    System.out.println(retStuList.get(j));
                }

            } else if (tableName.equals("teachers")) {
                System.out.println("teachers");
                List<Teacher5> retTchrList = gson.fromJson(s2,
                        new TypeToken<List<Teacher5>>() {
                        }.getType());
                for (int j = 0; j < retTchrList.size(); j++) {
                    System.out.println(retTchrList.get(j));
                }
            }
        }

        // Json转为对象-->end

//        students
//        Student5{id=1, name='李坤', birthDay='Sat Sep 03 15:31:35 GMT+08:00 2016'}
//        Student5{id=2, name='曹贵生', birthDay='Sat Sep 03 15:31:35 GMT+08:00 2016'}
//        Student5{id=3, name='柳波', birthDay='Sat Sep 03 15:31:35 GMT+08:00 2016'}
//        teachers
//        Teacher5{id=1, name='米老师', title='教授'}
//        Teacher5{id=2, name='丁老师', title='讲师'}
    }
}

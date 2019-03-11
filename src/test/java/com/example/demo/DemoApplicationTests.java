package com.example.demo;

import com.example.demo.bean.Box;
import com.example.demo.api.IConvert;
import com.example.demo.api.Java8Api;
import com.example.demo.bean.Something;
import com.example.demo.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes =DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private Java8Api java8Api;
	@Test
	public void contextLoads() {
        System.out.println(1);
        System.out.println(java8Api.haohaiyou());
        System.out.println(2);
	}

    //@Test
    public void good() {
        System.out.println("你好呀");
    }

    @Test
    public void stream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String[] strs = {"java8", "is", "easy", "to", "use"};
        List<Integer> evens = new ArrayList<>();
        evens.add(1);
        evens.add(2);
        evens.add(3);
        evens.add(4);
//        System.out.println(strings);
//        long count = strings.stream().filter(string -> string.isEmpty()).count();
//        System.out.println("空字符数量为:"+count);
//        long count1 = strings.stream().filter(string -> string.length() == 3).count();
//        System.out.println("长度为3的字符串的数量为:"+count1);
//        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println("不为空的字符串为:"+collect);
//        String collect1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
//        System.out.println("将字符串用,隔开并合并在一起:"+collect1);
//
//        User user = new User();
//        String str="";
//        Optional<Object> empty = Optional.empty();
//
//        System.out.println("str的长度为:"+Optional.ofNullable(str).map(String::length).orElse(0));
//        System.out.println("user中name的名字是:"+Optional.ofNullable(user).map(User::getUserName).orElse("no name"));
//
//        System.out.println("event中所有的偶数为"+evens.stream().filter(num->num % 2==0).collect(Collectors.toList()));
// 初始化
        List<Student> students = new ArrayList<Student>() {
            {
                add(new Student(20160001, "孔明", 20, 1, "土木工程", "武汉大学"));
                add(new Student(20160002, "伯约", 21, 2, "信息安全", "武汉大学"));
                add(new Student(20160003, "玄德", 22, 3, "经济管理", "武汉大学"));
                add(new Student(20160004, "云长", 21, 2, "信息安全", "武汉大学"));
                add(new Student(20161001, "翼德", 21, 2, "机械与自动化", "华中科技大学"));
                add(new Student(20161002, "元直", 23, 4, "土木工程", "华中科技大学"));
                add(new Student(20161003, "奉孝", 23, 4, "计算机科学", "华中科技大学"));
                add(new Student(20162001, "仲谋", 22, 3, "土木工程", "浙江大学"));
                add(new Student(20162002, "鲁肃", 23, 4, "计算机科学", "浙江大学"));
                add(new Student(20163001, "丁奉", 24, 5, "土木工程", "南京大学"));
            }
        };
        System.out.println("所有武汉大学的学生:"+ students.stream().filter(student->"武汉大学".equals(student.getSchool())).map(Student::getName) .collect(Collectors.toList()));
        System.out.println("筛选出所有不重复的偶数:"+evens.stream().filter(num->num%2==0).distinct().collect(Collectors.toList()));
        System.out.println("帅选出所有计算机科学的学生的姓名:"+students.stream().filter(student->"计算机科学".equals(student.getMajor())).mapToInt(Student::getAge).sum());
        System.out.println("显示所有的非重复的字符:"+Arrays.stream(strs).map(str->str.split("1,2")).flatMap(Arrays::stream) .distinct().collect(Collectors.toList()));
        System.out.println("是否所有的学生的年龄都已经满18岁:"+students.stream().allMatch(student->student.getAge()>=18));

//        IConvert<String, String> convert = Something::startsWith;
//        String converted = convert.convert("123");
//        System.out.println("converted:"+converted);

        IConvert<String, Something> convert = Something::new;
        Something something = convert.convert("constructors");
        System.out.println("something"+something.toString());
        Box<Student> box = new Box<Student>();
        box.setObject(new Student());
        Student object = box.getObject();


    }

}


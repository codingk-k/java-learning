package cn.lnlwf.base.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liweifang
 * @desc
 * @date 2021-03-11 11:39
 */
class Student {

    private Integer age;

    private String haircolor;

    private Integer no;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Student(Integer age, String haircolor, Integer no) {
        this.age = age;
        this.haircolor = haircolor;
        this.no = no;
    }


}

public class Testfilter {

    public static void main(String[] args) {

        Student s1 = new Student(11, "black", 456);
        Student s2 = new Student(12, "red", 123);//old

        Student s3 = new Student(11, "black", 123);
        Student s4 = new Student(12, "red", 123);
        Student s5 = new Student(15, "white", 123);//new

        List<Student> oldList = new ArrayList<Student>() {{
            add(s1);
            add(s2);
        }};
        List<Integer> oldAgeList = oldList.stream().map(x -> x.getAge()).collect(Collectors.toList());

        List<Student> newList = new ArrayList<Student>() {{
            add(s3);
            add(s4);
            add(s5);
        }};
        List<Integer> newAgeList = oldList.stream().map(x -> x.getAge()).collect(Collectors.toList());

        //List<Bean> 根据Bean的一个属性求两个list的交集 差集
        //交集
        List<Student> updList = oldList.stream()
                .filter(item -> newList.stream()
                        .map(e -> e.getAge())
                        .collect(Collectors.toList())
                        .contains(item.getAge()))
                .collect(Collectors.toList());
        System.out.println(updList);

        // 差集 (new - old)
        List<Student> addList = newList.stream()
                .filter(item -> !oldList.stream()
                        .map(e -> e.getAge() )
                        .collect(Collectors.toList())
                        .contains(item.getAge()))
                .collect(Collectors.toList());
        System.out.println(addList);

        // 差集 (old - new)
        List<Student> delList = oldList.stream()
                .filter(item -> !newList.stream()
                        .map(e -> e.getAge() )
                        .collect(Collectors.toList())
                        .contains(item.getAge()))
                .collect(Collectors.toList());
        System.out.println(delList);

        //List<Bean> 根据Bean的2个属性求两个list的交集 差集？？
        //交集
        List<Student> updList1 = oldList.stream()
                .filter(item -> newList.stream()
                        .map(e -> e.getAge())
                        .collect(Collectors.toList())
                        .contains(item.getAge()))
                .filter(item -> newList.stream()
                        .map(e -> e.getHaircolor())
                        .collect(Collectors.toList())
                        .contains(item.getHaircolor()))
                .collect(Collectors.toList());
        System.out.println(updList);

    }

}

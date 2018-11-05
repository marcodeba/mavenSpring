package springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)factory.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}

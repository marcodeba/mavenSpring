package springtest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student stu = new Student();
            stu.setAge(20);
            stu.setName("postProcessBeforeInitialization");

            return stu;
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println(beanName + " postProcessAfterInitialization");
        return bean;
    }
}

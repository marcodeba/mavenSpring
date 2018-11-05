package springtest.factorybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) factory.getBean("car");
        car.getCarInfos();

        FactoryBean fb = (FactoryBean) factory.getBean("&car");
        try {
            Car car2 = (Car)fb.getObject();
            car2.getCarInfos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

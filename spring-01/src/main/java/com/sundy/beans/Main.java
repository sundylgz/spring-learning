package com.sundy.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setUser("Tom");
//		helloWorld.hello();

        //1.创建Spring的IOC容器对象

        //ApplicationContext代表IOC容器

        //ClassPathXmlApplicationContext: 是ApplicationContext接口的实现类。该实现类从类路径下来加载配置文件。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从IOC容器中获取Bean实例
        // 利用id定位到IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        HelloWorld helloWorld2 = (HelloWorld) ctx.getBean("helloWorld2");

        HelloWorld helloWorld3 = (HelloWorld) ctx.getBean("helloWorld3");

        HelloWorld helloWorld4 = (HelloWorld) ctx.getBean("helloWorld4");

        //利用类型返回IOC  容器中的Bean,但要求IOC容器中必须只能有一个该类型的
        //HelloWorld helloWorld5 = (HelloWorld) ctx.getBean(HelloWorld.class);

        //根据类型来获取 beans 的实例: 要求在  IOC 容器中只有一个与之类型匹配的 beans, 若有多个则会抛出异常.
        //一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 beans 也只有一个.
        //HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);

        //3. 使用 beans
        helloWorld.hello();
        helloWorld2.hello();
        helloWorld3.hello();
        helloWorld4.hello();
        //helloWorld5.hello();


        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Car car3 = (Car) ctx.getBean("car3");


        System.out.println(car3);


        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);


        Person person3 = (Person) ctx.getBean("person3");
        System.out.println(person3);


        Person person4 = (Person) ctx.getBean("person4");
        System.out.println(person4);


        Person person5 = (Person) ctx.getBean("person5");
        System.out.println(person5);

        Person person6 = (Person) ctx.getBean("person6");
        System.out.println(person6);


        //4. 测试使用集合属性
        User user = (User) ctx.getBean("user5");
        System.out.println(user);


        //5. 静态工厂
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);

        //5. 工厂方法
        Student student2 = (Student) ctx.getBean("student2");
        System.out.println(student2);


        //6. factoryBean
        // FactoryBean 通常是用来创建比较复杂的bean，一般的bean 直接用xml配置即可，
        // 但如果一个bean的创建过程中涉及到很多其他的bean 和复杂的逻辑，用xml配置比较困难，这时可以考虑用FactoryBean。


        Student student3 = (Student) ctx.getBean("student3");
        System.out.println(student3);
    }

}

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import javax.sql.DataSource;


@SpringBootTest
class HelloWorld {
//    @Resource
//    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Resource
    DataSource dataSource;


    @Test
    void testHelloService() {

        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService已经添加到IOC容器中");
        } else {
            System.out.println("personService没添加到IOC容器中");
        }

    }

}

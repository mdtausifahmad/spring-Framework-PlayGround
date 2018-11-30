package com.learn.springframework;

import com.learn.springframework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringframeworkApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringframeworkApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(SpringframeworkApplication.class, args);

        ApplicationContext applicationContext = SpringApplication.run(SpringframeworkApplication.class, args);

        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

        /*PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        logger.info("{}", personDAO1);
        logger.info("{}", personDAO1.getJdbcConnection());
        logger.info("{}", personDAO2);
        logger.info("{}", personDAO2.getJdbcConnection());
*/

    }
}

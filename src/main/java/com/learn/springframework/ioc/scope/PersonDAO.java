package com.learn.springframework.ioc.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }


    @PostConstruct
    public void postConstruct() {
        logger.info("Post construct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Pre Destroy");
    }
}

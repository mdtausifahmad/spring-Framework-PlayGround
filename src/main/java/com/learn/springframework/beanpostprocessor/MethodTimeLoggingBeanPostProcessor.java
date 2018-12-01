package com.learn.springframework.beanpostprocessor;

import com.learn.springframework.mybeans.Timed;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Simple BPP that automatically adds logging functionality to all objects that implement
 *
 */
public class MethodTimeLoggingBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new TimeLoggingMethodInterceptor());
        factory.setTarget(bean);
        return (Object) factory.getProxy();
    }


    /**
     * logs the method invocation times
     */
    private class TimeLoggingMethodInterceptor implements MethodInterceptor {
        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {

            Object result = null;
            if (invocation.getMethod().getAnnotation(Timed.class) != null) {
                long start = System.currentTimeMillis();
                result = invocation.proceed();
                long stop = System.currentTimeMillis();
                System.out.println(invocation.getMethod().getName() + ": " + (stop - start) + "ms");
            } else {
                result = invocation.proceed();
            }
            return result;
        }
    }
}

package com.st.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * </pre>
 * SpringContextUtil
 * Date: 2016/6/16
 * Time: 11:29
 *
 * @author zhaoyexing@social-touch.com
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    /**
     * Spring应用上下文环境
     */
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.applicationContext = applicationContext;
    }
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static <T> T getBean(String name) throws BeansException {
        return (T) applicationContext.getBean(name);
    }
    public static <T> T getBean(Class<T> clazz) throws BeansException {
        return (T) applicationContext.getBean(clazz);
    }
}

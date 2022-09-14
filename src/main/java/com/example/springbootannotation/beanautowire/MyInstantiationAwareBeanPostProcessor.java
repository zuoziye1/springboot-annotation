package com.example.springbootannotation.beanautowire;

import com.example.springbootannotation.controller.ConditionOnPropertyController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: 姚飞虎
 * @Date: 2022/9/14 2:31 PM
 * @Description:
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor{

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanClass == ConditionOnPropertyController.class){
            System.out.println("ConditionOnPropertyController 实例化之前调用");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equals("abc")){
            System.out.println("ConditionOnPropertyController 实例化之后调用");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }
}

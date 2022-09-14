package com.example.springbootannotation.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot中的注解@ConditionalOnProperty，可以通过配置文件中的属性值来判定configuration是否被注入.
 * @Author: 姚飞虎
 * @Date: 2022/9/14 2:03 PM
 * @Description:
 */
@ConditionalOnProperty(prefix = "controller",value = "ConditionOnPropertyController.enable",matchIfMissing = false)
@RestController(value = "abc")
public class ConditionOnPropertyController {

    public ConditionOnPropertyController(){
        System.out.println("ConditionOnPropertyController 无参构造。");
    }


    /**
     * ***********************    类加载和实例初始化时，<clinit>() 和 <init>() 的复习    ***********************
     *
     * 当new一个对象，特别是含有继承关系的对象时，java初始化的步骤是什么？首先明确java分类初始化< clinit >() 和 实例初始化< init >()。
     * java的类定义中，静态变量及其赋值语句、静态代码块、静态方法属于类的范畴，他们的初始化在< clinit >()时进行。而变量，代码块、方法等属于实例的范畴，他们的初始化在< init >()时进行。
     * 在new一个对象时，如果类还没有被初始化，首先进行类的初始化。在类的初始化过程中：
     *
     * 虚拟机会保证在子类的< clinit >()执行之前，父类的< clinit >()先执行。因此，在虚拟机中第一个被执行的< clinit >()一定是java.lang.Object。
     * < clinit >()方法是由编译器自动收集类中的所有类变量的赋值动作和静态语句块中的语句合并产生的，编译器收集的顺序是根据其在源文件中的顺序决定的，静态语句块中仅能访问到定义在静态语句块之前的变量，定义在它之后的变量，在前面的静态语句中可以赋值，但不能访问。
     *
     * 作者：null_sevn
     * 链接：https://www.jianshu.com/p/562c4c883459
     * 来源：简书
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    static {
        System.out.println("ConditionOnPropertyController static 代码块");
    }

    {
        System.out.println("ConditionOnPropertyController 代码块");
    }
}

# markdown 书写规则
## 一、图片插入
### 1、网络图片插入
![网络图片引入示例](http://github.com/unicorn.png "图片标题")

### 2、本地图片插入
![网络图片引入示例](src/main/resources/static/images/beauty.webp "图片标题")

# springboot 中的各个annotation 的使用
## @conditionalonproperty 
Spring boot中的注解@ConditionalOnProperty，**可以通过配置文件中的属性值来判定configuration是否被注入.**
[参考文章](https://www.cnblogs.com/LoveShare/p/14431848.html)
![如图](src/main/resources/static/images/conditionalOnProperty.png "使用示例")

# bean 的生命周期
[参考文章](https://segmentfault.com/a/1190000040365130)
![bean的生命周期图](src/main/resources/static/images/bean生命周期.png "bean")

## InstantiationAwareBeanPostProcessor
本文中用了 **MyInstantiationAwareBeanPostProcessor** 来验证 
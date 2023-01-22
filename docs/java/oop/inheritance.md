# 什么是继承？(Inheritance)
##### 不同种类的对象之间通常有一定数量的共同点
###### 例如，山地自行车、公路自行车和双人自行车都具有自行车的特征：
* 当前速度
* 当前踏板节奏
* 当前档位

###### 然而，每一种都定义了使它们与众不同的附加功能：
*  双人自行车有两个座位和两组把手
* 公路自行车有下垂的车把
* 一些山地车有一个额外的链条环，给他们一个较低的齿轮比

#### 面向对象编程允许类从其他类继承常用的状态和行为
---
在本例中，Bicycle现在成为MountainBike、RoadBike和TandemBike的超类。
在Java编程语言中，每个类都允许有一个直接的超类，并且每个超类都可以有无限数量的子类:
<div align="center">
<img src="https://raw.githubusercontent.com/ooyq/java-tutorial/main/gallery/docs/java/oop/a-hierarchy-of-bicycle-classes.png" alt="a-software-object" width="400" height="300" />
<p>自行车类的层次结构</p>
</div>

#### 创建子类的语法很简单
#### 在你的类声明的开头，使用extends关键字，后面跟着要继承的类名

```java
class MountainBike extends Bicycle {

    // 定义山地自行车的新字段和方法将在这里

}
```

> 这给了MountainBike所有与Bicycle相同的字段和方法，但允许其代码只关注使其独特的功能，这使得子类的代码易于阅读。
但是，您必须注意正确地记录每个超类定义的状态和行为，因为这些代码不会出现在每个子类的源文件中。
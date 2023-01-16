# 什么是接口？(Interface)
**对象通过它们公开的方法定义它们与外部世界的交互**
**方法形成对象与外部世界的接口**
> 例如，电视机开关机按钮是你和电视机壳后电线之间的接口，你通过按下“电源”键来开关电视。

------------


#### 在其最常见的形式中，接口是一组具有空主体的相关方法
**自行车的行为，如果指定为接口，可能如下所示:**

```java
interface Bicycle {

    // 每分钟转数
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
```

**要实现这个接口，你的类名将会改变(变成一个特定品牌的自行车，例如acmebike)，你将在类声明中使用implements关键字:**
```java
class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

/*
编译器现在需要实现方法changeCadence、changeGear、speedUp和applyBrakes，如果这个类中缺少这些方法，编译将失败。
*/

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

#### 实现接口可以让类在承诺提供的行为方面变得更加正式
**接口在类和外部世界之间形成了一个契约，这个契约在构建时由编译器强制执行**
**如果您的类声称实现了一个接口，那么该接口定义的所有方法必须出现在其源代码中，才能成功编译该类**

> **注意:** 要实际编译acmebike类，需要在实现的接口方法的开头添加public关键字
> 在后面的类和对象、接口和继承部分中，您将了解到这种情况的原因
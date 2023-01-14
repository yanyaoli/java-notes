### 类是创建单个对象的蓝图
在您的应用程序中，您经常会发现许多相同类型的单独对象。世界上可能有成千上万辆自行车，都是相同的品牌和型号。每辆自行车都是根据同一套蓝图建造的，因此包含相同的组件。在面向对象的术语中，我们说您的自行车是称为自行车的对象类的实例。

##### 下面的Bicycle类是Bicycle的一种可能实现:
```java
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

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
##### 字段cadence、speed和gear表示对象的状态
##### 方法(changeCadence()、changeGear()、speedUp()等)定义其与外部世界的交互
> 您可能已经注意到Bicycle类不包含main()方法，这是因为它不是一个完整的应用程序，它只是可能用于应用程序的自行车蓝图。
##### 创建和使用新的Bicycle对象的职责属于应用程序中的其他类

##### 下面是一个BicycleDemo类，它创建了两个独立的Bicycle对象并调用它们的方法:
```java
class BicycleDemo {
    public static void main(String[] args) {

		// 创建两个不同的自行车对象
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

		// 调用这些对象上的方法
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
```
##### 该测试的输出打印了两辆自行车的结束踏板节奏、速度和档位：
```java
cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3
```
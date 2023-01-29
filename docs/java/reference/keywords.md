# 关键字
**Java有一组关键字，这些关键字是保留字，不能用作变量、方法、类或任何其他标识符:**

| 关键字 | 描述 |
| :------------: | :------------: |
| abstract  | 非访问修饰符。用于类和方法:抽象类不能用于创建对象(要访问它，必须从另一个类继承它)。抽象方法只能在抽象类中使用，并且它没有主体。主体由子类提供(继承自)  |
| assert  | 用于调试  |
| boolean  | 一种只能存储真值和假值的数据类型  |
| break  | 跳出循环或开关块  |
| byte  | 一种数据类型，可以存储从`-128`到`127`的整数  |
| case  | 标记 switch 语句中的代码块  |
| catch  | 捕获try语句生成的异常  |
| char  | 用于存储单个字符的数据类型  |
| class  | 定义一个类  |
| continue  | 继续循环的下一次迭代  |
| ~~const~~  | 定义一个常量 （未使用，使用 `final` 代替）  |
| default  | 指定 switch 语句中的默认代码块  |
| do  | 与 `while` 一起使用来创建一个 `do-while` 循环  |
| double  |  一种数据类型，可以存储从 `1.7e−308` 到 `1.7e+308` 的整数 |
| else  | 在条件语句中使用  |
| enum  |  声明枚举（不可更改）类型 |
| exports  | 导出带有模块的包  |
| extends  | 扩展一个类（表示一个类继承自另一个类）  |
| final  | 用于类、属性和方法的非访问修饰符，使它们不可更改（无法继承或覆盖） |
|  finally |  与异常一起使用，无论是否有异常都会执行的代码块 |
| float  | 一种数据类型，可以存储从 `3.4e−038` 到 `3.4e+038` 的整数  |
| for  | 创建一个 for 循环  |
| ~~goto~~  | 未使用，没有任何功能  |
| if  | 做一个条件语句  |
| implements  | 实现一个接口  |
|  import |  用于导入包、类或接口 |
| instanceof  | 检查对象是否是特定类或接口的实例  |
|  int | 一种数据类型，可以存储从 `-2147483648` 到 `2147483647` 的整数 |
| interface  | 用于声明只包含抽象方法的特殊类型的类  |
| long  | 一种数据类型，可以存储从 `-9223372036854775808` 到 `9223372036854775808` 的整数  |
| module  | 声明一个模块  |
| native  | 指定一个方法不是在同一个 Java 源文件中实现的（而是在另一种语言中）  |
| new  | 创建新对象  |
| package  | 声明一个包  |
| private  | 用于属性、方法和构造函数的访问修饰符，使它们只能在声明的类中访问  |
| protected  | 用于属性、方法和构造函数的访问修饰符，使它们可以在同一个包和子类中访问  |
| public  | 用于类、属性、方法和构造函数的访问修饰符，使它们可以被任何其他类访问  |
| requires  |指定模块内所需的库  |
| return  | 完成一个方法的执行，可以用来从方法中返回一个值  |
| short  | 一种数据类型，可以存储从 `-32768` 到 `32767` 的整数  |
| static  | 用于方法和属性的非访问修饰符。 无需创建类的对象即可访问静态方法/属性  |
| strictfp  | 限制浮点计算的精度和舍入  |
| super  | 引用父类对象  |
| switch  | 选择要执行的多个代码块之一  |
| synchronized  | 非访问修饰符，指定方法一次只能由一个线程访问  |
| this  | 在方法或构造函数中引用当前对象  |
| throw  |  创建自定义错误 |
| throws  | 指示方法可能抛出的异常  |
| transient  | 非访问修饰符，它指定某个属性不是对象持久状态的一部分  |
| try  | 创建一个 `try...catch` 语句  |
|  var | 声明一个变量 |
| void  | 指定方法不应有返回值  |
| volatile  | 指示一个属性不是线程本地缓存的，总是从“主内存”读取。  |
|while   |  创建一个 `while` 循环 |

**注意：** `true`、`false`、`null` 不是关键字，而是字面量和保留字，不能用作标识符。

## 分类
|  关键字  ||||||||||||
| :-----: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 数据类型 | boolean | byte | char | class | double | float | int | interface | long | short | void |
| 流程控制 | if | else | switch | case | default | while | do | for | break | continue | return |
| 数据类型值 | true | false | null |||||||||
| 访问权限修饰符 | private |  public | protected|||||||||
| 类、函数、变量修饰符 | abstract | final | static | synchronized ||||||||
| 建立实例及引用实例、判断实例 | new | this | super | instanceof ||||||||
| 类与类之间的关系 | extends | implements ||||||||||
| 包 | package | import ||||||||||
| 异常处理 | try | catch | finally | throw | throws |||||||
| 其他修饰符 | native | strictfp | transient | volatile | assert |||||||



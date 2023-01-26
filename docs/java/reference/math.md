# 数学方法
**Java Math 类有许多方法可以让您对数字执行数学任务**
**注意：**所有 Math 方法都是静态的

| 方法 | 描述 | 返回类型 |
| :---: | :---: | :---: |
| `abs(x)` | 返回 x 的绝对值 | double,float,int,long |
| `acos(x)` | 返回 x 的反余弦值，以弧度为单位 | double |
| `asin(x)` | 返回 x 的反正弦值，以弧度为单位 | double |
| `atan(x)` | 以介于 -PI/2 和 PI/2 弧度之间的数值形式返回 x 的反正切值 | double |
| `atan2(y,x)` | 返回直角坐标(x, y)转换到极坐标(r, theta)的角度theta | double |
| `cbrt(x)` | 返回 x 的立方根 | double |
| `ceil(x)` | 返回 x 的值四舍五入到最接近的整数 | double |
| `copySign(x, y)` | 返回带有第二个浮点 y 符号的第一个浮点 x | double |
| `cos(x)` | 返回 x 的余弦值（x 的单位是弧度） | double |
| `cosh(x)` | 返回双精度值的双曲余弦值 | double |
| `exp(x)` | 返回 Ex 的值  | double |
| `expm1(x)` | 返回ex -1 | double |
| `floor(x)` | 返回 x 的值向下舍入到最接近的整数 | double |
| `getExponent(x)` | 返回 x 中使用的无偏指数 | int |
| `hypot(x, y)`	| 返回平方根(x2 +y2)，中间没有溢出或下溢 | double |
| `IEEEremainder(x, y)` | 按照 IEEE 754 标准的规定计算 x 和 y 的余数运算 | double |
| `log(x)` | 返回 x 的自然对数（以 E 为底） | double |
| `log10(x)` | 返回 x 的以 10 为底的对数 | double |
| `log1p(x)` | 返回 x 和 1 之和的自然对数（以 E 为底） | double |
| `max(x, y)` | 返回具有最高值的数字 | double,float,int,long |
| `min(x, y)` | 返回具有最小值的数字 | double,float,int,long |
| `nextAfter(x, y)` | 返回在y方向上与x相邻的浮点数 | double,float |
| `nextUp(x)` | 返回在正无穷大方向上与 x 相邻的浮点值 | double,float |
| `pow(x, y)` | 返回 x 的 y 次方的值 | double |
| `random()` | 返回 0 到 1 之间的随机数 | double |
| `round(x)` | 返回 x 的值四舍五入到最接近的整数 | int |
| `rint(x)` | 返回最接近 x 且等于数学整数的双精度值 | double |
| `signum(x)` | 返回 x 的符号 | double |
| `sin(x)` | 返回 x 的正弦值（x 的单位是弧度） | double |
| `sinh(x)` | 返回双精度值的双曲正弦值 | double |
| `sqrt(x)` | 返回 x 的平方根 | double |
| `tan(x)` | 返回角度的正切 | double |
| `tanh(x)` | 返回双精度值的双曲正切值 | double |
| `toDegrees(x)` | 将以弧度测量的角度转换为近似值。 以度为单位的等效角 |	double |
| `toRadians(x)` | 将以度为单位的角度转换为近似值。 以弧度为单位的角度 |	double |
| `ulp(x)` | 返回 x 的最小精度单位 (ulp) 的大小 | double,float |

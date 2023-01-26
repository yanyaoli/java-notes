# 字符串方法
**String 类有一组可用于字符串的内置方法**


| 方法 | 描述 | 返回类型 |
| :---: | :---: | :---: |
| `charAt()` | 返回指定索引（位置）处的字符 | char |
| `codePointAt()` | 返回指定索引处字符的 Unicode | int |
| `codePointBefore()` | 返回指定索引之前字符的 Unicode | int |
| `codePointCount()` | 返回在字符串中找到的 Unicode 值的数量 | int |
| `compareTo()` | 按字典顺序比较两个字符串 | int |
| `compareToIgnoreCase()` | 按字典顺序比较两个字符串，忽略大小写差异 | int |
| `concat()` | 将一个字符串追加到另一个字符串的末尾 | String |
| `contains()` | 检查字符串是否包含字符序列 | boolean |
| `contentEquals()` | 检查字符串是否包含与指定 CharSequence 或 StringBuffer 完全相同的字符序列 | boolean |
| `copyValueOf()` | 返回一个表示字符数组字符的String | String |
| `endsWith()` | 检查字符串是否以指定字符结尾 | boolean |
| `equals()` | 比较两个字符串，如果字符串相等则返回 true，否则返回 false | boolean |
| `equalsIgnoreCase()` | 比较两个字符串，忽略大小写 | boolean |
| `format()` | 使用指定的语言环境、格式字符串和参数返回格式化字符串 | String |
| `getBytes()` | 使用指定的字符集将此 String 编码为字节序列，将结果存储到新的字节数组中 | byte[] |
| `getChars()` | 将字符串中的字符复制到字符数组 | void |
| `hashCode()` | 返回字符串的哈希码 | int |
| `indexOf()` | 返回字符串中指定字符第一次出现的位置 | int |
| `intern()` | 返回字符串对象的规范表示形式 | String |
| `isEmpty()` | 检查字符串是否为空 | boolean |
| `lastIndexOf()` | 返回字符串中最后找到的指定字符的位置 | int |
| `length()` | 返回指定字符串的长度 | int |
| `matches()` | 在字符串中搜索与正则表达式的匹配项，并返回匹配项 | boolean |
| `offsetByCodePoints()` | 返回此 String 中从给定索引偏移 codePointOffset 代码点的索引 | int |
| `regionMatches()` | 测试两个字符串区域是否相等 | boolean |
| `replace()` | 在字符串中搜索指定值，并返回替换指定值的新字符串 | String |
| `replaceFirst()` | 用给定的替换替换匹配给定正则表达式的子字符串的第一次出现 | String |
| `replaceAll()` | 用给定的替换替换此字符串中与给定正则表达式匹配的每个子字符串 | String |
| `split()` | 将字符串拆分为子字符串数组 | String[] |
| `startsWith()` | 检查字符串是否以指定字符开始 | boolean |
| `subSequence()` | 返回一个新的字符序列，它是该序列的子序列 | CharSequence |
| `substring()` | 返回一个新字符串，它是指定字符串的子字符串 | String |
| `toCharArray()` | 将此字符串转换为新的字符数组 | char[] |
| `toLowerCase()` | 将字符串转换为小写字母 | String |
| `toString()` | 返回String对象的值 | String |
| `toUpperCase()` | 将字符串转换为大写字母 | String |
| `trim()` | 从字符串的两端移除空白 | String |
| `valueOf()` | 返回指定值的字符串表示形式 | String |
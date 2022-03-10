package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口的使用
 * 特点：1.存储键值对
 * 2. 键不能重复
 * 3. 无序
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建
        Map<String, String> map = new HashMap<>();
        // 添加
        map.put("cn", "中国");
        map.put("uk", "英国");
        map.put("usa", "美国");

        System.out.println(map.toString()); // {usa=美国, uk=英国, cn=中国}

        // 删除
//        map.remove("usa");
//        System.out.println(map.toString());//{uk=英国, cn=中国}

        //遍历
        //使用keySet
        Set<String> keySet = map.keySet();
        for (String key:
                keySet) {
            System.out.println(key + "--------" + map.get(key));
            //usa--------美国
            //uk--------英国
            //cn--------中国
        }

        //使用entrySet()方法
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:
             entries) {
            System.out.println(entry.getKey() + "----------" + entry.getValue());
            //usa----------美国
            //uk----------英国
            //cn----------中国
        }

        // 判断
        System.out.println(map.containsKey("cn")); // true
        System.out.println(map.containsValue("泰国")); //false
    }
}

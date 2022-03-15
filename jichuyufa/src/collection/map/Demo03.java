package collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap的使用
 * 存储结构：红黑树
 */
public class Demo03 {
    public static void main(String[] args) {
        //创建集合
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("wyf","1");
        treeMap.put("wyf2","2");
        treeMap.put("wyf3","3");
        System.out.println(treeMap.toString());//{wyf=1, wyf2=2, wyf3=3}
        
        //删除
//        treeMap.remove("wyf");
        
        //遍历
        Set<String> keys = treeMap.keySet();
        for (String key:
             keys) {
            System.out.println(key + "----------" + treeMap.get(key));
            //wyf----------1
            //wyf2----------2
            //wyf3----------3
        }

        Set<Map.Entry<String,String>> entrys = treeMap.entrySet();
        for (Map.Entry<String,String> entry:
             entrys) {
            System.out.println(entry.getKey() + "----------" + entry.getValue());
            //wyf----------1
            //wyf2----------2
            //wyf3----------3
        }

        //判断
        treeMap.containsKey("");
        treeMap.containsValue("");
    }
}

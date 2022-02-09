package commonclass;

/**
 * StringBuffer和StringBuilder
 * 和String区别，效率比String高，比String节省内存
 */
public class Demo01 {
    public static void main(String[] args) {
        //StringBuilder StringBuffer等价
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        //1.append() 追加
        sb.append("java世界第一");
        System.out.println(sb.toString());//java世界第一
        //2.insert() 添加
        sb.insert(0, "我在最前面");
        System.out.println(sb.toString());//我在最前面java世界第一
        //3.replace() 替换
        sb.replace(0,5,"hello");
        System.out.println(sb.toString());//hellojava世界第一
        //4.delete() 删除
        sb.delete(0,5);
        System.out.println(sb.toString());//java世界第一

    }
}

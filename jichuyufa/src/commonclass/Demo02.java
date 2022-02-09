package commonclass;

/**
 * 验证StringBuilder效率高于String
 */
public class Demo02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string = "";
        for(int i = 0; i < 99999; i++) {
            string += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);//14637

        long start1 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for(int i = 0; i < 99999; i++) {
            sbf.append(i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);//0

        long start2 = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for(int j = 0; j < 99999; j++) {
            sbd.append(j);
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);//0
    }
}

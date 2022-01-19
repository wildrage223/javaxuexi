package array;

public class Demo06 {
    public static void main(String[] args) {
        //创建一个二维数组11*11  0代表没有棋子 1黑棋 2白棋

        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        //输出原始数组
        System.out.println("输出原始数组");
        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(array1[i][j] != 0) {
                    sum++;
                }
            }

        }
        System.out.println("有效值个数：" + sum);

        //创建稀疏数组
        int[][] array2 = new int[sum + 1][3];
        array2[0][0] = 11;//原数组行数
        array2[0][1] = 11;//原数组列数
        array2[0][2] = sum;

        //遍历二维数组，将非零的值存放稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i; //存放横坐标
                    array2[count][1] = j; //存放纵坐标
                    array2[count][2] = array1[i][j]; //存放值
                }
            }
        }
        //输出稀疏数组
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        //还原
        System.out.println("还原");
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        //还原值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        //输出还原数组
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}

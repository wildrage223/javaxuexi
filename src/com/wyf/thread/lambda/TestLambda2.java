package com.wyf.thread.lambda;


//总结：
// lambda表达式只能有一行代码的情况下才能简化成为一行，如果有多行，那么调用代码块包裹
// 前提是接口为函数类型
//多个参数也可以去掉参数类型，要去掉就都去掉，必须加上括号


public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = (int a) -> {
            System.out.println("i love you-->" + a);
        };


        // 简化1 参数类型
        love = (a)-> {
            System.out.println("i love you-->" + a);
        };

        //简化2 简化括号
        love = a -> {
            System.out.println("i love you-->" + a);
        };

        // 简化3 去掉花括号  只有一行才能简化
        love = a -> System.out.println("i love you-->" + a);

        love.love(520); // i love you-->520
    }
}

interface ILove {
    void love(int a);
}
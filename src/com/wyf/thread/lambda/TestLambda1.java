package com.wyf.thread.lambda;

/**
 * 推导lambda表达式
 */
public class TestLambda1 {

    //3 静态内部类
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda(); // i like lambda

        like = new Like2();
        like.lambda(); // i like lambda2

        //4 局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }

        like = new Like3();
        like.lambda();//i like lambda3

        //5 匿名内部类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        like.lambda();//i like lambda4

        //6 lambda简化
        like = () -> {System.out.println("i like lambda5");};
        like.lambda();//i like lambda5

    }
}


//1 定义一个函数式接口
interface ILike {
    void lambda();
}

//2实现类
class Like implements ILike {
    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}

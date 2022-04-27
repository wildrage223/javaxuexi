package com.wyf.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 通过反射获取泛型
 */
public class ReflectionTest10 {

    public void test01(Map<String,User> map, List<User> list) {
        System.out.println("test01");
    }

    public Map<String, User> test02() {
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = ReflectionTest10.class.getMethod("test01", Map.class, List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType: genericParameterTypes) {
            System.out.println("#" + genericParameterType);
            //#java.util.Map<java.lang.String, com.wyf.reflection.User>
            //#java.util.List<com.wyf.reflection.User>

            if(genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                    //class java.lang.String
                    //class com.wyf.reflection.User
                    //class com.wyf.reflection.User
                }
            }
        }

        method = ReflectionTest10.class.getMethod("test02", null);
        Type genericReturnType = method.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
                //class java.lang.String
                //class com.wyf.reflection.User
            }
        }
    }
}

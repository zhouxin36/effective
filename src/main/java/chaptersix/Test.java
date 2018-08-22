package chaptersix;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
//        ann();
        inter();
    }

    public static void ann() throws Exception{
        Class<?> user1 = Class.forName("chaptersix.User");
        Object o = user1.newInstance();
        if(user1.isAnnotationPresent(ToString.class)){
            Method toString = user1.getMethod("toString");
            Object invoke = toString.invoke(o);
            System.out.println(invoke);
        }
    }

    public static void inter() throws Exception{
        Class<?> user1 = Class.forName("chaptersix.User2");
        Object o = user1.newInstance();
        if(o instanceof IToString){
            Method toString = user1.getMethod("toString");
            Object invoke = toString.invoke(o);
            System.out.println(invoke);
        }
    }
}

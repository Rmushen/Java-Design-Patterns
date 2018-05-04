package me.mushen.jdp.singleton;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-15
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance() {
        if(singleton == null) {
            return new Singleton();
        }
        return singleton;
    }
}

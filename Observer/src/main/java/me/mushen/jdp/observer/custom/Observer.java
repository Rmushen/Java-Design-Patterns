package me.mushen.jdp.observer.custom;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-05
 */
public interface Observer {
    /* 温度、湿度、气压*/
    void update(double temperature, double humidity, double pressure);
}

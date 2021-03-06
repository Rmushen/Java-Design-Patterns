package me.mushen.jdp.observer.custom;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-05
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

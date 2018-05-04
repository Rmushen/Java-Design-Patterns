package me.mushen.jdp.singleton;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-16
 */
public class ChocolateBoiler {
    private boolean empty;

    private boolean boiled;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;

            System.out.println("Fill Chocolate && Milk.");
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            System.out.println("Drain Chocolate && Milk.");

            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            System.out.println("Boil Chocolate && Milk.");

            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

package part_3.collections.generics.examples;

public class Example1<T>{
    private T instance;

    public T getInstance() {
        return instance;
    }

    public void setInstance(T obj) {
        this.instance = obj;
    }
}

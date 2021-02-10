package part_3.generics.examples;

public class Example2<T> {

    private T instance;

    private Example2(){

    }

    public static <T> void simpleInit(T instantiation){
        T obj;
    }

    public static <T> Example2<T> init(T instantiation){
        return new Example2<T>();
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }
}

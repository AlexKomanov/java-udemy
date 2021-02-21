package part_5.javaCore.enumerations;

public final class FinalOperator {

    /**
     * @variable: Final variable should be initialized or directly or via constructor.
     * @method: Final method can't be overwritten.
     * @class: Final class doesn't allow to inherit from him.
     */

    private final int a = 10;
    private final int b;
    private static final String WELCOME_MESSAGE = "Welcome";

    public FinalOperator(int b) {
        this.b = b;
    }

    public final void m(){
        System.out.println("Final Method");
    }


}

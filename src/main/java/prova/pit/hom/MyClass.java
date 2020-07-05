package prova.pit.hom;

public class MyClass {

    public boolean myMethod(int a, boolean flag) {
        if (a > 0) {
            return true;
        }
        if (flag) {
            return true;
        }
        return false;
    }
}
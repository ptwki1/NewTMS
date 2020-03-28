package lesson10.Ex28;

public class TypeForGeneric<E> {
    private E mas[];

    public E getElement(int i) {
        return mas[i];
    }

    public void setMas(E[] mas) {
        this.mas = mas;
    }
    public int getLength(){
        return mas.length ;
    }
}

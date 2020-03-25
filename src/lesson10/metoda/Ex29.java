package lesson10.metoda;

import java.util.ArrayList;
import java.util.Iterator;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.
public class Ex29 {
    public static void main(String[] agrs){
        ArrayList<Integer> list= new ArrayList<Integer>(10);
        for(int i=0;i<10;i++){
            Integer mark=(int) (Math.random()*10+1);
            list.add(i,mark);
        }
        System.out.println(list);
        System.out.println("**************");
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            if(it.next()<4)
                it.remove();
        }
        System.out.println(list);

    }
}

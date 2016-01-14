import java.security.Key;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Samoylov Oleg on 14.01.2016.
 * Создаем класс, помогающий отследить скорость операций в коллекциях разного типа
 */
public class TestTheSpeedOfCollections {
    //Добавляем несколько переменных - саму коллекцию, время старта, время остановки и колличество элементов
    Collection<Integer> collection;
    long startTime;
    long stopTime;
    final int NUMBER_OF_ELEMENTS= 100000;

   public TestTheSpeedOfCollections(Collection<Integer> collection){
       this.collection = collection;
   }
    public void addition(){//Создаем метод для записи в коллекцию
        startTime = System.currentTimeMillis();//засекаем время старта
        if(collection instanceof List){
            for (int i = 0; i <NUMBER_OF_ELEMENTS; i++) {
                ((List) collection).add(i);
            }
        }else if (collection instanceof Set){
            for (int i = 0; i <NUMBER_OF_ELEMENTS ; i++) {
                collection.add(i);
            }
        }
        stopTime = System.currentTimeMillis();//засекаем время завершения цикла
        System.out.println(collection.getClass()+" adds "+NUMBER_OF_ELEMENTS+" members in "+(stopTime-startTime)+" milliseconds");
    }
    public void reading(){//Метод для чтения
        startTime = System.currentTimeMillis();
        if(collection instanceof List){
            for (int i = 0; i <NUMBER_OF_ELEMENTS; i++) {
                ((List) collection).get(i);
            }
        }else if (collection instanceof Set){
            for (int i = 0; i <NUMBER_OF_ELEMENTS ; i++) {
                collection.contains(i);
            }
        }
        stopTime = System.currentTimeMillis();
        System.out.println(collection.getClass()+" reading "+NUMBER_OF_ELEMENTS+" members in "+(stopTime-startTime)+" milliseconds");
    }
    public void removal(){//Метод для удаления
        startTime = System.currentTimeMillis();
        if(collection instanceof List){
            for (int i = 0; i <NUMBER_OF_ELEMENTS; i++) {
                collection.remove(i);
            }
        }else if (collection instanceof Set){
            for (int i = 0; i <NUMBER_OF_ELEMENTS ; i++) {
                collection.remove(i);
            }
        }
        stopTime = System.currentTimeMillis();
        System.out.println(collection.getClass()+" removing "+NUMBER_OF_ELEMENTS+" members in "+(stopTime-startTime)+" milliseconds");
    }
}

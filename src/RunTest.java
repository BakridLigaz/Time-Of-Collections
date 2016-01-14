import java.util.*;

/**
 * Created by Samoylov Oleg on 14.01.2016.
 * Создаем класс для запуска теста скорости добавления, чтения и удаления элементов коллекций разных видов
 */

public class RunTest {
    public static void main(String[] args) {
        //Создаем объекты и кастингуем их в необходимых нам объект
        //Заполнение будем проводить элементами типа Integer
        List<Integer> aL = new ArrayList<Integer>();
        List<Integer> lL = new LinkedList<Integer>();
        Set<Integer> hS = new HashSet<Integer>();
        Set<Integer> tS = new TreeSet<Integer>();
        //Создаем экземпляры класса, которые будут проводить тест
        //как параметр передаем им созданные коллекции и вызываем необходимые методы
        TestTheSpeedOfCollections testArrayList = new TestTheSpeedOfCollections(aL);
        testArrayList.addition();
        testArrayList.reading();
        testArrayList.removal();
        System.out.println();
        TestTheSpeedOfCollections testLinkedList = new TestTheSpeedOfCollections(lL);
        testLinkedList.addition();
        testLinkedList.reading();
        testLinkedList.removal();
        System.out.println();
        TestTheSpeedOfCollections testHashSet = new TestTheSpeedOfCollections(hS);
        testHashSet.addition();
        testHashSet.reading();
        testHashSet.removal();
        System.out.println();
        TestTheSpeedOfCollections testTreeSet = new TestTheSpeedOfCollections(tS);
        testTreeSet.addition();
        testTreeSet.reading();
        testTreeSet.removal();
        System.out.println();
    }
}

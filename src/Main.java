import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person fedya = new Person("Федя", "Сумкн", 18);
        Person senya = new Person("Сеня", "Ганж", 17);
        Person agronom = new Person("Агроном", "Бомж", 36);
        Person logovaz = new Person("Логоваз", "Эльф", 265);
        Person pendal = new Person("Пендальф", "Серый", 126);
        Person givi = new Person("Гиви", "Церетели", 54);

        List<Person> people = new ArrayList<>();
        people.add(fedya);
        people.add(senya);
        people.add(agronom);
        people.add(logovaz);
        people.add(pendal);
        people.add(givi);

        PersonsSurnameLenthComparator comparatorSurname = new PersonsSurnameLenthComparator();
        people.sort(comparatorSurname);
        System.out.println(people);
    }
}

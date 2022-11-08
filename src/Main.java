import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person fedya = new Person("Федя", "Сумкн из рода сумчатых", 18);
        Person senya = new Person("Сеня", "Семен Семенович Ганж", 17);
        Person agronom = new Person("Агроном", "Бомж Сын Агропрома", 36);
        Person logovaz = new Person("Логоваз", "Эльф Безотцовщина Трандуил", 265);
        Person pendal = new Person("Пендальф", "Серый Майер", 126);
        Person givi = new Person("Гиви", "Зурабович Церетели спустившийся с гор", 54);

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

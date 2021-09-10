package listlearn;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ClassMembers {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        System.out.println(str.toString().equals(""));

        ClassMembers classMembers=new ClassMembers();
        Person person=new Person("三","张",BigDecimal.valueOf(90L));
        Person person1=new Person("四","李",BigDecimal.valueOf(80L));
        Person person2=new Person("五","王",BigDecimal.valueOf(88));
        Person person3=new Person("六","赵",BigDecimal.valueOf(60));
        List<Person> personList= new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Person person4=new Person();
        System.out.println(person.getFirstName()+person.getLastName());
        System.out.println(classMembers.getFullName(person));
        System.out.println(person4.getScore());

        Optional<Person> name=personList.stream().min(Comparator.comparing(Person::getScore));
        name.ifPresent(value -> System.out.println(classMembers.getFullName(person) + ": " + value.getScore()));
    }
    private String getFullName(Person person){
        return person.getLastName()+person.getFirstName();
    }
}

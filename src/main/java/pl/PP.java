package pl;

import LinkedList.Employee;
import pl.sda.szymon.Person;

import java.time.LocalDate;
import java.util.*;

public class PP {

    public static void main(String[] args) {
        Person person = new Person("Szymon", "Makowski", "98052883867", LocalDate.of(1998, 5, 28));
        Person person1 = new Person("Paweł", "Borak", "09211126831", LocalDate.of(1990, 2, 14));
        Person person2 = new Person("Jakub", "Kokił", "09211129231", LocalDate.of(1998, 2, 28));
        Person person3 = new Person("Mateusz", "Morek", "98052883427", LocalDate.of(1998, 5, 28));

//        Employee szymon = new Employee("Szymon", "Makowski", "98052883867", 1500);
//        Employee pawel = new Employee("Paweł", "Borek", "09211126831", 1500);
//        Employee jakub = new Employee("Jakub", "Kokił", "09211129231", 2000);
//        Employee mateusz = new Employee("Mateusz", "Morek", "98052883427", 1500);


        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList.get(0).getLastName());
        System.out.println(personList.get(1).getLastName());
        System.out.println(personList.get(0).getLastName());

        System.out.println("------------------------------------------------------------------");

        Set<Person> personSet = new HashSet<>();

        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        for (Person all : personSet) {
            System.out.println(all.getPeselNumber());
        }

        System.out.println("------------------------------------------------------------------");

        Map<String, Person> personMap = new HashMap<>();

        personMap.put(person.getPeselNumber(), person);
        personMap.put(person1.getPeselNumber(), person1);
        personMap.put(person2.getPeselNumber(), person2);
        personMap.put(person3.getPeselNumber(), person3);

    }

}

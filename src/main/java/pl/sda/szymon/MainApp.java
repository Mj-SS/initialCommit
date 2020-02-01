package pl.sda.szymon;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

import static pl.sda.szymon.UnitConverter.*;

public class MainApp {
    public static void main01(String[] args) {
        celsiusToFahrenheit(25);
        fahrenheitToCalsius(64);
        kilometresToMiles(42);
        milesTokilometres(14);
        kiloToPounds(15);
        PoundsToKilos(20);
    }

    public static void main(String[] args) {
//        Person person = new Person("Szymon","Szaniawski","98052883867",LocalDate.of(1998,5,28));
//        System.out.println(AgeValidator.isAdult(person));
//
//        Person underAgePerson = new Person("Paweł","Szaniawski","09211126831",LocalDate.of(2009,1,11));
//         System.out.println(AgeValidator.isAdult(underAgePerson));
//
//        Person invalidBirthDataPerson = new Person("Paweł","Szaniawski","09211126831",LocalDate.of(1900,2,14));
 //       System.out.println(AgeValidator.isAdult(invalidBirthDataPerson));
       /* Person person = new Person("Jan", "Janowski", "89021476971", LocalDate.of(1989, 2, 14));
        Person underagePerson = new Person("Brajan", "Janowski", "10221489793", LocalDate.of(2010, 2, 14));
        Person invalidBirthDatePerson = new Person("NotBrajan", "Janowski", "10221489793", LocalDate.of(1990, 2, 14));

        System.out.println(AgeValidator.isAdult(person));
        System.out.println(AgeValidator.isAdult(underagePerson));
        System.out.println(AgeValidator.isAdult(invalidBirthDatePerson));*/

        PseudocodeExerciseImpl pseudocodeExercise = new PseudocodeExerciseImpl();
        int[] arrOne = {11,9,49484,2,9999999,86,0,-83};
        int result = pseudocodeExercise.highestValue(arrOne);
        System.out.println(result);

        String first = "Hi, I'm first ";
        String second = "Hi, I'm second ";
        String third = "Hi, I'm third ";
        StackImpl stack = new StackImpl();
        StackImpl secondStack = new StackImpl();
        stack.push(first);
        stack.push(second);
        stack.push(third);

        Object peekResult = stack.peek();
        System.out.println((String)peekResult);

        Object popResult = stack.pop();
        Object popResultTwo = stack.pop();

        System.out.println((String)popResult);
        System.out.println((String)popResultTwo);

//        secondStack.push(100);


}

}

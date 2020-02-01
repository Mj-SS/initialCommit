package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zad {

    public static void main(String[] args) {

        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(kristoff);
        employeeList.add(kasia);
        employeeList.add(grazynka);
        employeeList.add(karol);
        employeeList.add(zbigniew);
        employeeList.add(joanna);
        employeeList.add(aziz);

        List<Employee> fireList = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getSalary() < 10000) {
                fireList.add(employeeList.get(i));
            }
        }
        System.out.println(fireList);

        Employee employeeToFire = getUnluckyEmployee(fireList);
        System.out.println("Person to seek new opportunities " + "outside our company is: " + employeeToFire);
    }

    private static Employee getUnluckyEmployee(List<Employee> listOfEmployee) {
        int indexOfPersonToFire = new Random().nextInt(listOfEmployee.size());
        return listOfEmployee.get(indexOfPersonToFire);




    }
}

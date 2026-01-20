package designpatternpack.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() +
                               ", Gender : " + person.getGender() +
                               ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        // ... more persons added

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        System.out.println("All Records:\n============================================================");
        printPersons(persons);

        System.out.println("\nMales:\n=============================================================");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales:\n=============================================================");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingles:\n=============================================================");
        printPersons(single.meetCriteria(persons));
    }

		

	}



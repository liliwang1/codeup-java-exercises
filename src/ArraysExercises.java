import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // reference id
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        Person[] personArray = new Person[3];
        personArray[0] = new Person("Lucy");
        personArray[1] = new Person("Zoe");
        personArray[2] = new Person("Kat");

        for (Person person : personArray)
            System.out.println(person.getName());

//        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length + 1);
//        System.out.println(Arrays.toString(newPersonArray));
//        newPersonArray[3] = new Person("Amy");
//        System.out.println(Arrays.toString(newPersonArray));
//        System.out.println(newPersonArray[3].getName());


        Person person1 = new Person("Mer");
        Person[] newArray = addPerson(personArray, person1);
//        personArray = addPerson(personArray, person1);

        for (Person person : newArray)
            System.out.println(person.getName());

        System.out.println(Arrays.toString(newArray)); // [,,,]
        System.out.println(Arrays.toString(personArray)); // [,,]not changed, will change to [,,,] if add line 26
    }

    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] newPersonArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonArray[newPersonArray.length - 1] = person;
        return newPersonArray;
    }
}

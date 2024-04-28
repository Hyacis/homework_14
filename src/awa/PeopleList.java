package awa;

import java.util.Arrays;

public class PeopleList {
    private static Person[] people = new Person[5];
    private static int number = 0;

    public static void add(Person person){

        if (person == null) {
            System.err.println("Person is not initialized");
            return;
        }else if (number == people.length){
            additionalArrayPlace();
        }

        people[number++] = person;
    }

    private static void additionalArrayPlace(){
        int additionalArrayLength = people.length + 5;
        Person[] newArray = new Person[additionalArrayLength];

        for (int i = 0; i < people.length; i++) {
            newArray[i] = people[i];
        }

        people = newArray;
    }


    public static void remove(int index){

        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds");
            return;
        }

        Person[] newArray = new Person[people.length - 1];
        for (int i = 0; i < newArray.length; i++){
            if (i < index){
                newArray[i] = people[i];
            } else {
                newArray[i] = people[i + 1];
            }
        }

        people = newArray;
    }

    public static void setPerson(int index, Person person){
        if (checkArrayBounds(index) || person == null){
            System.err.println("Array index out of bounds exception or person wasn't initialized");
            return;
        }

        people[index] = person;
    }

    public static Person getPerson(int index){
        if (checkArrayBounds(index)){
            System.err.println("Array index out of bounds exception");
            return null;
        }

        return people[index];
    }

    private static boolean checkArrayBounds(int index){
        return index >= people.length || index < 0;
    }

    public static void printArray(){
        System.out.println(Arrays.toString(people));
    }


}

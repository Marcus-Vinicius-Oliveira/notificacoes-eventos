package services;

import entities.Person;
import interfaces.Events;

import java.util.Scanner;

public class Messenger implements Events {
    private Integer numPerson;
    private Person[] personEndMessage;
    private String message;

    public Integer getNumPerson() {
        return numPerson;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void numPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF PEOPLE WHO WILL RECEIVE THE NOTIFICATION: ");
        numPerson = sc.nextInt();
        sc.skip("((?<!\\R)\\s)*");
    }

    @Override
    public void namePerson() {
        Scanner sc = new Scanner(System.in);
        personEndMessage = new Person[numPerson];
        for (int i = 0; i < personEndMessage.length; i++) {
            Person person = new Person();
            System.out.println("ENTER WITH NAMES: ");
            person.setName(sc.nextLine().trim());
            person.setMessages(message.trim());
            personEndMessage[i] = person;
            System.out.println(personEndMessage[i].getName() + " received a message: -> " +
                    personEndMessage[i].getMessages());
        }
    }

    @Override
    public void reciveMensage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MESSAGE TO SEND");
        message = sc.nextLine();
    }

    @Override
    public void showMensage() {
        System.out.println("MESSAGES SEND TO: ");
        for (Person person : personEndMessage) {
            System.out.println(person);
        }
    }

    @Override
    public void clearRegistry() {
        personEndMessage = null;
        numPerson = null;
        message = null;
    }
}

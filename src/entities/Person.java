package entities;

public class Person {
    private String name;
    private String messages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "{" + name + " =" + " received a message: -> " + messages + "}";
    }
}

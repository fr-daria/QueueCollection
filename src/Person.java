public class Person{
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets ){
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}

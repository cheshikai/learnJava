package listlearn;

import java.math.BigDecimal;

public class Person {
    private String firstName;
    private  String lastName;
    private BigDecimal score;


    public Person() {
    }

    public Person(String firstName, String lastName, BigDecimal score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

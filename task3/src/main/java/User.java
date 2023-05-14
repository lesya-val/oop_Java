public class User {
    private String name;
    private String surname;
    private String group;
    private int age;
    private String subject;

    public User(String name, String surname, String group, int age, String subject) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.age = age;
        this.subject = subject;
    }

    // геттеры и сеттеры для полей объекта
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
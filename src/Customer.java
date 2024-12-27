public class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть больше 0.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Некорректный формат email.");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

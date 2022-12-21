import java.util.HashMap;
import java.util.Objects;

public class Phonebook {
    private String name;
    private String phone;

    private static HashMap<String, String> phonebook = new HashMap<>();

    public Phonebook(String name, String phone) {
        setName(name);
        setPhone(phone);
        phonebook.put(this.name, this.phone);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.IsNullOrBlank(name)) {
            throw new IllegalArgumentException("Заполните имя");
        } else this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (StringUtils.IsNullOrBlank(phone)) {
            throw new IllegalArgumentException("Заполните номер телефона");
        }
        this.phone = phone;
    }

    public static HashMap<String, String> getPhonebook() {
        return phonebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(name, phonebook.name) || Objects.equals(phone, phonebook.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}

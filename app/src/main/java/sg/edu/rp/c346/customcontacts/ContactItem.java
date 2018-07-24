package sg.edu.rp.c346.customcontacts;

/**
 * Created by 17041061 on 24/7/2018.
 */

public class ContactItem {

    private String name;
    private int code;
    private int number;

    public ContactItem(String name, int code, int number) {
        this.name = name;
        this.code = code;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ContactItem{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}


/**
 * Created by 17041061 on 24/7/2018.
 */

public class ContactItem {

    private String name;
    private String code;
    private String number;

    public ContactItem(String name, String code, String number) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

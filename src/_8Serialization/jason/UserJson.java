package _8Serialization.jason;

public class UserJson {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserJson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

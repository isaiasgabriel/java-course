package entities;

public class Hostel {
    private String name;
    private String email;
    private int room;

    public Hostel(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }

}

package guru.springframework.api.domain;

import java.util.List;

public class UserData {
    List<User> data;

    public UserData(List<User> data) {
        this.data = data;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}

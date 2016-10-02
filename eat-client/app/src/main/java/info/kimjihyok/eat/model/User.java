package info.kimjihyok.eat.model;

/**
 * Created by jkimab on 2016. 10. 2..
 */

public class User {
    public String displayName;
    public String email;
    public String id;
    public String availableTimeString;

    @Override
    public String toString() {
        return "User{" +
                "availableTimeString='" + availableTimeString + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}

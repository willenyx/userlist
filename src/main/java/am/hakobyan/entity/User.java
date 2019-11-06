package am.hakobyan.entity;

import java.util.*;

public class User {
    private int status;
    private String name;
    private String email;
    private String password;
    private String address;
    private int age;
    private List<Integer> list = new ArrayList<>();


    /*public User(List<Integer> list) {
        this.list = list;
    }*/


    public User() {
    }

    public void setStatus(int tmp) {
        final int range = 10_000;
        Random random = new Random();
        tmp = 0;
        boolean bool = true;
        while (bool) {
            tmp = random.nextInt(range);
            while (!list.contains(tmp)) {
                list.add(tmp);
                this.status = tmp;
                bool = false;
            }
        }
    }

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

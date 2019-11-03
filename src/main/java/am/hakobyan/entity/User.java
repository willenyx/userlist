package am.hakobyan.entity;





public class User {
    private int status;
    private String name;
    private String email;
    private String password;
    private String address;
    private int age;
//    private int tmp = 2;


    public User() {
    }

    public int getStatus() {
        return status;
    }

    public void Status(int status) {
        // some method to generate unique random number
        /*TreeSet<Integer> set = new TreeSet<>();//
        Random numb = new Random();
        set.add(numb.nextInt(10000));
        int men = set.first()+tmp;
        if (tmp>1){
            set.contains(men);}
        status = set.first();
        some:tmp++;*/
        this.status = status;
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

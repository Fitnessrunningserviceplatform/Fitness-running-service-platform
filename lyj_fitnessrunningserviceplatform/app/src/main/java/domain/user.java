package domain;

/**
 * Created by 75293 on 2018/1/1.
 */

public class user {
    private String account;
    private String password;
    private String QQ;
    private String email;
    private String name;
    private int age;
    private char sex;
    private int tall;
    private int weight;
    private double target_rate;

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getQQ() {
        return QQ;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getTall() {
        return tall;
    }

    public int getWeight() {
        return weight;
    }

    public double getTarget_rate() {
        return target_rate;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTarget_rate(double target_rate) {
        this.target_rate = target_rate;
    }
}

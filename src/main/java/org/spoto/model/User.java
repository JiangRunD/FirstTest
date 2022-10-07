package org.spoto.model;

public class User {
    private Integer id;
    private String name;
    private String account;
    private String passwd;
    private Integer age;
    private String job;
    private int status;

    public User() {
    }

    public User(Integer id, String name, String account, String passwd, Integer age, String job, int status) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.passwd = passwd;
        this.age = age;
        this.job = job;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", status=" + status +
                '}';
    }
}

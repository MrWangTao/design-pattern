package com.xt.patterns.builder;

/**
 * Create User: wangtao
 * Create In 2019-06-06 10:27
 * Description:
 **/
public class User {

    private String name;

    private Integer age;

    private String gender;

    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private User (Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.nickName = builder.nickName;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return String.format("[User: name=%s, age=%d, gender=%s, nickName=%s]", this.name, this.age, this.gender, this.nickName);
    }

    public static class Builder {

        private String name;

        private Integer age;

        private String gender;

        private String nickName;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User tower = new Builder().name("tower").build();
        System.out.println(tower.getName());

        User build = User.builder().name("bear").gender("man").age(12).nickName("大熊").build();
        System.out.println(build);
        System.out.println(9 >> 1);
        System.out.println(Integer.MAX_VALUE);

    }

}

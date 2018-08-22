package chaptersix;

import org.apache.commons.lang3.builder.ToStringBuilder;

@ToString
public class User1 {
    private String userId;
    private String userName;
    private Integer age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", "1")
                .append("userName", "zhouxin")
                .append("age", 17)
                .toString();
    }
}

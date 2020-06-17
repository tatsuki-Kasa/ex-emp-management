package jp.co.sample.domain;

/**
 * 管理者を表すドメインです。 管理者の情報を格納します。
 *
 * @author tatsuki
 *
 */

public class Administrators {

    /**
     * @param id           管理者のid
     * @param name         管理者の名前
     * @param emailAddress 管理者のログイン時に必要なメアド
     * @param password     管理者のログイン時に必要なパスワード
     */

    private Integer id;
    private String name;
    private String emailAddress;
    private String password;

    public Administrators() {
    }

    public Administrators(Integer id, String name, String emailAddress, String password) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrators [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", password="
                + password + "]";
    }

}

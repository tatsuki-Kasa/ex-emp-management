package jp.co.sample.domain;

import java.time.LocalDateTime;

/**
 * 従業員を表すリストです。 従業員の情報を格納します。
 *
 * @author tatsuki
 *
 */

public class Employee {

    /**
     * @param id          従業員のid
     * @param name        従業員の名前
     * @param hireDate    いつ雇われたのか
     * @param mailAddress ログイン時に必要なメアド、連絡先
     * @param zipCode     郵便番号
     * @param address     住所
     * @param telephone   電話番号
     * @Param salary 給与
     * @param characteristics その人がどんな人なのか
     * @param dependentsCount 扶養人数
     */

    private Integer id;
    private String name;
    private String gender;
    private LocalDateTime hireDate;
    private String mailAddress;
    private String zipCode;
    private String address;
    private String telephone;
    private String salary;
    private String characteristics;
    private Integer dependentsCount;

    public Employee() {
    }

    public Employee(Integer id, String name, String gender, LocalDateTime hireDate, String mailAddress, String zipCode,
            String address, String telephone, String salary, String characteristics, Integer dependentsCount) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hireDate = hireDate;
        this.mailAddress = mailAddress;
        this.zipCode = zipCode;
        this.address = address;
        this.telephone = telephone;
        this.salary = salary;
        this.characteristics = characteristics;
        this.dependentsCount = dependentsCount;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Integer getDependentsCount() {
        return dependentsCount;
    }

    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", hireDate=" + hireDate
                + ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address + ", telephone="
                + telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", dependentsCount="
                + dependentsCount + "]";
    }

}

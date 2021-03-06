package model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ольга on 06.08.2014.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    private String fio;
    @Temporal(TemporalType.DATE )
    @DateTimeFormat(pattern="dd-MMM-YYYY")
    private Date bdate;
    private Integer first;
    private Integer second;
    private Integer third;

    private Integer luckyNumber;

    public User() {
    }

    public User(String fio, Date bdate, Integer first, Integer second, Integer third) {
        this.fio = fio;
        this.bdate = bdate;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getThird() {
        return third;
    }

    public void setThird(Integer third) {
        this.third = third;
    }

    public Integer getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(Integer luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

}

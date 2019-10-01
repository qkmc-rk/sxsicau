package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sx_ext_auth")


public class Auth{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_id")
    private Integer sxId;

    @Column(name = "sx_end_date")
    private Date sxEndDate;

    @Column(name = "sx_is_open")
    private Boolean sxIsOpen;

    public Integer getSxId() {
        return sxId;
    }

    public void setSxId(Integer sxId) {
        this.sxId = sxId;
    }

    public Date getSxEndDate() {
        return sxEndDate;
    }

    public void setSxEndDate(Date sxEndDate) {
        this.sxEndDate = sxEndDate;
    }

    public Boolean getSxIsOpen() {
        return sxIsOpen;
    }

    public void setSxIsOpen(Boolean sxIsOpen) {
        this.sxIsOpen = sxIsOpen;
    }
    @Override
    public String toString() {

        return "Auth{" +
                "sxId=" + sxId +
                ", sxEndDate='" + sxEndDate + '\'' +
                ", sxIsOpen=" + sxIsOpen +
                '}';
    }

}


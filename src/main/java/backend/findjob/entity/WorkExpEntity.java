package backend.findjob.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
@Table(name = "work_exp")

public class WorkExpEntity extends BaseEntity{
    @Column
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(name = "is_position_now")
    private Boolean is_position_now;
    @Column
    private String company;
    @Column
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date start_date;
    @Column
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity user;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPositionNow() {
        return is_position_now;
    }

    public void setPositionNow(Boolean positionNow) {
        is_position_now = positionNow;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

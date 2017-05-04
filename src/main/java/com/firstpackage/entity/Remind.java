package com.firstpackage.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pirogovaa on 04.05.2017.
 */
@Entity
@Table(name = "remind")
public class Remind {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Column(name = "remind_date", nullable = false)
    private Date remindDate;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

package com.example.dohonghanh.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publisher")
public class PublisherCatalogsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contact ")
    private String contact ;

    @Column(name = "phone ")
    private String phone ;

    @OneToMany(mappedBy = "publisher",fetch = FetchType.LAZY)
    private List<BookDetailsEntity> details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BookDetailsEntity> getDetails() {
        return details;
    }

    public void setDetails(List<BookDetailsEntity> details) {
        this.details = details;
    }
}

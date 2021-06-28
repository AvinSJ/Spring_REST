package com.restapi.user.Entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class UserEntity implements Serializable {
    private static long serialVersionId = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false,length = 50)
    private String firstName;

    @Column(nullable = false,length = 50)
    private String lastName;

    @Column(nullable = false,length = 50)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptPassword() {
        return encryptPassword;
    }

    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword;
    }

    public Boolean getGetEmailVerificationStatus() {
        return getEmailVerificationStatus;
    }

    public void setGetEmailVerificationStatus(Boolean getEmailVerificationStatus) {
        this.getEmailVerificationStatus = getEmailVerificationStatus;
    }

    @Column(nullable = false)
    private String encryptPassword;

    private String emailVerificationToken;

    @Column(nullable = false)
    private boolean getEmailVerificationStatus =false;







}

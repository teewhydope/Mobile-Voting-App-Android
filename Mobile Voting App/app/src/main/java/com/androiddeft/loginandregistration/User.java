package com.androiddeft.loginandregistration;

import java.util.Date;

/**
 * Created by Abhi on 20 Jan 2018 020.
 */

public class User {
    String matric_number;
    String fullName;
    Date sessionExpiryDate;

    public void setMatric_Number(String matric_number) {
        this.matric_number = matric_number;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSessionExpiryDate(Date sessionExpiryDate) {
        this.sessionExpiryDate = sessionExpiryDate;
    }

    public String getMatric_number() {
        return matric_number;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getSessionExpiryDate() {
        return sessionExpiryDate;
    }
}

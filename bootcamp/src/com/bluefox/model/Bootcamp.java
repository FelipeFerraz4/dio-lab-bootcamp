package com.bluefox.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    
    private static int SERIAL_BOOTCAMP_ID = 1;

    private int bootcampId;
    private String bootcampName;
    private String bootcampDescription;
    private LocalDate bootcampStartDate;
    private LocalDate bootcampEndDate;
    private Set<Dev> devsRegisted;
    private Set<Content> contentRegisted;

    public Bootcamp(String bootcampName, String bootcampDescription) {
        this.bootcampId = SERIAL_BOOTCAMP_ID++;
        this.bootcampName = bootcampName;
        this.bootcampDescription = bootcampDescription;
        this.bootcampStartDate = LocalDate.now();
        this.bootcampEndDate = bootcampStartDate.plusDays(60);
        this.devsRegisted = new HashSet<>();
        this.contentRegisted = new LinkedHashSet<>();
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public String getBootcampName() {
        return bootcampName;
    }

    public String getBootcampDescription() {
        return bootcampDescription;
    }

    public LocalDate getBootcampStartDate() {
        return bootcampStartDate;
    }

    public LocalDate getBootcampEndDate() {
        return bootcampEndDate;
    }

    public Set<Dev> getDevsRegisted() {
        return devsRegisted;
    }

    public Set<Content> getContentRegisted() {
        return contentRegisted;
    }


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bootcampId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (bootcampId != other.bootcampId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bootcamp [bootcampId: " + bootcampId + ", bootcampName: " + bootcampName + ", bootcampDescription: "
                + bootcampDescription + ", bootcampStartDate: " + bootcampStartDate + ", bootcampEndDate: "
                + bootcampEndDate + ", devsRegisted: " + devsRegisted + ", contentRegisted: " + contentRegisted + "]";
    }

    

    
}

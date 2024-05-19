package com.bluefox.model;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring(String contentTitle, String contentDescription, LocalDate date) {
        super(contentTitle, contentDescription);
        this.date = date;
    }

    @Override
    public double calculeteXP() {
        return Content.getXpStandard() + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoring [date: " + date + ", getContentId(): " + this.getContentId() + ", getContentTitle(): "
                + this.getContentTitle() + ", getContentDescription(): " + this.getContentDescription() + "]";
    }
    
    
}

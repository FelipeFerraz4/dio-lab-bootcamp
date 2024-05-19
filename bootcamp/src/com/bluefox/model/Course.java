package com.bluefox.model;

public class Course extends Content {
    
    private int workload;

    public Course(String contentTitle, String contentDescription, int workload) {
        super(contentTitle, contentDescription);
        this.workload = workload;
    }

    @Override
    public double calculeteXP() {
        return Content.getXpStandard() * workload;
    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public String toString() {
        return "Course [workload: " + workload + ", getContentId(): " + this.getContentId() + ", getContentTitle(): "
                + this.getContentTitle() + ", getContentDescription(): " + this.getContentDescription() + "]";
    }    
}

package com.bluefox.model;

/**
 * Content
 */
public abstract class Content {

    private static final double XP_Standard = 10;
    private static int SERIAL_CONTENT_ID = 1;

    private int contentId;
    private String contentTitle;
    private String contentDescription;

    public Content(String contentTitle, String contentDescription) {
        this.contentId = SERIAL_CONTENT_ID;
        this.contentTitle = contentTitle;
        this.contentDescription = contentDescription;
    }

    public abstract double calculeteXP();

    public static double getXpStandard() {
        return XP_Standard;
    }

    public int getContentId() {
        return contentId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    

    
}
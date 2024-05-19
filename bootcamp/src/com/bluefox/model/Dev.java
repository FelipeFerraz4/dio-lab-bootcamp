package com.bluefox.model;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private static int SERIAL_DEV_NUMBER = 1;

    private int devId;
    private String devName;
    private Set<Content> subscribedContent;
    private Set<Content> completedContent;

    public Dev(String devName) {
        this.devId = SERIAL_DEV_NUMBER++;
        this.devName = devName;
        this.subscribedContent = new LinkedHashSet<>();
        this.completedContent = new LinkedHashSet<>();
    }

    public void registerBoocamp(Bootcamp bootcamp) {
        bootcamp.getDevsRegisted().add(this);
        this.subscribedContent.addAll(bootcamp.getContentRegisted());
    }

    public void progress() {
        Set<Content> contents = subscribedContent;
        contents.removeAll(completedContent);

        Optional<Content> content = contents.stream().findFirst();

        if (content.isPresent()) {
            completedContent.add(content.get());
        } else {
            System.err.println("Você não tem mais conteúdo para completar.");
        }
    }

    public double calculeteXPTotal() {
        return this.completedContent.stream().mapToDouble(content -> content.calculeteXP()).sum();
    }

    public int getDevId() {
        return devId;
    }

    public String getdevName() {
        return devName;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + devId;
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
        Dev other = (Dev) obj;
        if (devId != other.devId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dev [devId: " + devId + ", devName: " + devName + ", subscribedContent: " + subscribedContent
                + ", completedContent: " + completedContent + "]";
    }
}

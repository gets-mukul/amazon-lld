package com.amazonlld.entity;

import java.util.Date;

public class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account){
        return false;
    }
}

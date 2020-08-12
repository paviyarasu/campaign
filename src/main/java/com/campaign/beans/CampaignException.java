package com.campaign.beans;

public class CampaignException extends RuntimeException{

    public CampaignException(int id) {
            super("Could not find employee " + id);
        }
    }

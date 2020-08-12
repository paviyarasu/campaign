package com.campaign.beans;



import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CampaignTest")
@Data
public class CampaignTest {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "campaignId")
        private int campaignId;
        private String campaignName;
        private int targetGroupId;
        private String description;
        private int status;
        private String language;
        private int campaignCategoryId;
        private int numberOfCustomers;
        private String createdBy;
        private String createdByUser;
        private String lastUpdatedBy;
        private String lastUpdatedByUser;
        private int dealerId;
        private int includeBusinessCustomers;
        private String campaignCalls;
        private String campaignEmail;

        public CampaignTest(int campaignId, String campaignName, int targetGroupId, String description, int status, String language, int campaignCategoryId, int numberOfCustomers, String createdBy, String createdByUser, String lastUpdatedBy, String lastUpdatedByUser, int dealerId, int includeBusinessCustomers, String campaignCalls, String campaignEmail) {
                this.campaignId = campaignId;
                this.campaignName = campaignName;
                this.targetGroupId = targetGroupId;
                this.description = description;
                this.status = status;
                this.language = language;
                this.campaignCategoryId = campaignCategoryId;
                this.numberOfCustomers = numberOfCustomers;
                this.createdBy = createdBy;
                this.createdByUser = createdByUser;
                this.lastUpdatedBy = lastUpdatedBy;
                this.lastUpdatedByUser = lastUpdatedByUser;
                this.dealerId = dealerId;
                this.includeBusinessCustomers = includeBusinessCustomers;
                this.campaignCalls = campaignCalls;
                this.campaignEmail = campaignEmail;
        }

        public CampaignTest() {

        }

        public int getCampaignId() {
                return campaignId;
        }

        public void setCampaignId(int campaignId) {
                this.campaignId = campaignId;
        }

        public String getCampaignName() {
                return campaignName;
        }

        public void setCampaignName(String campaignName) {
                this.campaignName = campaignName;
        }

        public int getTargetGroupId() {
                return targetGroupId;
        }

        public void setTargetGroupId(int targetGroupId) {
                this.targetGroupId = targetGroupId;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public int getStatus() {
                return status;
        }

        public void setStatus(int status) {
                this.status = status;
        }

        public String getLanguage() {
                return language;
        }

        public void setLanguage(String language) {
                this.language = language;
        }

        public int getCampaignCategoryId() {
                return campaignCategoryId;
        }

        public void setCampaignCategoryId(int campaignCategoryId) {
                this.campaignCategoryId = campaignCategoryId;
        }

        public int getNumberOfCustomers() {
                return numberOfCustomers;
        }

        public void setNumberOfCustomers(int numberOfCustomers) {
                this.numberOfCustomers = numberOfCustomers;
        }

        public String getCreatedBy() {
                return createdBy;
        }

        public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
        }

        public String getCreatedByUser() {
                return createdByUser;
        }

        public void setCreatedByUser(String createdByUser) {
                this.createdByUser = createdByUser;
        }

        public String getLastUpdatedBy() {
                return lastUpdatedBy;
        }

        public void setLastUpdatedBy(String lastUpdatedBy) {
                this.lastUpdatedBy = lastUpdatedBy;
        }

        public String getLastUpdatedByUser() {
                return lastUpdatedByUser;
        }

        public void setLastUpdatedByUser(String lastUpdatedByUser) {
                this.lastUpdatedByUser = lastUpdatedByUser;
        }

        public int getDealerId() {
                return dealerId;
        }

        public void setDealerId(int dealerId) {
                this.dealerId = dealerId;
        }

        public int getIncludeBusinessCustomers() {
                return includeBusinessCustomers;
        }

        public void setIncludeBusinessCustomers(int includeBusinessCustomers) {
                this.includeBusinessCustomers = includeBusinessCustomers;
        }

        public String getCampaignCalls() {
                return campaignCalls;
        }

        public void setCampaignCalls(String campaignCalls) {
                this.campaignCalls = campaignCalls;
        }

        public String getCampaignEmail() {
                return campaignEmail;
        }

        public void setCampaignEmail(String campaignEmail) {
                this.campaignEmail = campaignEmail;
        }

}

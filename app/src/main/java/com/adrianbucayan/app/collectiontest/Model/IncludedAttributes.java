package com.adrianbucayan.app.collectiontest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Adrian Bucayan on 12/21/16.
 */

public class IncludedAttributes implements Serializable {

    @SerializedName("msn")
    @Expose
    private String msn;

    @SerializedName("credit")
    @Expose
    private String credit;

    @SerializedName("credit-expiry")
    @Expose
    private String creditExpiry;

    @SerializedName("data-usage-threshold")
    @Expose
    private String dataUsageThreshold;

    @SerializedName("included-data-balance")
    @Expose
    private String includedDataBalance;

    @SerializedName("included-credit-balance")
    @Expose
    private String includedCreditBalance;

    @SerializedName("included-rollover-credit-balance")
    @Expose
    private String includedRolloverCreditBalance;

    @SerializedName("included-rollover-data-balance")
    @Expose
    private String includedRolloverDataBalance;

    @SerializedName("included-international-talk-balance")
    @Expose
    private String includedInternationalTalkBalance;

    @SerializedName("expiry-date")
    @Expose
    private String expiryDate;

    @SerializedName("auto-renewal")
    @Expose
    private Boolean autoRenewal;

    @SerializedName("primary-subscription")
    @Expose
    private Boolean primarySubscription;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("included-data")
    @Expose
    private String includedData;

    @SerializedName("included-credit")
    @Expose
    private String includedCredit;

    @SerializedName("included-international-talk")
    @Expose
    private String includedInternationalTalk;

    @SerializedName("unlimited-text")
    @Expose
    private Boolean unlimitedText;

    @SerializedName("unlimited-talk")
    @Expose
    private Boolean unlimitedTalk;

    @SerializedName("unlimited-international-text")
    @Expose
    private Boolean unlimitedInternationalText;

    @SerializedName("unlimited-international-talk")
    @Expose
    private Boolean unlimitedInternationalTalk;

    @SerializedName("price")
    @Expose
    private String price;

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCreditExpiry() {
        return creditExpiry;
    }

    public void setCreditExpiry(String creditExpiry) {
        this.creditExpiry = creditExpiry;
    }

    public String getDataUsageThreshold() {
        return dataUsageThreshold;
    }

    public void setDataUsageThreshold(String dataUsageThreshold) {
        this.dataUsageThreshold = dataUsageThreshold;
    }

    public String getIncludedDataBalance() {
        return includedDataBalance;
    }

    public void setIncludedDataBalance(String includedDataBalance) {
        this.includedDataBalance = includedDataBalance;
    }

    public String getIncludedCreditBalance() {
        return includedCreditBalance;
    }

    public void setIncludedCreditBalance(String includedCreditBalance) {
        this.includedCreditBalance = includedCreditBalance;
    }

    public String getIncludedRolloverCreditBalance() {
        return includedRolloverCreditBalance;
    }

    public void setIncludedRolloverCreditBalance(String includedRolloverCreditBalance) {
        this.includedRolloverCreditBalance = includedRolloverCreditBalance;
    }

    public String getIncludedRolloverDataBalance() {
        return includedRolloverDataBalance;
    }

    public void setIncludedRolloverDataBalance(String includedRolloverDataBalance) {
        this.includedRolloverDataBalance = includedRolloverDataBalance;
    }

    public String getIncludedInternationalTalkBalance() {
        return includedInternationalTalkBalance;
    }

    public void setIncludedInternationalTalkBalance(String includedInternationalTalkBalance) {
        this.includedInternationalTalkBalance = includedInternationalTalkBalance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public Boolean getPrimarySubscription() {
        return primarySubscription;
    }

    public void setPrimarySubscription(Boolean primarySubscription) {
        this.primarySubscription = primarySubscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncludedData() {
        return includedData;
    }

    public void setIncludedData(String includedData) {
        this.includedData = includedData;
    }

    public String getIncludedCredit() {
        return includedCredit;
    }

    public void setIncludedCredit(String includedCredit) {
        this.includedCredit = includedCredit;
    }

    public String getIncludedInternationalTalk() {
        return includedInternationalTalk;
    }

    public void setIncludedInternationalTalk(String includedInternationalTalk) {
        this.includedInternationalTalk = includedInternationalTalk;
    }

    public Boolean getUnlimitedText() {
        return unlimitedText;
    }

    public void setUnlimitedText(Boolean unlimitedText) {
        this.unlimitedText = unlimitedText;
    }

    public Boolean getUnlimitedTalk() {
        return unlimitedTalk;
    }

    public void setUnlimitedTalk(Boolean unlimitedTalk) {
        this.unlimitedTalk = unlimitedTalk;
    }

    public Boolean getUnlimitedInternationalText() {
        return unlimitedInternationalText;
    }

    public void setUnlimitedInternationalText(Boolean unlimitedInternationalText) {
        this.unlimitedInternationalText = unlimitedInternationalText;
    }

    public Boolean getUnlimitedInternationalTalk() {
        return unlimitedInternationalTalk;
    }

    public void setUnlimitedInternationalTalk(Boolean unlimitedInternationalTalk) {
        this.unlimitedInternationalTalk = unlimitedInternationalTalk;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

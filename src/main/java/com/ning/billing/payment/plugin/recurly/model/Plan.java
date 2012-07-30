/*
 * Copyright 2010-2012 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.payment.plugin.recurly.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.List;

@XmlRootElement(name = "plan")
public class Plan extends RecurlyObject {
    @XmlTransient
    public static final String PLANS_RESOURCE = "/plans";

    /////////////////////////////////////////////////////
    // Attributes...

    @XmlElementWrapper(name = "add_ons")
    @XmlElement(name = "add_on")
    private List<AddOn> addOns;

    @XmlElement(name = "plan_code")
    private String planCode;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "success_url")
    private String successLink;

    @XmlElement(name = "cancel_url")
    private String cancelLink;

    @XmlElement(name = "display_donation_ammounts")
    private boolean displayDonationAmmounts;

    @XmlElement(name = "display_quantity_type")
    private boolean displayQuantityType;

    // For some reason these don't work...
    // @XmlElement(name = "display_phone_number")
    // private boolean displayPhoneNumber;

    // @XmlElement(name = "bypass_hosted_confirmation")
    // private boolean bypassHostedConfirmation;

    @XmlElement(name = "unit_name")
    private String unitName;

    @XmlElement(name = "plan_interval_unit")
    private String planIntervalUnit;

    @XmlElement(name = "plan_interval_length")
    private Integer planIntervalLength;

    @XmlElement(name = "trial_interval_length")
    private Integer trialIntervalLength;

    @XmlElement(name = "trial_interval_unit")
    private String trialIntervalUnit;

    @XmlElement(name = "accounting_code")
    private String accountingCode;

    @XmlElement(name = "created_at")
    private RecurlyDateTime createdAt;

    @XmlElement(name = "i_dont_exist")
    private String iDontExist;

    @XmlElement(name = "unit_amount_in_cents")
    private RecurlyUnitCurrency unitAmountInCents;

    @XmlElement(name = "setup_fee_in_cents")
    private RecurlyUnitCurrency setupFeeInCents;


    /////////////////////////////////////////////////////
    // Getters & Setters

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(final Object planCode) {
        this.planCode = stringOrNull(planCode);
    }

    public String getName() {
        return name;
    }

    public void setName(final Object name) {
        this.name = stringOrNull(name);
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(final Object description) {
        this.description = stringOrNull(description);
    }
    
    public String getSuccessLink() {
        return successLink;
    }

    public void setSuccessLink(final Object link) {
        this.successLink = stringOrNull(link);
    }

    public String getCancelLink() {
        return cancelLink;
    }

    public void setCancelLink(final Object link) {
        this.cancelLink = stringOrNull(link);
    }

    public boolean getDisplayDonationAmmounts() {
        return displayDonationAmmounts;
    }

    public void setDisplayDonationAmmounts(boolean displayAmmounts) {
        this.displayDonationAmmounts = displayAmmounts;
    }

    public boolean getDisplayQuantityType() {
        return displayQuantityType;
    }

    public void setDisplayQuantityType(boolean displayQuantityType) {
        this.displayQuantityType = displayQuantityType;
    }

    // public boolean getDisplayPhoneNumber() {
    //     return displayPhoneNumber;
    // }

    // public void setDisplayPhoneNumber(boolean displayPhoneNumber) {
    //     this.displayPhoneNumber = displayPhoneNumber;
    // }

    // public boolean getBypassHostedConfirmation() {
    //     return bypassHostedConfirmation;
    // }

    // public void setBypassHostedConfirmation(boolean bypassHostedConfirmation) {
    //     this.bypassHostedConfirmation = bypassHostedConfirmation;
    // }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(final Object unitName) {
        this.unitName = stringOrNull(unitName);
    }

    public String getPlanIntervalUnit() {
        return planIntervalUnit;
    }

    public void setPlanIntervalUnit(final Object planIntervalUnit) {
        this.planIntervalUnit = stringOrNull(planIntervalUnit);
    }

    public Integer getPlanIntervalLength() {
        return planIntervalLength;
    }

    public void setPlanIntervalLength(final Object planIntervalLength) {
        this.planIntervalLength = integerOrNull(planIntervalLength);
    }

    public String getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    public void setTrialIntervalUnit(final Object trialIntervalUnit) {
        this.trialIntervalUnit = stringOrNull(trialIntervalUnit);
    }

    public Integer getTrialIntervalLength() {
        return trialIntervalLength;
    }

    public void setTrialIntervalLength(final Object trialIntervalLength) {
        this.trialIntervalLength = integerOrNull(trialIntervalLength);
    }

    public String getAccountingCode() {
        return accountingCode;
    }

    public void setAccountingCode(final Object accountingCode) {
        this.accountingCode = stringOrNull(accountingCode);
    }

    public RecurlyDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final RecurlyDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // public String getUnitAmountsInCents() {
    //     return unitAmountsInCents;
    // }

    // public void setUnitAmountsInCents(final Object unitAmountsInCents) {
    //     this.unitAmountsInCents = stringOrNull(unitAmountsInCents);
    // }

    public String getIDontExist() {
        return iDontExist;
    }

    public void setIDontExist(final Object iDontExist) {
        this.iDontExist = stringOrNull(iDontExist);
    }

    public RecurlyUnitCurrency getUnitAmountInCents() {
        return unitAmountInCents;
    }

    public void setUnitAmountInCents(final RecurlyUnitCurrency unitAmountInCents) {
        this.unitAmountInCents = unitAmountInCents;
    }

    public RecurlyUnitCurrency getSetupFeeInCents() {
        return setupFeeInCents;
    }

    public void setSetupFeeInCents(final RecurlyUnitCurrency setupFeeInCents) {
        this.setupFeeInCents = setupFeeInCents;
    }

    public List<AddOn> getAddOns() {
        return this.addOns;
    }

    public void setAddOns(final List<AddOn> addOns) {
        this.addOns = addOns;
    }

    /////////////////////////////////////////////////////
    // Other

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Plan");
        sb.append("{planCode='").append(planCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", successLink='").append(successLink).append('\'');
        sb.append(", cancelLink='").append(cancelLink).append('\'');
        sb.append(", displayDonationAmmounts='").append(displayDonationAmmounts).append('\'');
        sb.append(", displayQuantityType='").append(displayQuantityType).append('\'');
        // sb.append(", displayPhoneNumber='").append(displayPhoneNumber).append('\'');
        // sb.append(", bypassHostedConfirmation='").append(bypassHostedConfirmation).append('\'');
        sb.append(", unitName='").append(unitName).append('\'');
        sb.append(", planIntervalUnit='").append(planIntervalUnit).append('\'');
        sb.append(", planIntervalLength='").append(planIntervalLength).append('\'');
        sb.append(", trialIntervalUnit='").append(trialIntervalUnit).append('\'');
        sb.append(", trialIntervalLength='").append(trialIntervalLength).append('\'');
        sb.append(", accountingCode='").append(accountingCode).append('\'');
        sb.append(", createdAt='").append(createdAt).append('\'');
        sb.append(", unitAmountInCents='").append(unitAmountInCents).append('\'');
        sb.append(", setupFeeInCents='").append(setupFeeInCents).append('\'');
        sb.append(", addOns='").append(addOns).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Plan plan = (Plan) o;

        if (name != null ? !name.equals(plan.name) : plan.name != null) {
            return false;
        }
        if (planCode != null ? !planCode.equals(plan.planCode) : plan.planCode != null) {
            return false;
        }
        if (description != null ? !description.equals(plan.description) : plan.description != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = planCode != null ? planCode.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    ////////////////////////////////////////////////////////////////////
    //
    //@XmlRootElement(name = "unit_amount_in_cents")
    @JsonIgnoreProperties(ignoreUnknown = true)
    protected static class RecurlyUnitCurrency {
        @XmlElement(name = "EUR")
        @XmlValue
        private Integer unitAmountEUR;

        @XmlElement(name = "GBP")
        @XmlValue
        private Integer unitAmountGBP;

        @XmlElement(name = "USD")
        @XmlValue
        private Integer unitAmountUSD;

        @XmlElement(name = "SEK")
        @XmlValue
        private Integer unitAmountSEK;

        public void setUnitAmountEUR(final Object unitAmountEUR) {
            this.unitAmountEUR = integerOrNull(unitAmountEUR);
        }

        public Integer getUnitAmountEUR() {
            return this.unitAmountEUR;
        }

        public void setUnitAmountGBP(final Object unitAmountGBP) {
            this.unitAmountGBP = integerOrNull(unitAmountGBP);
        }

        public Integer getUnitAmountGBP() {
            return this.unitAmountGBP;
        }

        public void setUnitAmountUSD(final Object unitAmountUSD) {
            this.unitAmountUSD = integerOrNull(unitAmountUSD);
        }

        public Integer getUnitAmountUSD() {
            return this.unitAmountUSD;
        }

        public void setUnitAmountSEK(final Object unitAmountSEK) {
            this.unitAmountSEK = integerOrNull(unitAmountSEK);
        }

        public Integer getUnitAmountSEK() {
            return this.unitAmountSEK;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("UnitAmountInCents");
            sb.append("{amount-in-EUR='").append(unitAmountEUR).append('\'');
            sb.append(",amount-in-GBP='").append(unitAmountGBP).append('\'');
            sb.append(",amount-in-USD='").append(unitAmountUSD).append('\'');
            sb.append(",amount-in-SEK='").append(unitAmountSEK).append('\'');
            sb.append('}');
            return sb.toString();
        }

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    protected static class RecurlyCurrencyAmount {
        private static  String CURRENCY_EURO = "EURO";
        private static  String CURRENCY_GBP  = "GBP";

        @XmlValue
        private String amount;

        private String unit;

        public String getUnit() {
            return unit;
        }

        public void setUnit(final String unit) {
            this.unit = unit;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(final Object amount) {
            this.amount = stringOrNull(amount);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("CurrencyAmount");
            sb.append("{unit='").append(unit).append('\'');
            sb.append(", amount='").append(amount).append('\'');
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final RecurlyCurrencyAmount currency = (RecurlyCurrencyAmount) o;

            if (amount != null ? !amount.equals(currency.amount) : currency.amount != null) {
                return false;
            }
            if (unit != null ? !unit.equals(currency.unit) : currency.unit != null) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = unit != null ? unit.hashCode() : 0;
            result = 31 * result + (amount != null ? amount.hashCode() : 0);
            return result;
        }
    }

}

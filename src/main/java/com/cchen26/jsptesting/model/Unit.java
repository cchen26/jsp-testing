package com.cchen26.jsptesting.model;

public class Unit {
    private final long customerId;
    private final String managementCompanyName;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String zip;
    private final String refNo;
    private final int bankId;
    private final String bankName;
    private final double amountDue;
    private final boolean isAutoPay;
    private final String paymentFrequency;
    private final String paymentAmountType;
    private final double fixedAmount;
    private final String nextInstallmentDate;
    private final boolean isAutoPayRunning;
    private final int maxInstallmentNumber;
    private final String untilSelectedDate;

    private Unit(UnitBuilder builder) {
        this.customerId = builder.customerId;
        this.managementCompanyName = builder.managementCompanyName;
        this.address1 = builder.address1;
        this.address2 = builder.address2;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
        this.refNo = builder.refNo;
        this.bankId = builder.bankId;
        this.bankName = builder.bankName;
        this.amountDue = builder.amountDue;
        this.isAutoPay = builder.isAutoPay;
        this.paymentFrequency = builder.paymentFrequency;
        this.paymentAmountType = builder.paymentAmountType;
        this.fixedAmount = builder.fixedAmount;
        this.nextInstallmentDate = builder.nextInstallmentDate;
        this.isAutoPayRunning = builder.isAutoPayRunning;
        this.maxInstallmentNumber = builder.maxInstallmentNumber;
        this.untilSelectedDate = builder.untilSelectedDate;
    }

    // Getters for all fields
    public long getCustomerId() {
        return customerId;
    }

    public String getManagementCompanyName() {
        return managementCompanyName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getRefNo() {
        return refNo;
    }

    public int getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public boolean isAutoPay() {
        return isAutoPay;
    }

    public String getPaymentFrequency() {
        return paymentFrequency;
    }

    public String getPaymentAmountType() {
        return paymentAmountType;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public String getNextInstallmentDate() {
        return nextInstallmentDate;
    }

    public boolean isAutoPayRunning() {
        return isAutoPayRunning;
    }

    public int getMaxInstallmentNumber() {
        return maxInstallmentNumber;
    }

    public String getUntilSelectedDate() {
        return untilSelectedDate;
    }

    public static class UnitBuilder {
        private long customerId;
        private String managementCompanyName;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String zip;
        private String refNo;
        private int bankId;
        private String bankName;
        private double amountDue;
        private boolean isAutoPay;
        private String paymentFrequency;
        private String paymentAmountType;
        private double fixedAmount;
        private String nextInstallmentDate;
        private boolean isAutoPayRunning;
        private int maxInstallmentNumber;
        private String untilSelectedDate;

        public UnitBuilder customerId(long customerId) {
            this.customerId = customerId;
            return this;
        }

        public UnitBuilder managementCompanyName(String managementCompanyName) {
            this.managementCompanyName = managementCompanyName;
            return this;
        }

        public UnitBuilder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public UnitBuilder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public UnitBuilder city(String city) {
            this.city = city;
            return this;
        }

        public UnitBuilder state(String state) {
            this.state = state;
            return this;
        }

        public UnitBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public UnitBuilder refNo(String refNo) {
            this.refNo = refNo;
            return this;
        }

        public UnitBuilder bankId(int bankId) {
            this.bankId = bankId;
            return this;
        }

        public UnitBuilder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public UnitBuilder amountDue(double amountDue) {
            this.amountDue = amountDue;
            return this;
        }

        public UnitBuilder isAutoPay(boolean isAutoPay) {
            this.isAutoPay = isAutoPay;
            return this;
        }

        public UnitBuilder paymentFrequency(String paymentFrequency) {
            this.paymentFrequency = paymentFrequency;
            return this;
        }

        public UnitBuilder paymentAmountType(String paymentAmountType) {
            this.paymentAmountType = paymentAmountType;
            return this;
        }

        public UnitBuilder fixedAmount(double fixedAmount) {
            this.fixedAmount = fixedAmount;
            return this;
        }

        public UnitBuilder nextInstallmentDate(String nextInstallmentDate) {
            this.nextInstallmentDate = nextInstallmentDate;
            return this;
        }

        public UnitBuilder isAutoPayRunning(boolean isAutoPayRunning) {
            this.isAutoPayRunning = isAutoPayRunning;
            return this;
        }

        public UnitBuilder maxInstallmentNumber(int maxInstallmentNumber) {
            this.maxInstallmentNumber = maxInstallmentNumber;
            return this;
        }

        public UnitBuilder untilSelectedDate(String untilSelectedDate) {
            this.untilSelectedDate = untilSelectedDate;
            return this;
        }

        public Unit build() {
            return new Unit(this);
        }
    }
}

package com.cchen26.jsptesting.model;

public class GroupUser extends User {
    private final long customerGroupId;
    private final long unitId;
    private final int clientId;
    private final String otherName;
    private final String address1;
    private final String city;
    private final String state;
    private final String zip;
    private final String bankName;
    private final String transitNo;
    private final String accountNo;
    private final int accountTypeId;
    private final String accountName;
    private final String refNo;
    private final String address2;
    private final String ipAddr;

    private GroupUser(GroupUserBuilder builder) {
        super(builder);
        this.customerGroupId = builder.custGrpId;
        this.unitId = builder.unitId;
        this.clientId = builder.clientId;
        this.otherName = builder.otherName;
        this.address1 = builder.address1;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
        this.bankName = builder.bankName;
        this.transitNo = builder.transitNo;
        this.accountNo = builder.accountNo;
        this.accountTypeId = builder.accountTypeId;
        this.accountName = builder.accountName;
        this.refNo = builder.refNo;
        this.address2 = builder.address2;
        this.ipAddr = builder.ipAddr;
    }

    // Getters for all fields

    public long getCustomerGroupId() {
        return customerGroupId;
    }

    public long getUnitId() {
        return unitId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getAddress1() {
        return address1;
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

    public String getBankName() {
        return bankName;
    }

    public String getTransitNo() {
        return transitNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public int getAccountTypeId() {
        return accountTypeId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getRefNo() {
        return refNo;
    }

    public String getAddress2() {
        return address2;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public static class GroupUserBuilder extends UserBuilder<GroupUserBuilder> {
        private long custGrpId;
        private long unitId = 0; // Default value
        private int clientId = 0; // Default value
        private String otherName = ""; // Default value
        private String address1 = ""; // Default value
        private String city = ""; // Default value
        private String state = ""; // Default value
        private String zip = ""; // Default value
        private String bankName = ""; // Default value
        private String transitNo = ""; // Default value
        private String accountNo = ""; // Default value
        private int accountTypeId = 0; // Default value
        private String accountName = ""; // Default value
        private String refNo = ""; // Default value
        private String address2 = ""; // Default value
        private String ipAddr = ""; // Default value

        public GroupUserBuilder custGrpId(long custGrpId) {
            this.custGrpId = custGrpId;
            return this;
        }

        public GroupUserBuilder unitId(long unitId) {
            this.unitId = unitId;
            return this;
        }

        public GroupUserBuilder clientId(int clientId) {
            this.clientId = clientId;
            return this;
        }

        public GroupUserBuilder otherName(String otherName) {
            this.otherName = otherName;
            return this;
        }

        public GroupUserBuilder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public GroupUserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public GroupUserBuilder state(String state) {
            this.state = state;
            return this;
        }

        public GroupUserBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public GroupUserBuilder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public GroupUserBuilder transitNo(String transitNo) {
            this.transitNo = transitNo;
            return this;
        }

        public GroupUserBuilder accountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }

        public GroupUserBuilder accountTypeId(int accountTypeId) {
            this.accountTypeId = accountTypeId;
            return this;
        }

        public GroupUserBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public GroupUserBuilder refNo(String refNo) {
            this.refNo = refNo;
            return this;
        }

        public GroupUserBuilder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public GroupUserBuilder ipAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }

        @Override
        public GroupUser build() {
            return new GroupUser(this);
        }

        @Override
        protected GroupUserBuilder self() {
            return this;
        }
    }
}

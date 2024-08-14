package com.cchen26.jsptesting.model;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    protected User(UserBuilder<?> builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    // Getters for all fields
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder<T extends UserBuilder<T>> {
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public T firstName(String firstName) {
            this.firstName = firstName;
            return self();
        }

        public T lastName(String lastName) {
            this.lastName = lastName;
            return self();
        }

        public T email(String email) {
            this.email = email;
            return self();
        }

        public T password(String password) {
            this.password = password;
            return self();
        }

        @SuppressWarnings("unchecked")
        protected T self() {
            return (T) this;
        }

        public User build() {
            return new User(this);
        }
    }
}

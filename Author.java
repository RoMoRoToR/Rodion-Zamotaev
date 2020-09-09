package ru.mirea.pr2;

public class Author {
        private String name;
        private String email;
        private String gender;

        public Author(String a, String b, String c) {
            name=a;
            email=b;
            gender=c;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getGender() {
            return gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
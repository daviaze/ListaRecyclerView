package com.daviazevedodev.listarecyclerview.model;

public class Email {
    private String user;
    private String subject;
    private String preview;
    private String stared;
    private Boolean unread;
    private String selected;
    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getStared() {
        return stared;
    }

    public void setStared(String stared) {
        this.stared = stared;
    }

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public static class EmailBuilder {
        private String user;
        private String subject;
        private String preview;
        private String stared;
        private Boolean unread;
        private String selected;
        private String date;

        public EmailBuilder setUser(String user) {
            this.user = user;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;

        }

        public EmailBuilder setPreview(String preview) {
            this.preview = preview;
            return this;

        }

        public EmailBuilder setStared(String stared) {
            this.stared = stared;
            return this;

        }

        public EmailBuilder setUnread(Boolean unread) {
            this.unread = unread;
            return this;

        }

        public EmailBuilder setSelected(String selected) {
            this.selected = selected;
            return this;
        }



        private EmailBuilder() {}
        public static EmailBuilder builder(){
            return new EmailBuilder();
        }
        public Email build() {
            Email email = new Email();
            email.user = user;
            email.subject = subject;
            email.preview = preview;
            email.date = date;
            email.subject = subject;
            email.stared = stared;
            email.unread = unread;
            email.selected = selected;
            return email;



        }

        public EmailBuilder setDate(String date) {
            this.date = date;
            return this;
        }
    }
}

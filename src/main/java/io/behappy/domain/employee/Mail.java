package io.behappy.domain.employee;

import static com.google.common.base.Preconditions.checkArgument;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        //TODO Add some fancy mail validator
        checkArgument(true, "Wrong mail address");
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return mail;
    }
}

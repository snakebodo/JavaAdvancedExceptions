package Task1ClassesAndInterfaces;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateEmails(String emailString) {


        class Email {
            private String email;

            public Email(String email) {
                this.email = email;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
        Email email = new Email(emailString);
        if (email.getEmail().isEmpty()) {
            email.setEmail("unknown");
            return false;
        }
        boolean VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z] {2,6}$",
                        Pattern.CASE_INSENSITIVE).matcher(email.getEmail()).find();
        if (!VALID_EMAIL_ADDRESS_REGEX) {
            email.setEmail("Unknown");
            return false;
        }
        return true;
    }
}


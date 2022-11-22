package Task1ClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        System.out.println(userValidator.validateEmails("abcd"));
    }
}

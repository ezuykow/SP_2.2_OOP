import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class SignIn {

    private static final String LOGIN_REGEX = "\\w{1,20}";
    private static final String PASSWORD_REGEX = "\\w{1,20}";

    private static String login;
    private static String password;
    private static String confirmPassword;

    public static boolean sign(String log, String pass, String confPass) {
        login = log;
        password = pass;
        confirmPassword = confPass;

        checkData();

        return true;
    }

    private static void checkData() {
        if (!login.matches(LOGIN_REGEX)) {
            throw new WrongLoginException();
        }
        if (!(password.matches(PASSWORD_REGEX) && password.equals(confirmPassword))) {
            throw new WrongPasswordException();
        }
    }
}

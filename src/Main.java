import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(SignIn.sign("w1_sdyuf34", "qwerty123_", "qwerty123_"));
        } catch (WrongLoginException e) {
            System.out.println("Wrong login!");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password or confirm password!");
        }
    }
}
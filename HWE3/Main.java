package HWE3;

import HWE3.ex.WrongLoginException;
import HWE3.ex.WrongPasswordException;

/**
 * 1. Создать статический метод который принимает на вход три параметра: login,
 * password и confirmPassword.
 * 2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * 3. Длина login должна быть меньше 20 символов.
 * Если login не соответствует этим требованиям, необходимо выбросить
 * WrongLoginException.
 * 4. Password должен содержать только латинские буквы, цифры и знак
 * подчеркивания.
 * Длина password должна быть меньше 20 символов. Также password и
 * confirmPassword должны быть равны.
 * 5. Если password не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException.
 * <p>
 * 6. WrongPasswordException и WrongLoginException - пользовательские классы
 * исключения с двумя конструкторами –
 * один по умолчанию, второй принимает сообщение исключения и передает его в
 * конструктор класса Exception.
 * 7. Обработка исключений проводится внутри метода.
 * 8. Метод возвращает true, если значения верны или false в другом случае.
 */
public class Main {
    private static boolean isValid(String login, String password, String confirmPassword) {
        try {
            verify(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
            return false;
        }

        return true;
    }

    private static void verify(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        String verifier = "[A-Za-z\\d_]{1,19}$";
        if (login == null) {
            throw new WrongLoginException("login not specified");
        }

        if (password == null) {
            throw new WrongPasswordException("password not specified");
        }

        if (login.isEmpty() || login.length() > 19) {
            throw new WrongLoginException("login length can be from 1 to 19 characters");
        }

        if (password.isEmpty() || password.length() > 19) {
            throw new WrongPasswordException("password length can be from 1 to 19 characters");
        }

        if (!login.matches(verifier)) {
            throw new WrongLoginException("login should contain only characters: a-Z, 0-9 & _");
        }

        if (!password.matches(verifier)) {
            throw new WrongPasswordException("password should contain only characters: a-Z, 0-9 & _");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password & confirm password not equals");
        }
    }
}

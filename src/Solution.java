import java.io.File;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {

        System.out.println("Privet,".matches("^\\w+$"));

        System.out.println(checkLPP("ROganov_","1fsfkskf2312AAAAAAAAAAAAAAAAAAAAAAA","1fsfkskf2312"));


    }

    public static boolean checkLPP(String login,String password,String passwordConfirm){
        try{
            if(!(login.matches("^\\w+$") && login.length() <= 20)) {
                throw new WrongLoginException();
            } else if (!(password.matches("^\\w+$") && password.length() < 20 && password.equals(passwordConfirm))){
                throw new WrongPasswordException();
            }
            return true;
        } catch (WrongLoginException e){
            System.out.println("Логин не соответствует требованиям");
            return false;
        } catch (WrongPasswordException e){
            System.out.println("Пароль не соответсвует требованиям, либо пароли не одинаковы");
            return false;
        } finally {
            System.out.println("Проверка завершена");
        }


    }
}

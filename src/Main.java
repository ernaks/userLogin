import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password;
        String correctPassword = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Şifre giriniz: ");
        password = sc.nextLine();
        if(!password.equals(correctPassword)) {
            System.out.println("Şifre hatalı! Şifre sıfırlamak için 1'e basın. Sıfırlamadan devam etmek için 2'ye basın.");
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("Yeni şifrenizi girin.");
                String newPassword = sc.nextLine();
                if (newPassword.equals(correctPassword))
                    System.out.println("Yeni şifreniz önceki şifreyle aynı olamaz.");
                else
                    System.out.println("Şifre oluşturuldu");
            } else if (option == 2)
                System.out.println("Şifre sıfırlama iptal edildi.");
        }
        else
                System.out.println("Giriş yaptınız!");

    }
}
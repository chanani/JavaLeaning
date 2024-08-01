package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("HTTP CODE : ");
        int httpCoeInput = scan.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCoeInput);
        if(status == null){
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }

        HttpStatus status1 = HttpStatus.valueOf("OK");
        System.out.println("status1 Code = " + status1.getCode());
        System.out.println("status1 Message = " + status1.getMessage());

        HttpStatus status2 = HttpStatus.OK;
        System.out.println("status2 Code = " + status2.getCode());
        System.out.println("status2 Message = " + status2.getMessage());
    }
}

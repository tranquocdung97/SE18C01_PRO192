/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class NewClass {
    public static int NewClass(long barcode) {
        int sum = 0;
        int[] digits = new int[11];
        for (int i = 10; i >= 0; i--) {
            digits[i] = (int) (barcode % 10);// tách chuỗi  
            barcode /= 10;
        }
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sum += digits[i] * 3;
            } else {
                sum += digits[i];
            }
        }
        return (10 - sum % 10) % 10;// lay phan du cua sum , %10  chặn số TH 10 - 0 = 10 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma vach : ");
        long barcode = scanner.nextLong();
        scanner.close();

        if (barcode >= 1 && barcode < 100000000000L) {
            int result = NewClass(barcode);
            System.out.println("Checksum cho vach ma " + barcode + ": " + result);
        } else {
            System.out.println("Ma vach khong hop le .");
        }
    }
}


















































//Đoạn mã Java này thuộc gói `BaitapDiemcong` và chứa một lớp `ChecksumPart1` với hai phương thức: `checksumPart1` và `main`.
//
//Phương thức `checksumPart1` nhận vào một mã vạch dưới dạng số nguyên dài và trả về một số nguyên là kết quả của thuật toán checksum. Thuật toán này hoạt động như sau:
//- Chuyển đổi mã vạch thành một mảng các chữ số.
//- Tính tổng các chữ số của mã vạch, với các chữ số ở vị trí chẵn được nhân thêm với 3.
//- Trả về phần dư của tổng khi chia cho 10, trừ đi từ 10 và lấy phần dư khi chia cho 10.
//
//Phương thức `main` thực hiện các công việc sau:
//- Nhập mã vạch từ người dùng.
//- Kiểm tra xem mã vạch có hợp lệ không (nằm trong khoảng từ 1 đến 100000000000).
//- Nếu mã vạch hợp lệ, nó sẽ tính toán và in ra kết quả checksum.
//- Nếu không, nó sẽ thông báo rằng mã vạch không hợp lệ. 
//
//Đây là một cách tiếp cận thông thường để tính toán checksum, một kỹ thuật được sử dụng rộng rãi trong lĩnh vực công nghệ thông tin để kiểm tra tính toàn vẹn của dữ liệu.

//
//Đoạn mã `return (10 - sum % 10) % 10;` được sử dụng để tính toán checksum (tổng kiểm tra) cho một mã vạch. 
//
//Trong thuật toán này, `sum` là tổng của các chữ số trong mã vạch, với mỗi chữ số ở vị trí chẵn được nhân với 3 và mỗi chữ số ở vị trí lẻ được cộng vào `sum`. 
//
//`sum % 10` sẽ cho phép chúng ta lấy phần dư của `sum` khi chia cho 10, đây là cách thông thường để lấy chữ số cuối cùng của một số.
//
//`10 - sum % 10` sẽ trả về một số sao cho nếu bạn cộng nó vào `sum` thì tổng sẽ là một bội số của 10. Điều này giúp đảm bảo rằng tổng kiểm tra (checksum) cộng với `sum` sẽ là một bội số của 10, điều này rất hữu ích trong việc kiểm tra tính đúng đắn của mã vạch.
//
//Cuối cùng, `(10 - sum % 10) % 10` được sử dụng để đảm bảo rằng kết quả luôn nằm trong khoảng từ 0 đến 9. Điều này cần thiết vì nếu `sum` là một bội số của 10, thì `10 - sum % 10` sẽ là 10, nhưng chúng ta muốn kết quả cuối cùng là một chữ số duy nhất, do đó chúng ta lấy kết quả đó chia lấy dư cho 10 một lần nữa. 
//
//Ví dụ, nếu `sum` là 30, thì `10 - sum % 10` sẽ là `10 - 0 = 10`, nhưng chúng ta muốn kết quả cuối cùng là 0, không phải 10, do đó chúng ta lấy `10 % 10` để có kết quả cuối cùng là 0. 
//
//Đây là lý do vì sao chúng ta phải lấy dư 10 trong đoạn mã này.
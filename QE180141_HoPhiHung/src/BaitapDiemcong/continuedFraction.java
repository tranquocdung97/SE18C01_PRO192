/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapDiemcong;

/**
 *
 * @author Ho Phi Hung
 */

import java.util.Scanner;

public class continuedFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu :");
        int n = scanner.nextInt();
        while (n > 10) {
            System.out.println("So luong phan tu phai duoi 11. Hay nhap lai:");
            n = scanner.nextInt();
        }
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu trong mang :");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }        
        scanner.close();
        System.out.println(calculateProduct(a));
    }

    public static long calculateProduct(int[] a) {
        long[] result = continuedFraction(a);
        return result[0] * result[1];
    }

    public static long[] continuedFraction(int[] a) {
        long tu = 1;
        long mau = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            long temp = mau;
            mau = tu + mau * a[i];
            tu = temp;
        }

        return new long[]{tu, mau};
    }
}



/*
Đoạn mã bạn đã cung cấp là một chương trình Java để tính toán phân số tiếp tục. Dưới đây là mô tả chi tiết về cách nó hoạt động:

1. **Hàm main**: Hàm này khởi tạo một đối tượng `Scanner` để đọc dữ liệu từ người dùng.
Nó yêu cầu người dùng nhập số lượng phần tử (n), và nếu n > 10, nó sẽ yêu cầu người dùng nhập lại. 
Sau đó, nó khởi tạo một mảng `a` với `n` phần tử và yêu cầu người dùng nhập các phần tử của mảng. Cuối cùng, nó gọi hàm `calculateProduct(a)` và
in kết quả ra màn hình.

2. **Hàm calculateProduct**: Hàm này nhận một mảng số nguyên `a` làm đối số. Nó gọi hàm `continuedFraction(a)` 
để tính toán phân số tiếp tục và sau đó trả về tích của tử số và mẫu số.

3. **Hàm continuedFraction**: Hàm này nhận một mảng số nguyên `a` làm đối số và tính toán phân số tiếp tục. 
Nó bắt đầu bằng cách đặt tử số bằng 1 và mẫu số bằng phần tử cuối cùng của mảng. Sau đó, nó lặp qua mảng từ cuối về đầu, 
cập nhật tử số và mẫu số theo công thức của phân số tiếp tục. Cuối cùng, nó trả về một mảng hai phần tử chứa tử số và mẫu số.

Vì vậy, chương trình này sẽ tính toán phân số tiếp tục của một dãy số nguyên và sau đó trả về tích của tử số và mẫu số.
Phân số tiếp tục là một cách biểu diễn số hữu tỉ thông qua một chuỗi các phân số đơn giản. 
Trong trường hợp này, chương trình sử dụng phép toán nhân thay vì phép toán cộng thông thường trong phân số tiếp tục.
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Ho Phi Hung
 */
import BaitapDiemcong.*;
import java.math.BigInteger;
import java.util.Scanner;
public class continuedFraction {
    
//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu :");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu trong mang :");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }        scanner.close();

        System.out.println(calculateProduct(a));
    }

    public static BigInteger calculateProduct(int[] a) {
        BigInteger[] result = continuedFraction(a);
        return result[0].multiply(result[1]);
    }

    public static BigInteger[] continuedFraction(int[] a) {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.valueOf(a[a.length - 1]);

        for (int i = a.length - 2; i >= 0; i--) {
            BigInteger temp = denominator;
            denominator = numerator.add(denominator.multiply(BigInteger.valueOf(a[i])));
            numerator = temp;
        }

        return new BigInteger[]{numerator, denominator};
    }
}
/*
Đoạn mã này là một chương trình Java trong gói `BaitapDiemcong`, với tên lớp là `continuedFraction`. Chương trình này thực hiện các chức năng sau:

1. **Hàm main**: Hàm này là điểm bắt đầu của chương trình. Nó yêu cầu người dùng nhập số lượng phần tử và các phần tử trong mảng. 
Sau đó, nó gọi hàm `calculateProduct` với mảng đã nhập và in kết quả ra màn hình.

2. **Hàm calculateProduct**: Hàm này nhận một mảng số nguyên `a` làm đối số
gọi hàm `continuedFraction` với mảng `a` và trả về tích của hai phần tử trong mảng kết quả.

3. **Hàm continuedFraction**: Hàm này nhận một mảng số nguyên `a` làm đối số và trả về một mảng gồm hai phần tử BigInteger. 
Phần tử đầu tiên và phần tử thứ hai của mảng kết quả lần lượt là tử số và mẫu số của phân số liên tiếp được tính từ mảng `a`.

Đoạn mã này sử dụng lớp `BigInteger` của Java để thực hiện các phép toán trên số nguyên lớn, và lớp `Scanner` để đọc dữ liệu đầu vào từ người dùng. 

Vui lòng cho biết nếu bạn muốn biết thêm chi tiết về bất kỳ phần nào của đoạn mã này.
*/
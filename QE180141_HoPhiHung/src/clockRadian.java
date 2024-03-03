/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Ho Phi Hung
 */

import BaitapDiemcong.*;
import java.util.Scanner;

public class clockRadian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thoi gian  (hh:mm): ");
        String time = scanner.nextLine();

        String result = clockRadian(time);
        System.out.println("Goc giua kim va phut : " + result);
    }

    public static String clockRadian(String time) {
        String[] parts = time.split(":"); // tach chuỗi ở giữa : thành 2 phần 
        int hour = Integer.parseInt(parts[0]);  // đưa giờ thành 1 số nguyên là 1 chỗi 
        int minute = Integer.parseInt(parts[1]);

        if (hour < 0 || minute < 0 || hour > 12 || minute > 59) { //kiem tra 
            return "Nhap sai thoi gian ";
        }

//        if (hour == 12) {
//            hour = 0;
//        }

//        if (minute == 60) {
//            minute = 0;
//            hour += 1;
//            if (hour > 12) {
//                hour -= 12;
//            }
//        }

        double hourAngle = 0.5 * (hour * 60 + minute);
        double minuteAngle = 6 * minute;
        double angle = Math.abs(hourAngle - minuteAngle);

        // Rút gọn góc về dạng phân số
        int gcd = greatestCommonDivisor((int) angle, 360);
        int numerator = (int) (angle / gcd);
        int denominator = 360 / gcd;

        if (denominator == 1) {
            return numerator + "pi";
        } else {
            return numerator + "pi/" + denominator;
        }
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}































//Đây là một chương trình Java trong gói `BaitapDiemcong` có tên là `clockRadian`. Chương trình này tính toán góc giữa kim giờ và kim phút trên đồng hồ analog dựa trên thời gian được nhập vào từ bàn phím.
//
//Dưới đây là mô tả chi tiết về cách chương trình hoạt động:
//
//1. **Hàm main**: Hàm này khởi tạo một đối tượng `Scanner` để đọc dữ liệu từ bàn phím. Nó yêu cầu người dùng nhập thời gian dưới dạng "hh:mm", sau đó gọi hàm `clockRadian` với thời gian đã nhập để tính toán góc giữa kim giờ và kim phút. Kết quả sau cùng được in ra màn hình.
//
//2. **Hàm clockRadian**: Hàm này nhận vào một chuỗi thời gian, tách chuỗi này thành giờ và phút, sau đó chuyển đổi chúng thành số nguyên. Nếu giờ hoặc phút không hợp lệ (ví dụ: giờ ngoài khoảng 0-12 hoặc phút ngoài khoảng 0-59), 
//hàm sẽ trả về thông báo lỗi. Nếu không, hàm sẽ tính toán góc giữa kim giờ và kim phút dựa trên các công thức vật lý. Kết quả cuối cùng được rút gọn về dạng phân số và trả về dưới dạng chuỗi.
//
//3. **Hàm greatestCommonDivisor**: Hàm này nhận vào hai số nguyên và trả về ước chung lớn nhất (UCLN) của chúng. Đây là một thuật toán đệ quy cổ điển được sử dụng để rút gọn góc về dạng phân số trong hàm `clockRadian`.
//

//Chắc chắn, tôi sẽ giải thích cụ thể hơn về công thức tính góc trong chương trình.
//
//Trong một đồng hồ analog, kim giờ và kim phút di chuyển với tốc độ khác nhau. Kim giờ di chuyển 360 độ trong 12 giờ, trong khi kim phút di chuyển 360 độ trong 1 giờ. Do đó, tốc độ di chuyển của kim giờ là 0.5 độ/phút, trong khi tốc độ di chuyển của kim phút là 6 độ/phút.
//
//Vì vậy, góc của kim giờ so với vị trí 12 giờ được tính bằng công thức: `hourAngle = 0.5 * (hour * 60 + minute)`. Trong đó, `hour * 60 + minute` là số phút kể từ thời điểm 12 giờ.
//
//Tương tự, góc của kim phút so với vị trí 12 giờ được tính bằng công thức: `minuteAngle = 6 * minute`.
//
//Góc giữa kim giờ và kim phút là hiệu giữa `hourAngle` và `minuteAngle`, được lấy giá trị tuyệt đối để luôn có góc không âm: `angle = Math.abs(hourAngle - minuteAngle)`.
//
//Cuối cùng, góc này được rút gọn về dạng phân số bằng cách chia cho ước chung lớn nhất (UCLN) của nó và 360. Kết quả cuối cùng được biểu diễn dưới dạng chuỗi, với "pi" thể hiện rằng đây là một góc được đo bằng radian.
//

/*
Hàm `clockRadian` trong mã của bạn được thiết kế để tính góc giữa kim giờ và kim phút của đồng hồ tại một thời điểm nhất định và trả về góc này theo radian dưới dạng một chuỗi.

Đây là bảng phân tích mã bạn đã hỏi:

``` java
public static String clockRadian(String time) {
     String[] parts = time.split(://);
     int giờ = Integer.parseInt(parts[0]);
     int phút = Integer.parseInt(parts[1]);
```

- `String[] parts = time.split(://);` Dòng này chia chuỗi đầu vào `time` thành hai phần ở dấu hai chấm. Kết quả là một mảng trong đó phần tử đầu tiên (`parts[0]`) là giờ và phần tử thứ hai (`parts[1]`) là phút.
- `int giờ = Integer.parseInt(parts[0]);` Dòng này chuyển đổi giờ (là một chuỗi) thành một số nguyên.
- `int phút = Integer.parseInt(parts[1]);` Dòng này chuyển đổi phút (cũng là một chuỗi) thành một số nguyên.

Vì vậy, phần mã này chịu trách nhiệm phân tích chuỗi thời gian đầu vào thành một giờ và một phút, cả hai đều dưới dạng số nguyên. Phần còn lại của hàm sau đó sử dụng các giá trị này để tính góc giữa kim giờ và kim phút của đồng hồ. Góc sau đó được đơn giản hóa thành một phần của π và được trả về dưới dạng một chuỗi. Nếu mẫu số của phân số là 1 thì chỉ có tử số được trả về bằng "pi". Nếu không, phân số được trả về ở định dạng "tử số pi/mẫu số".

Hàm này giả định rằng thời gian đầu vào ở định dạng 12 giờ. Nếu thời gian nhập không hợp lệ (ví dụ: giờ > 12 hoặc phút > 59), nó sẽ trả về chuỗi “Nhập sai thời gian”, nghĩa là “Nhập thời gian sai” trong tiếng Việt. Nếu giờ là 12 thì nó được chuyển thành 0 để phù hợp với kiểu đồng hồ 12 giờ. Nếu phút là 60, nó được chuyển thành 0 và giờ được tăng thêm 1, chuyển sang 0 nếu vượt quá 12. Khi đó, góc của kim giờ và kim phút được tính toán dựa trên các giá trị này. Sự khác biệt tuyệt đối giữa các góc này là góc giữa hai bàn tay. Sau đó, góc này được đơn giản hóa thành phân số π bằng cách sử dụng ước số chung lớn nhất (gcd) của góc và 360. Gcd được tính bằng thuật toán Euclide trong hàm `GreatestCommonDivisor`. Sau đó, phân số được trả về dưới dạng chuỗi theo định dạng được mô tả ở trên.

Tôi hi vọng cái này giúp được! Hãy cho tôi biết nếu bạn có bất kì câu hỏi nào khác. 😊
*/
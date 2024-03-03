/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Ho Phi Hung
 */
import BaitapDiemcong.*;
import static BaitapDiemcong.clockRadian.clockRadian;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class clockHandAngle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap goc (degree): ");
        int angle = scanner.nextInt();
        System.out.print("Nhap thoi gian  (hh:mm:ss): ");
        String timeNow = scanner.next();
        String result = clockHandAngle2(angle, timeNow);
        System.out.println("Thoi gian tiep theo co goc giua kim gio va phut la " + angle + " do: " + result);
    }

    public static String clockHandAngle2(int angle, String timeNow) {
        LocalTime time = LocalTime.parse(timeNow);
        while (true) {
            double hourAngle = time.getHour() % 12 * 30 + time.getMinute() * 0.5;
            double minuteAngle = time.getMinute() * 6;
            double diff = Math.abs(hourAngle - minuteAngle);
            diff = Math.min(diff, 360 - diff);
            if (Math.abs(diff - angle) < 0.5) {
                break;
            }
            time = time.plusMinutes(1);
        }
        return time.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }
}

//Đây là một chương trình Java trong gói `BaitapDiemcong`. Chương trình này có mục đích tìm thời gian tiếp theo mà góc giữa kim giờ và kim phút trên đồng hồ là một góc cụ thể, được nhập từ bàn phím.
//
//Chương trình bao gồm hai phần chính:
//
//1. **Hàm main**: Hàm này yêu cầu người dùng nhập góc (đơn vị là độ) và thời gian hiện tại (định dạng hh:mm:ss). Sau đó, nó gọi hàm `clockHandAngle2` với hai tham số này và in kết quả ra màn hình.
//
//2. **Hàm clockHandAngle2**: Hàm này nhận vào một góc và một chuỗi thời gian, sau đó tìm thời gian tiếp theo mà tại thời điểm đó, góc giữa kim giờ và kim phút trên đồng hồ bằng với góc đã cho. Nó sử dụng một vòng lặp vô hạn để tăng thời gian lên một phút sau mỗi lần lặp, và kiểm tra góc giữa kim giờ và kim phút. Khi góc này gần bằng với góc đã cho (chênh lệch nhỏ hơn 0.5 độ), hàm sẽ dừng và trả về thời gian đó dưới dạng chuỗi.
//
//Lưu ý: Chương trình này không kiểm tra tính hợp lệ của dữ liệu đầu vào, nên nếu bạn nhập một góc hoặc thời gian không hợp lệ, nó có thể dẫn đến lỗi.
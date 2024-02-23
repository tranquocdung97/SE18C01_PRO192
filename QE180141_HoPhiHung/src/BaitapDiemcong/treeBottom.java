/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapDiemcong;

/**
 *
 * @author Ho Phi Hung
 */
import java.util.*;
import java.util.Scanner;

public class treeBottom {
    static class Node {
        int value;
        Node left, right;
    }

    static class TreeParser {
        String tree;
        int pos;

        TreeParser(String tree) {
            this.tree = tree;
            this.pos = 1;
        }

        Node parse() {
            if (tree.charAt(pos) == ')') {
                pos += 2;
                return null;
            }
            Node node = new Node();
            int valueEnd = tree.indexOf(' ', pos);
            node.value = Integer.parseInt(tree.substring(pos, valueEnd));
            pos = valueEnd + 2;
            node.left = parse();
            node.right = parse();
            pos++;
            return node;
        }
    }

    static class TreeAnalyzer {
        Node root;
        Map<Integer, Integer> depthSum = new HashMap<>();
        int maxDepth = 0;

        TreeAnalyzer(Node root) {
            this.root = root;
        }

        void analyze(Node node, int depth) {
            if (node == null) return;
            maxDepth = Math.max(maxDepth, depth);
            depthSum.put(depth, depthSum.getOrDefault(depth, 0) + node.value);
            analyze(node.left, depth + 1);
            analyze(node.right, depth + 1);
        }

        int getBottomSum() {
            analyze(root, 0);
            return depthSum.get(maxDepth);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cây nhị phân:");
        String tree = scanner.nextLine();
        Node root = new TreeParser(tree).parse();
        int bottomSum = new TreeAnalyzer(root).getBottomSum();
        System.out.println("Tổng các nút ở mức sâu nhất: " + bottomSum);
    }
}



/*

Đoạn mã này tạo ra một chương trình Java để phân tích một cây nhị phân 
được biểu diễn dưới dạng một chuỗi và tính tổng các nút ở mức sâu nhất của cây.

Dưới đây là mô tả chi tiết về cách chương trình hoạt động:

1. **Node**: Đây là một lớp nội bộ đại diện cho một nút trong cây nhị phân. 
Mỗi nút có một giá trị (được lưu trữ trong biến `value`) 
và hai con trỏ đến nút con bên trái (`left`) và nút con bên phải (`right`).

2. **TreeParser**: Lớp này được sử dụng để phân tích một chuỗi biểu diễn cây nhị phân 
và tạo ra cấu trúc cây tương ứng. Phương thức `parse()` 
được gọi đệ quy để xây dựng cây từ chuỗi.

3. **TreeAnalyzer**: Lớp này được sử dụng để phân tích cây nhị phân và tính toán tổng các nút ở mức sâu nhất.
Phương thức `analyze()` được gọi đệ quy để duyệt qua tất cả các nút trong cây và cập nhật tổng giá trị tại mỗi độ sâu. 
Phương thức `getBottomSum()` sau đó trả về tổng giá trị của các nút ở mức sâu nhất.

4. **main**: Đây là phương thức chính của chương trình. 
Nó yêu cầu người dùng nhập vào một chuỗi biểu diễn cây nhị phân,
sau đó sử dụng `TreeParser` để phân tích chuỗi này thành một cây nhị phân, 
và cuối cùng sử dụng `TreeAnalyzer` để tính toán và in ra tổng các nút ở mức sâu nhất của cây. 

Vui lòng lưu ý rằng, chuỗi biểu diễn cây nhị phân cần tuân theo định dạng cụ thể 
để chương trình có thể phân tích chính xác. Mỗi nút được biểu diễn bằng giá trị của nó, 
theo sau là hai nút con của nó, tất cả được bao quanh bởi dấu ngoặc đơn. Ví dụ: `(10 (20 () ()) (30 () ()))` 
biểu diễn một cây nhị phân với nút gốc có giá trị 10, nút con bên trái có giá trị 20 và nút con bên phải có giá trị 30. 
Nút 20 không có nút con nào, trong khi nút 30 có một nút con bên phải nhưng không có nút con bên trái.

*/

/*
Đoạn mã trên đầu tiên phân tích chuỗi biểu diễn của cây thành một cấu trúc dữ liệu cây lồng nhau. 
Sau đó, nó sử dụng tìm kiếm theo chiều sâu để tính tổng các nút xa nhất từ gốc cây. 
Hàm dfs trả về một cặp (depth, sum),
trong đó depth là độ sâu tối đa của cây con có gốc tại node, và sum là tổng các giá trị của các nút ở độ sâu tối đa.
Nếu cây con trái và phải có độ sâu khác nhau, nó sẽ trả về tổng của cây con sâu hơn;
nếu chúng có cùng độ sâu, nó sẽ trả về tổng của cả hai cây con.
Kết quả cuối cùng là thành phần tổng của kết quả của dfs trên gốc cây.

Lưu ý rằng đoạn mã này giả định rằng chuỗi đầu vào được định dạng đúng và đại diện cho một cây nhị phân hợp lệ.
Nếu chuỗi đầu vào không được định dạng đúng, đoạn mã có thể không hoạt động đúng. 
Ngoài ra, đoạn mã giả định rằng các giá trị của các nút là số nguyên không âm.
Nếu các giá trị không phải là số nguyên không âm, đoạn mã có thể không hoạt động đúng.
*/

/*
int[] treeBottom(String tree) {
    int count = 0;
    int highest = 0;
    String[] treeList = tree.split(" ");
    List<String> nodes = new ArrayList<>();
    for(String c : treeList){
        for(char d : c.toCharArray()){
            if(d == '('){
                count++;
            }
            if(d == ')'){
                count--;
            }
        }
        String newS = c.replace("(", "");
        newS = newS.replace(")", "");
        newS = newS.replace(" ", "");
        if(newS.length() > 0){
            nodes.add(newS);
            nodes.add("" + count);
            if(count > highest){
                highest = count;
            }
        }
    }
    List<Integer> sol = new ArrayList<>();
    for(int i = 0; i < nodes.size(); i+=2){
        int countN = Integer.parseInt(nodes.get(i+1));
        if(countN == highest){
            sol.add(Integer.parseInt(nodes.get(i)));
        }
    }
    int[] solution = new int[sol.size()];
    for(int i = 0; i < sol.size(); i++){
        solution[i] = sol.get(i);
    }
    return solution;
}
*/

/*

int treeBottom(String tree) {
    int count = 0;
    int highest = 0;
    String[] treeList = tree.split(" ");
    List<String> nodes = new ArrayList<>();
    for(String c : treeList){
        for(char d : c.toCharArray()){
            if(d == '('){
                count++;
            }
            if(d == ')'){
                count--;
            }
        }
        String newS = c.replace("(", "");
        newS = newS.replace(")", "");
        newS = newS.replace(" ", "");
        if(newS.length() > 0){
            nodes.add(newS);
            nodes.add("" + count);
            if(count > highest){
                highest = count;
            }
        }
    }
    List<Integer> sol = new ArrayList<>();
    for(int i = 0; i < nodes.size(); i+=2){
        int countN = Integer.parseInt(nodes.get(i+1));
        if(countN == highest){
            sol.add(Integer.parseInt(nodes.get(i)));
        }
    }
    int sum = 0;
    for(int i : sol){
        sum += i;
    }
    return sum;
}

*/



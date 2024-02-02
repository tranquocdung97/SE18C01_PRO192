/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_CodeLearn;


int checksumPart1(long barcode) {
    String s = Long.toString(barcode);
    int sum = 0;
    int x;
    if (s.length() % 2 == 0) {
        x = 1;
    } else {
        x = 3;
    }
    for (char c : s.toCharArray()) {
        sum += Character.getNumericValue(c) * x;
        x = 4 - x;
    }
    if (sum % 10 == 0) {
        return 0;
    } else {
        return 10 - sum % 10;
    }
}


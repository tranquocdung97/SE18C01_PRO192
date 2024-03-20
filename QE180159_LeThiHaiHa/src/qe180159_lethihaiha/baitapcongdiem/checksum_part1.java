package baitapcongdiem;

package qe180159_lethihaiha.baitapcongdiem;

/**
 *
 * @author admin
 */
public static int checksumPart1(long barcode) {
        String gtin = String.valueOf(barcode);
        int sum = 0;
        if (gtin.length()%2== 0{
            sum += i  ? digit * 3 : digit;
}
        else  {
            sum += i ? digit * 1 : digit;
        }
        int checkDigit = (10 - (sum % 10)) % 10;
        return checkDigit;
    }

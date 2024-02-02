/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_CodeLearn;

 String clockRadian(String time) {
     //Split hours and minute to 2 strings to find each dgree
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        if (hours == 0 && minutes == 0) {
        return "pi"; // handle 00:00
    }
    //find dgreee of minute and hour
        double hourAngle = (hours % 12 + minutes / 60.0) * 2 * Math.PI / 12;
        double minuteAngle = minutes * 2 * Math.PI / 60;
        //find dgree of minute and hour then hanlde it on [0,2pi] (beacuase a clock have 2pi)
        double angleDifference = Math.abs(hourAngle - minuteAngle);
        if (angleDifference < 0.000001) {
            angleDifference = 0;
        } else if (angleDifference > Math.PI - 0.00001) {
            angleDifference = 2 * Math.PI - angleDifference;
        }
        angleDifference = angleDifference % (2 * Math.PI);
        int numerator = (int) Math.round(angleDifference * 360 / Math.PI);
        int denominator = 360;
        //change dgree to number, by the function gcd to find number !=1
        int gcd = gcd(numerator, denominator);
        if (gcd != 1) { 
            numerator /= gcd;
            denominator /= gcd;
        }

    //handle case 
    if (numerator == 1 && denominator == 2) {
    return "pi/2";
    } 
    //hanlde case 
    else if (numerator == denominator) {
    return "pi";
    }
    //return value of case of special
     else if (numerator == 1) {
    return "1pi/" + denominator;
    } else {
    return numerator + "pi/" + denominator;
    }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



package com.company;

public class test {
    public static void main(String[] args) {
        int odnakovi = -1;
        for (int first_n = 0; first_n <= 9; first_n++) {
            for (int second_n = 0; second_n <= 9; second_n++) {
                for (int third_n = 0; third_n <= 9; third_n++) {
                    for (int fourth_n = 0; fourth_n <= 9; fourth_n++) {
                        for (int fifth_n = 0; fifth_n <= 9; fifth_n++) {
                            for (int sixth_n = 0; sixth_n <= 9; sixth_n++) {
                                if (first_n + second_n + third_n == fourth_n + fifth_n + sixth_n) {
                                    odnakovi++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Однакові " + odnakovi);
    }

}


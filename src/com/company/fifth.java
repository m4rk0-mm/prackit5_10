package com.company;

public class fifth {
    public static void main(String[] args) {
        int odnakovi = 0;
        for (int firstn = 0; firstn <= 2; firstn++) {
            //String str1 = Integer.toString(n);    
            for (int secondn = 0; secondn <= 9; secondn++) {
                //String str2 = Integer.toString(g);
                for(int thirdn = 0; thirdn < 6; thirdn++ ){
                    //String str3 = Integer.toString(t);
                    for(int fourthn = 0; fourthn <=9; fourthn++){
                        //String str4 = Integer.toString(u);
                        if(firstn == 2 && secondn <= 3){
                            continue;
                        }
                        if((firstn == thirdn && secondn == fourthn)||(firstn == fourthn && secondn == thirdn)){
                            odnakovi++;
                        }
                    }
                }
            }
        }System.out.println("Однакові " + odnakovi);
    }
}


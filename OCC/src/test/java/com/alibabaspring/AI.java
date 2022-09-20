package com.alibabaspring;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AI {
    @Test
   public void d() {
      String[]  Strs= new String[]{"flower", "flow", "flight"};
        if (Strs.length == 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < Strs.length-1; i++) {
                if (Strs[i].length() > Strs[i + 1].length()) {
                    String larger = Strs[i];
                    System.out.println(larger);

                    for (String s:Strs) {

                        if (!larger.startsWith(s)) {
                            s=s.substring(0,Strs.length-1);
                            System.out.println(s);
                        }
                    }


                } else {
                    continue;
                }
                //


            }

        }
    }
}

package jp.smilecode.lomboksample;

import java.util.ArrayList;
import lombok.val;

public class ValSample {

    public void valTest() {
        val list = new ArrayList<String>();
        list.add("test");
        list.add("hoge");
        
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
    
}

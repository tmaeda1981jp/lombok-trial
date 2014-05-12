package jp.smilecode.lomboksample;

import lombok.Getter;
import lombok.Setter;

public class GetterSetterSample {

    @Getter
    @Setter
    private String name;
    
    @Getter
    @Setter
    private int age;

    public GetterSetterSample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
}

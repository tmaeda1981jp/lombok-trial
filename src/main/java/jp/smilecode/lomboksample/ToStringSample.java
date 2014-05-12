package jp.smilecode.lomboksample;

import lombok.ToString;

@ToString(exclude = "id")
public class ToStringSample {

    private int id;
    private String name;
    private int age;
}

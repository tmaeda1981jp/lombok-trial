package jp.smilecode.lomboksample;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude={"id"})
public class EqualsAndHashCodeExample {

    private int id;
    private String name;
    private String mailAddress;

    public EqualsAndHashCodeExample(int id, String name, String mailAddress) {
        this.id = id;
        this.name = name;
        this.mailAddress = mailAddress;
    }
}

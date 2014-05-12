package jp.smilecode.lomboksample;

public class Main {

    public static void main(String[] args) {
        ToStringSample sample = new ToStringSample();
        System.out.println(sample.toString());
        
        ValSample valSample = new ValSample();
        valSample.valTest();
        
        GetterSetterSample gsSample = new GetterSetterSample("Takashi", 33);
        System.out.println(gsSample.getName());
        System.out.println(gsSample.getAge());
    }
}

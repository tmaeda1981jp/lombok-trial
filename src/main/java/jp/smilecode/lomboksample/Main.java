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
        
        AllArgsConstructorSample allargs = new AllArgsConstructorSample(1, "Takashi", 33);
        System.out.println(allargs.toString());
        
        DataSample dataSample = new DataSample();
        dataSample.setFirstName("Takashi");
        dataSample.setLastName("Maeda");
        System.out.println(dataSample.getFirstName() + dataSample.getLastName());

        EqualsAndHashCodeExample eqSample1 = new EqualsAndHashCodeExample(1, "abc", "abc@example.com");
        EqualsAndHashCodeExample eqSample2 = new EqualsAndHashCodeExample(2, "def", "def@example.com");
        EqualsAndHashCodeExample eqSample3 = new EqualsAndHashCodeExample(3, "abc", "abc@example.com");
        System.out.println(eqSample1.equals(eqSample2)); // false
        System.out.println(eqSample1.equals(eqSample3)); // true
        
        NonNullSample nonnull = new NonNullSample();
        nonnull.setName(null); // ぬるぽ
    }
}

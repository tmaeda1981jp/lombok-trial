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
        
        NonNullSample nonnull = new NonNullSample();
        nonnull.setName(null); // nullpointer
        

    }
}

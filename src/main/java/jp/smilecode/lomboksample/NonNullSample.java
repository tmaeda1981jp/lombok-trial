package jp.smilecode.lomboksample;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class NonNullSample {

    @NonNull @Setter @Getter
    private String name;
}

package com.BirdSanctuary;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String name();
    String date();
    String purpose();
}

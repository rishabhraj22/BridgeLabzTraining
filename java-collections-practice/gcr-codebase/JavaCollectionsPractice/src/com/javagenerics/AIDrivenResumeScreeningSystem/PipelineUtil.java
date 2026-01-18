package com.javagenerics.AIDrivenResumeScreeningSystem;
import java.util.List;

public class PipelineUtil {

    public static void processPipeline(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role);
        }
    }
}

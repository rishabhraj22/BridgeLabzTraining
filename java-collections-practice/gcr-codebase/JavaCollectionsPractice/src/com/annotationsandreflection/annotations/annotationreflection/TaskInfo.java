package com.annotationsandreflection.annotations.annotationreflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    String priority();
    String assignedTo();
}

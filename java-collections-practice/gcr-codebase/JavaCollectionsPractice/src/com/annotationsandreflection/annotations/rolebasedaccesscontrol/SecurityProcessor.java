package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class SecurityProcessor {

    public static void execute(Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (!roleAllowed.value().equals(UserContext.getRole())) {
                System.out.println("Access Denied!");
                return;
            }
        }

        method.invoke(obj);
    }
}

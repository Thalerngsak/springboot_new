package com.linksinnovation.springboot.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Porjai on 8/8/2558.
 */
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartWithConstraintValidator.class)
public @interface StartWith {

    public String value() default "";

    public String message() default "String must start with!!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}

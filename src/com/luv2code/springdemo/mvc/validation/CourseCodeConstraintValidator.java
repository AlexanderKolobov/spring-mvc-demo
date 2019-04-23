package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>
{

    private String coursePrefix;

    @Override
    public void initialize( CourseCode constraint )
    {
        coursePrefix = constraint.value();
    }

    public boolean isValid( String theCode, ConstraintValidatorContext context )
    {

        boolean result;
        if( theCode != null )
        {
            result = theCode.startsWith( coursePrefix );
        }
        else
        {
            return true;
        }

        return result;
    }
}

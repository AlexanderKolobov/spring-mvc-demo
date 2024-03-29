package com.luv2code.springdemo.mvc.model;

import com.luv2code.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer
{
    private String firstName;

    @NotNull( message = "is required" )
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull( message = "is required" )
    @Min( value = 1, message = "must be greater then or equal to one")
    @Max( value = 10, message = "must be less then or equal to ten")
    private Integer freePasses;

    @Pattern( regexp = "^[a-zA-Z0-9]{5}", message = "only 5 digits/chars")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public Integer getFreePasses()
    {
        return freePasses;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode( String postalCode )
    {
        this.postalCode = postalCode;
    }

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode( String courseCode )
    {
        this.courseCode = courseCode;
    }

    public void setFreePasses( Integer freePasses )
    {
        this.freePasses = freePasses;
    }
}

package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer
{
    private String firstName;

    @NotNull( message = "is required" )
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min( value = 1, message = "must be greater then or equal to one")
    @Max( value = 10, message = "must be less then or equal to ten")
    private Integer freePasses;

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

    public void setFreePasses( Integer freePasses )
    {
        this.freePasses = freePasses;
    }
}

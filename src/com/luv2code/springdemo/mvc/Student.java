package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student
{
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
    private String hat;

    private LinkedHashMap<String, String > countryOptions;

    public Student()
    {
        countryOptions = new LinkedHashMap<>(  );

        countryOptions.put( "IN", "India" );
        countryOptions.put( "UK", "Ukraine" );
        countryOptions.put( "US", "USA" );
        countryOptions.put( "PL", "Poland" );
        countryOptions.put( "BR", "Brazil" );
    }

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

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions()
    {
        return countryOptions;
    }

    public String getHat()
    {
        return hat;
    }

    public void setHat( String hat )
    {
        this.hat = hat;
    }

    public String getFavoriteLanguage()
    {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage( String favoriteLanguage )
    {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystems()
    {
        return operatingSystems;
    }

    public void setOperatingSystems( String[] operatingSystems )
    {
        this.operatingSystems = operatingSystems;
    }
}

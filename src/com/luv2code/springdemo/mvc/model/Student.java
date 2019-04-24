package com.luv2code.springdemo.mvc.model;

import javax.persistence.*;
import java.util.LinkedHashMap;

@Entity
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Transient
    private String country;

    @Transient
    private String favoriteLanguage;

    @Transient
    private String[] operatingSystems;

    @Transient
    private String hat;

    @Transient
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

    public Student( String firstName, String lastName, String email )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Student{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

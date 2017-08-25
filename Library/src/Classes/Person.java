/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jncor
 */
public class Person
{
    private String firstName;
    private String lastName;
    
    Person()
    {
        
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String personFirstName) { firstName = personFirstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String personLastName) { lastName = personLastName; }
}

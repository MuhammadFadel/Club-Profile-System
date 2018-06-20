/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprofilesystem;

import java.io.Serializable;

/**
 *
 * @author Muhammad M Fadel
 */
public class Time implements Serializable{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    // set a new time value using universal time; throw an
    // exception if the hour, minute or second is invalid
public void setTime( int h, int m, int s ){
    // validate hour, minute and second
    if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) &&
        ( s >= 0 && s < 60 ) )
    {
        hour = h;
        minute = m;
        second = s;
    }
    else
        throw new IllegalArgumentException("hour, minute and/or second was out of range" );
}
public String toUniversalString(){
    return String.format( "%02d:%02d:%02d", hour, minute, second );
}
@Override
public String toString(){
return String.format( "%d:%02d:%02d %s",
    ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
    minute, second, ( hour < 12 ? "AM" : "PM" ) );
}
}
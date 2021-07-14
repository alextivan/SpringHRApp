package com.company;

//checked exceptions
//public class OutOfRangeException extends Exception {
//}

//RuntimeException = unchecked exceptions
public class OutOfRangeException extends Exception{

    OutOfRangeException(){
        super("The number you entered is out of range!");
    }

}
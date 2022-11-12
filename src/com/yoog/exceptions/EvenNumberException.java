package com.yoog.exceptions;

public class EvenNumberException extends Throwable {
    @Override
    public String getMessage(){
        return "You cannot input an even number.";
    }

}

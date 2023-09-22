package com.example;

import com.example.Calculator;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 7));
    }
}

<h1 align="center">Day 13</h1>

1. Binary Number System

    Definition - In computer science, a binary number system is a system of numbers in which each digit is 0 or 1. 


2. Bit Manipulation

    Definition - Bit manipulation is a method of performing calculations on binary numbers.

    
3. Bitwise Operators

    Definition - Bitwise operators are used to manipulate bits of numbers.
    
    Operators:
    
        & - AND
        | - OR
        ^ - XOR
        ~ - NOT ( Comlement )
        << - left shift
        >> - right shift


    a) Binary AND ( & ) -
        
        0 & 0 = 0
        0 & 1 = 0
        1 & 0 = 0
        1 & 1 = 1
        
    eg - 5 & 6 :
            
        5 = 101
        6 = 110
            
        101 & 110 = 100
        100 = 4 (Decimal)


    b) Binary OR ( | ) -
        
        0 | 0 = 0
        0 | 1 = 1
        1 | 0 = 1
        1 | 1 = 1
        
    eg - 5 | 6 :
            
        5 = 101
        6 = 110
            
        101 | 110 = 111
        111 = 7 (Decimal)


    c) Binary XOR ( ^ ) -
        
        0 ^ 0 = 0
        0 ^ 1 = 1
        1 ^ 0 = 1
        1 ^ 1 = 0
        
    eg - 5 ^ 6 :
            
        5 = 101
        6 = 110
            
        101 ^ 110 = 011
        011 = 3 (Decimal)


    d) Binary NOT ( ~ ) -
        
        ~0 = 1
        ~1 = 0

    eg - ~5 :
        
        5 = 101

        ~101 = 010
        010 = -6 (Decimal) // Expected result 2
            
        Explanation -
            5 = 00000101
            LSB - 1
            MSB - 0 ( Number is positive )

            ~5 = 11111010
            LSB - 0
            MSB - 1 ( Number is negative )
                
            1's complement of ( 11111010 ) = 00000101
            2's complement = 00000101 + 1 = 00000110 = -6


    e) Binary left shift ( << ) - 
    
    Push all bits to left side by given position
            
        5 << 2 = 20
        explanation : 
            5 = 00000101
            5 << 2 = 00010100

    Note : `a << b = a * ( 2 ^ b )`


    f) Binary right shift ( >> ) - 
    
    Push all bits to right side by given position
            
        5 >> 2 = 1
        explanation : 
            5 = 00000101
            5 >> 2 = 00000001

    Note : `a >> b = a / ( 2 ^ b )`

<h1 align="center">Day 2</h1>

- `Operators` in Java

1. Arithmetic Operators
    a) Unary Operators
        symbols: 
            +, -, ++(pre-increment & post-increment), --(pre-decrement & post-decrement)
        examples :
            +1, -1
            ++1, post-increment
            1++, pre-increment
            --1, post-decrement
            1--, pre-decrement


    b) Binary Operators
        symbols:
            +, -, *, /, %(modulus)
        examples : 
            1 + 2 = 3
            1 - 2 = -1
            1 * 2 = 2
            1 / 2 = 0
            1 % 2 = 1


    c) Ternary Operator
        symbols:
            ?, :
        examples :
            (condition) ? statement1 : statement2



2. Relational Operators
    symbols:
        ==, !=, >, <, >=, <=
    examples :
        1 == 2
        1 != 2
        1 > 2
        1 < 2
        1 >= 2
        1 <= 2



3. Logical Operators
    symbols:
        &&, ||, !
    examples :
        1 > 2 && 2 > 3      --> false
        1 > 2 || 2 > 3      --> true
        !(1 > 2 && 2 > 3)   --> true

            a) truth table of && operator
                true && true --> true
                true && false --> false
                false && true --> false
                false && false --> false

            b) truth table of || operator
                true || true --> true
                true || false --> true
                false || true --> true
                false || false --> false

            c) truth table of ! operator
                !true --> false
                !false --> true



4. Assignment Operators
    symbols:
        =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=
    examples :
        1 = 2
        1 += 2
        1 -= 2
        1 *= 2
        1 /= 2
        1 %= 2

        Bitwise Assignment Operators
        1 <<= 2
        1 >>= 2
        1 &= 2
        1 ^= 2
        1 |= 2


5. Bitwise Operators
    symbols:
        &, |, ^, ~, <<, >>
    examples :
        1 & 2
        1 | 2
        1 ^ 2
        ~1
        1 << 2
        1 >> 2


    // Note : Bitwise operator will be discussed in bit manipulation session.
># Literals

## Integer Literals

Integers are probably the most commonly used type in the typical program. Any whole number value is an integer literal. Examples are 1, 2, 3, and 42. These are all decimal values, meaning they are describing a base 10 number. Two other bases that can be used in integer literals are octal (base eight) and hexadecimal (base 16).

Octal values are denoted in Java by a leading zero. Normal decimal numbers cannot have a leading zero. Thus, the seemingly valid value 09 will produce an error from the compiler, since 9 is outside of octal’s 0 to 7 range.

A more common base for numbers used by programmers is hexadecimal, which matches cleanly with modulo 8 word sizes, such as 8, 16, 32, and 64 bits. You signify a hexadecimal constant with a leading zero-x, (0x or 0X). The range of a hexadecimal digit is0 to 15, so A through F (or a through f ) are substituted for 10 through 15.

    int x = 0xF

Beginning with JDK 7, you can also specify integer literals using binary. To do so, prefix the value with 0b or 0B. For example, this specifies the decimal value 10 using a binary literal:

    int x = 0b010101


## Floating-Point Literals

They can be expressed in either standard or scientific notation. Standard notation consists of a whole number component followed by a decimal point followed by a fractional component.

Scientific notation uses a standard-notation, floating-point number plus a suffix that specifies a power of 10 by which the number is to be multiplied. The exponent is indicated by an E or e followed by a decimal number, which can be positive or negative. Examples include 6.022E23, 314159E–05, and 2e+100.

Floating-point literals in Java default to double precision. To specify a float literal, you must append an F or f to the constant. You can also explicitly specify a double literal by appending a D or d. Doing so is, of course, redundant. The default double type consumes 64 bits of storage, while the smaller float type requires only 32 bits.

Hexadecimal floating-point literals are also supported, but they are rarely used. They must be in a form similar to scientific notation, but a P or p, rather than an E or e, is used. For example, 0x12.2P2 is a valid floating-point literal. The value following the P, called the binary exponent, indicates the power-of-two by which the number is multiplied. Therefore, 0x12.2P2 represents 72.5.

### Boolean Literals

Boolean literals are simple. There are only two logical values that a boolean value can have, true and false. The values of true and false do not convert into any numerical representation. The true literal in Java does not equal 1, nor does the false literal equal 0. In Java, the Boolean literals can only be assigned to variables declared as boolean or used in expressions with Boolean operators.

### Characters Literals

Characters in Java are indices into the Unicode character set. They are 16-bit values that can be converted into integers and manipulated with the integer operators, such as the addition and subtraction operators. A literal character is represented inside a pair of single quotes. All of the visible ASCII characters can be directly entered inside the quotes, such as '_a_', '_z_', and '_@_'. For characters that are impossible to enter directly, there are several escape sequences that allow you to enter the character you need, such as _' \\' '_ for the single-quote character itself and _'\n'_ for the newline character. There is also a mechanism for directly entering the value of a character in octal or hexadecimal. For octal notation, use the backslash followed by the three-digit number. For example, _' \141'_ is the letter _'a'_. For hexadecimal, you enter a backslash-u (\u), then exactly four hexadecimal digits. For example, _'\u0061'_ is the ISO-Latin-1 _'a'_ because the top byte is zero. _' \ua432 '_ is a Japanese Katakana character.

|Escape Sequence|Description|
|---|---|
|`\ddd`|Octal character (ddd)|
|`\uxxxx`|Hexadecimal Unicode character (xxxx)|
|`\'`|Single quote|
|`\"`|Double quote|
|`\\`|Backslash|
|`\r`|Carriage return|
|`\n`|New line (also known as line feed)|
|`\f`|Form feed|
|`\t`|Tab|
|`\b`| Backspace|


### String Literals

String literals in Java are specified like they are in most other languages—by enclosing a sequence of characters between a pair of double quotes. Examples of string literals are

    "Hello World"
    "two\nlines"
    " \"This is in quotes\""

The escape sequences and octal/hexadecimal notations that were defined for character literals work the same way inside of string literals. One important thing to note about Java strings is that they must begin and end on the same line. There is no line-continuation escape sequence as there is in some other languages.
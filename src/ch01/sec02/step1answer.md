Have a look at the NumberDemo program. How many different kinds of number literals do you see? Which ones do you expect to use in your work?

There are eight kinds:

* Decimal integers (-127)
* Decimal long integers (4000000000L)
* Hexadecimal integers (0xCAFEBABE)
* Binary integers (0b1001)
* Octal integers (011)
* Decimal double-precision floating-point numbers (3.14 or 3.14D)
* Decimal single-precision floating-point numbers (3.14F)
* Hexadecimal floating-point numbers (0x1.0p-3)

Prefixes are 0x (hex), 0b (binary), 0 (octal). Suffixes are L (long), D (double), and F (float). 

Integers, long integers, and decimal double-precision floating-point literals are commonly used. Few programmers need single-precision floating-point values. If you work with bits and bytes, you may need hexadecimal or binary literals. Stay away from octal!

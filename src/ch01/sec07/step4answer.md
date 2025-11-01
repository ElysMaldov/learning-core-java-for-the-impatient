* How can you tell when a `switch` is a statement and when it is an expression?

  It depends on the position of the `switch`. If it is assigned to a variable or passed as a method parameter, or combined with an operator inside an expression, then it is in "expression position". If it just sits there, not being assigned, passed, or combined, it is in "statement position". 

* How can you tell when it uses fallthrough?

  When the cases end in colon. With no-fallthrough, cases end in ->.

* When do you need a `yield`? 

  1. Only in expressions. 
  2. Always with fallthrough expressions
  3. Only in { ... } with no-fallthrough expressions
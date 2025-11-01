`location.equals("World")` is `true` because `location` and `"World"` are strings with the same characters.

`location == "World"` is `false` because `location` is a different object than the literal `"World"`. It was constructed in line 35 by the `substring` method.

`location.equalsIgnoreCase("world")` is `true` because `"World"` and `"world"` are the same string if you ignore the distinction between uppercase and lowercase letters. 

`System.out.println("word".compareTo("world"));` is -8. All that matters is that it is a negative number, since in the dictionary, "word" comes before "world". The first three letters are the same, and then 'd' comes before 'l'. In fact, -8 is the difference between the character values `'d' - 'l'`. 

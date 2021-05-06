# HashMapDictionary
This project creates a HashMap. The HashTable class actually defines the HashMap and the HashTableDriver class tests the HashTable class.

Imperfections of my code:
- Though it is very, very rare, key collisions could occur if the concatenations of the the Unicode values of the chars in a key modded by prime number 601 match that of another key.
- The key strings cannot be too big because of the limitations of the Integer.parseInt() static method, which cannot process extremely large numbers.

Challenge One

Which is a better hash function:
x % n where n is a large number with several factors
x % n where n is a large prime number.
Prove your answer with a simple example.
The function where n is a large prime is the best function because it helps spread out the values and reduces collisions.

Challenge Two

Is char values summed % 599 a good hash function for strings? Why or why not?
It isn't because any word that has char values summed to a certain number will point to the same value even if it's not the real key.

Challenge Three

Take a look at Java's HashMap class and how it produces hashed values. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

Yes, I did this.

# Reflection by Sarah Veney

This lab required me to write a file called `ManipulateDNA`. Overall, I had a
good experience with the Java codes used in this program. I liked getting to
generate the random variables and setting up a new random generator each time.
I also, despite using them so much on the last lab, learned a lot more about
substrings. I truly enjoyed the act of ripping up a string and adding/removing
a character by making a new string made of various substrings from before,
which I describe more in the next paragraph. One of the most exciting things I
learned was that you do not need to create a new string to use the toUpperCase
command, you can simply stick it on the end of the string you want to
capatalize when you put the string in the printline statement, which fascinated
me. At the beginning of using the replace command, I had difficulties because I
did not know that the apostrophes were required around the letters, but
thankfully I was able to fix that mistake. I also enjoyed discovering and using
the alphabet command to select a random character from a given set, which was
an exciting way to make sure I got a random A, C, T, or G. 

To manipulate the DNA, I first calculated the complement by creating a series
of manipulations, first duplicating the original dna string entered and then
changing each of the letters in an order so that once I created a string with
just the a's changed I did not change them back. It involved a total of four
manipulations to calculate the complement. Then I generated a random letter
(from the A, C, T, G) and inserted it into the second position of the string,
which I accomplished by making a substring of positions 0 and 1 and then
original position 2 to the end, and then I made a new string of substring(0 and
1) + the randomly generated letter + substring(2 to end in original sequence).
I used similar methods to accomplish steps 4 and 5. For step 4, I randomly
generated a position and made two substrings, one from 0 to that position and
one from (the position + 1) to the end, and made a string that added the two
and thus the random position was never included and "deleted" it from the
sequence. In step 5, I generated a random position and a random character and
made a substring from 0 to the random position and a substring from the
position + 1 to the end, then made a string that added the first substring, the
random character, and the second substring to form the answer. 

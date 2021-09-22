/*
Regular Expressions :-
- java.util.regex package for pattern matching with regular expressions.
- special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. 
- They can be used to search, edit, or manipulate text and data.

Pattern Class :-
- The Pattern class provides no public constructors. 
- To create a pattern, you must first invoke one of its public static compile() methods, which will then return a Pattern object. 
- These methods accept a regular expression as the first argument.

Matcher Class :− 
- A Matcher object is the engine that interprets the pattern and performs match operations against an input string.
- Matcher defines no public constructors. 
- You obtain a Matcher object by invoking the matcher() method on a Pattern object.

PatternSyntaxException :− 
- A PatternSyntaxException object is an unchecked exception that indicates a syntax error in a regular expression pattern.

CapturingGroup :-
- Capturing groups are a way to treat multiple characters as a single unit
To find out how many groups are present in the expression, call the groupCount method on a matcher object.


Common use Symbols :-
^	    Matches the beginning of the line.
$	    Matches the end of the line.
.	    Matches any single character except newline. Using m option allows it to match the newline as well.
[...]	Matches any single character in brackets.
[^...]	Matches any single character not in brackets.
\A	    Beginning of the entire string.
\z	    End of the entire string.
a| b	Matches either a or b.
\W	    Matches the nonword characters.
\w	    Matches the word characters.
\s	    Matches the whitespace. Equivalent to [\t\n\r\f].
\S	    Matches the nonwhitespace.
\d	    Matches the digits. Equivalent to [0-9].
\D	    Matches the nondigits.


Methods :-
1)int Start :- Returns the start index of the previous match.
2)int End   :- Returns the offset after the last character matched
3)boolean lookingAt :- match the input sequence, starting at the beginning of the region, against the pattern
4)  "     find      :- Attempts to find the next subsequence of the input sequence that matches the pattern
5)  "     matches() :- Attempts to match the entire region against the pattern

Replacements Methods :-
1)Matcher appendReplacement :- Implements a non-terminal append-and-replace step
2)StringBuffer appendTail   :- terminal
3)String replaceAll         :- Replaces every subsequence of the input sequence
4)String replaceFirst       :- Replaces first subsequence of the input sequence
5)String quoteReplacement :- Return a literal of replacement string or specified string


PatternSyntaxException Class Methods :-
1)getDescription :- Returns a description error message
2)getIndex       :- Returns error index
3)getPattern     :- Retrieves the erroneous regular expression pattern.
4)getMessage     :- Returns a multi-line string containing error

*/
#reversing list.

 mreverse([],Z,Z).

 mreverse([H|T],Z,Acc) :- mreverse(T,Z,[H|Acc]). 
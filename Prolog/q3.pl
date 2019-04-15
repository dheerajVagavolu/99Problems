#ith element of a list.

ithele([H|_],0,H) :-
    !.
ithele([_|T],N,H) :-
    N > 0, %add for loop prevention
    N1 is N-1,
    ithele(T,N1,H).
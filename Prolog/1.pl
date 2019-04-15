list_member(X,[X|_]).
list_member(X,[_|Tail]) :- list_member(X,Tail).
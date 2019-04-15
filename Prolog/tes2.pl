list_member(X,[X]).
list_member(X,[_|Tail]) :- list_member(X,Tail).
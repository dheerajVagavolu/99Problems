#Last element of a list.

pop_last(X,[X]).
pop_last(X,[_|List]) :- pop_last(X,List).
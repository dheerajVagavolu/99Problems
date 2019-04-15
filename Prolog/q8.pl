#Eliminate consecutive duplicates of list elements.

eleminate([],[]).
eleminate([X],[X]).
eleminate([X,X|Xs],Zs) :- eleminate([X|Xs],Zs).
eleminate([X,Y|Ys],[X|Zs]) :- X \= Y, eleminate([Y|Ys],Zs).


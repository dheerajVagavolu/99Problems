#Flatten a nested list structure.

mflatten(X,[X]) :- \+ is_list(X).
mflatten([],[]).
mflatten([X|Xs],Zs) :- my_flatten(X,Y), my_flatten(Xs,Ys), append(Y,Ys,Zs).
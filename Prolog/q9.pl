#save consecutive elements into sublists.

save([],[]).
save([X|Xs],[Z|Zs]) :- store(X,Xs,Ys,Z), save(Ys,Zs).

store(X,[],[],[X]).
store(X,[Y|Ys],[Y|Ys],[X]) :- X \= Y.
store(X,[X|Xs],Ys,[X|Zs]) :- store(X,Xs,Ys,Zs).
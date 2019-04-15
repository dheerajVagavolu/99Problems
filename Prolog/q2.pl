#Last but one element in a list.

lastbut_on1e(X,[X,_]).
lastbut_on1e(X,[_|T]) :- lastbut_on1e(X,T).
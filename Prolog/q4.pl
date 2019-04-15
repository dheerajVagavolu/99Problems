#length of a list.

len([],0).
len([_|List],X) :- len(List,N), X is N + 1. 
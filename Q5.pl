
python(arun, pass).
python(bala, pass).
python(charan, pass).
python(divya, fail).

dsa(arun, pass).
dsa(bala, fail).
dsa(charan, pass).
dsa(divya, pass).

eligible(X) :-
    python(X, pass),
    dsa(X, pass).


parking(s1, car, available).
parking(s2, bike, occupied).
parking(s3, car, available).
parking(s4, bike, available).
parking(s5, car, occupied).

available_slot(Slot, Type) :-
    parking(Slot, Type, available).

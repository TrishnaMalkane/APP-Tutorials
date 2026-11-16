
from sympy import *

t = symbols('t')

s = t**3 - 6*t**2 + 9*t + 5

velocity = diff(s, t)
acceleration = diff(velocity, t)

rest = solve(velocity, t)

displacement = integrate(s, (t, 0, 5))

print("Displacement Function:", s)
print("Velocity:", velocity)
print("Acceleration:", acceleration)
print("Time at Rest:", rest)
print("Definite Integral from 0 to 5:", displacement)

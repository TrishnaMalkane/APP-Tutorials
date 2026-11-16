
from sympy import *

x = symbols('x')

expr = (x + 2) * (x + 3)

print("Original Expression:", expr)
print("Expanded:", expand(expr))
print("Factorized:", factor(expand(expr)))

expr2 = (x**2 - 4) / (x - 2)
print("Simplified:", simplify(expr2))

equation = x**2 - 5*x + 6
print("Quadratic Solutions:", solve(equation, x))

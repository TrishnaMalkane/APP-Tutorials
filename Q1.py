
from functools import reduce

marks = [45, 67, 89, 32, 95, 50]

passed = list(filter(lambda x: x >= 50, marks))
grace = list(map(lambda x: min(x + 5, 100), marks))
total = reduce(lambda a, b: a + b, grace)

print("Original Marks:", marks)
print("Passed Students:", passed)
print("Marks After Grace:", grace)
print("Total Marks:", total)

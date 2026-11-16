
from functools import reduce

salaries = [25000, 45000, 30000, 60000, 35000]

eligible = list(filter(lambda x: x < 40000, salaries))

updated = list(map(
    lambda x: x * 1.10 if x < 40000 else x,
    salaries
))

total = reduce(lambda a, b: a + b, updated)

print("Original Salaries:", salaries)
print("Eligible Salaries:", eligible)
print("Updated Salaries:", updated)
print("Total Salary Expenditure:", total)

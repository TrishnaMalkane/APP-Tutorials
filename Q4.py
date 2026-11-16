
from functools import reduce

units = [8, 12, 15, 6, 20, 9, 11]

high = list(filter(lambda x: x > 10, units))
cost = list(map(lambda x: x * 6, units))
total = reduce(lambda a, b: a + b, units)


def bill(units):
    return sum(units) * 6


print("Daily Consumption:", units)
print("Days Above 10 Units:", high)
print("Daily Cost:", cost)
print("Total Units:", total)
print("Total Bill: Rs.", bill(units))


prices = [500, 1200, 2500, 800, 1500]


def discount(price):
    if price > 1000:
        return price * 0.8
    return price


eligible = list(filter(lambda x: x > 1000, prices))
updated = list(map(discount, prices))

print("Original Prices:", prices)
print("Eligible Products:", eligible)
print("Prices After Discount:", updated)
print("Original List:", prices)

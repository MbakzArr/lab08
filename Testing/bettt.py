from collections import Counter
from math import gcd
from functools import reduce
import ast

# Function to determine if books can be organized into valid sets
def can_organize_books(shelf):
    count = Counter(shelf)  # Count occurrences of each book
    freqs = list(count.values())  # Get a list of frequency counts

    common_gcd = reduce(gcd, freqs)  # Find the greatest common divisor of the frequencies

    return "YES" if common_gcd > 1 else "NO"  # If GCD > 1, books can be grouped into valid sets

# Read input from the user
shelf = ast.literal_eval(input("Enter the bookshelf array in list format (e.g., [5, 5, 3, 3, 2, 2]): "))
print(can_organize_books(shelf))  # Print the result

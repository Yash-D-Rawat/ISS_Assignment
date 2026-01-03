print("Python variables dont have a type until they are assigned a value.")
age = 21
name = "Yash"
money = 60000.00

print("Age:", age)
print("Name:", name)   
print("Money:", money)

print("You can reassign variables to different data types.")
age = "Twenty One"
print("Age:", age)

PI = 3.14159
MAX_USERS = 100

print(PI, MAX_USERS)

print("\n -----Integers------ ")
a = 10
b = -5
print(a+b)
print(type(a))

print("\n -----Booleans------ ")
is_active = True
is_complete = False
print(is_active, is_complete)
print(type(is_active))


print("\n -----Strings------ ")
first_name = "Yash" 
last_name = "Rawat"
full_name = first_name + " " + last_name
print(full_name)
print(type(full_name))
#string methods
print(f"Uppercase: {full_name.upper()}")
print(f"Lowercase: {full_name.lower()}")
print(f"Replace: {full_name.replace("Yash", "John")}")
print(f"Split: {full_name.split(" ")}")
print("Length of full name:", len(full_name))
print("String indexing: ", full_name[0])  
print("String slicing: ", full_name[0:4])
new_string = "Hello, " + full_name + "! This is ISS assignment."
print(new_string.endswith("assignment."))
print(new_string.find("ISS"))
print(new_string.count("is"))
print(new_string.index("Yash"))


print("\n -----Lists------ ")
fruits = ["cherry", "apple", "banana"]
print(fruits)
print(type(fruits))
print("First fruit:", fruits[0])
fruits.append("date")
print("Fruits after append:", fruits)
fruits.pop()
print("Fruits after pop:", fruits)
fruits.insert(1, "blueberry")
print("Fruits after insert:", fruits)
fruits.remove("banana")
print("Fruits after removing banana:", fruits)
print("Number of fruits:", len(fruits))
fruits.sort()
print("Sorted fruits:", fruits)
print("Reversed fruits:", fruits[::-1]) #fruits.reverse() can also be used


print("\n -----Dictionaries------ ")
myself = {
    "name": "Yash Rawat",
    "age": 21,
    "courses": ["DSA", "PYTHON", "JAVA"],
    "company": "ISS-STOXX"
}
print(myself)
print(type(myself))
print("Name:", myself["name"])
print("Courses:", myself["courses"])
print(myself.get("age"))
myself["age"] = 22
print("Updated age:", myself["age"])
myself["location"] = "India"
print("After adding location:", myself)
myself.pop("age")
print("After removing age:", myself)
print("Items in dictionary:", list(myself.items()))
#for loops to iterate through dictionary
for key, value in myself.items():
    print(f"{key}: {value}")

print("\n -----Tuples------ ")
coordinates = (10.0, 20.0)
print(coordinates)
print(type(coordinates))
print("X coordinate:", coordinates[0])
print("Tuples are immutable, so we cannot change their values.")

print("Count of 10.0 in coordinates:", coordinates.count(10.0))
print("Index of 20.0 in coordinates:", coordinates.index(20.0))

print("\n -----Sets------ ")
unique_numbers = {5,4,3,2,1,1,1,"yash",True,2,3,3}
print(unique_numbers)
print(type(unique_numbers))
unique_numbers.add(6)
print("After adding 6:", unique_numbers)
unique_numbers.remove(3)
print("After removing 3:", unique_numbers)
print("Length of set:", len(unique_numbers))
print("Is 4 in unique_numbers?", 4 in unique_numbers)

set1 = {1,2,3,4}
set2 = {3,4,5,6}
print("Union:", set1.union(set2))
print("Intersection:", set1.intersection(set2))
print("Difference (set1 - set2):", set1.difference(set2))
print("Symmetric Difference:", set1.symmetric_difference(set2))

print("\n -----Type Conversion------ ")
a = "10"
b = 5

result = int(a) + b
print(result)
print(type(result))

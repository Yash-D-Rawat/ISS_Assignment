print("Exception Handling in Python")

print("\n -----try/except Block------ ")
def divide_numbers(a, b):
    try:
        result = a / b
        print(f"Result of {a} divided by {b} is: {result}")
    except ZeroDivisionError:
        print("Error: Cannot divide by zero.")
    except TypeError:
        print("Error: Invalid input type. Please provide numbers.")

divide_numbers(10, 2)
divide_numbers(10, 0)
divide_numbers(10, "a")
divide_numbers("x", 2)

print("\n -----try/except/finally Block------ ")
def read_file(file_path):
    try:
        file = open(file_path, 'r')
        content = file.read()
        print("File content:")
        print(content)
    except FileNotFoundError:
        print("Error: File not found.")
    finally:
        try:
            file.close()
            print("File closed.")
        except NameError:
            print("File was never opened, so nothing to close.")

read_file("existing_file.txt")
read_file("non_existing_file.txt")

print("\n -----Raising Exceptions------ ")
def check_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative.")
    elif age < 18:
        print("You are a minor.")
    else:
        print("You are an adult.")

try:
    check_age(20)
    check_age(-5)   
    check_age(15)
except ValueError as ve:
    print("Caught an exception:", ve)
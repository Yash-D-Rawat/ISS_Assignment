print("Functions in Python")
print("\n -----Defining and Calling Functions------ ")

correct_username = "admin"
correct_password = "password123"

def login_user(username, password):
    if username == correct_username and password == correct_password:
        return "Login successful!"
    else:
        return "Invalid username or password."
    

print(login_user("admin", "password123"))
print(login_user("user", "wrongpass"))

print("\n -----Function with Default Parameters------ ")
def count(num=10):
    for i in range(num):
        print("Count:", i)

count()
count(5)

print("\n -----Args and Kwargs------ ")
def sum_all(*args):
    total = 0
    for number in args:
        total += number
    return total

print("Sum:", sum_all(1, 2, 3, 4, 5))

def display_info(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")    

display_info(name="Yash", age=21, company="ISS-STOXX")

print("\n -----Lambda Functions------ ")
square = lambda x: x * x
print("Square of 5:", square(5))


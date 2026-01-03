print("Control Flow Structures in Python")  

print("\n -----if/else Statement------ ")
score = 85
if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")  
elif score >= 70:
    print("Grade: C")
else:
    print("Grade: F")


print("\n -----for Loop------ ")
for i in range(5):
    print("Iteration:", i)

list_of_numbers = [10, 20, 30, 40, 50]
for number in list_of_numbers:
    print("Number:", number)

print("\n -----Nested Loops------ ")
for i in range(1, 4):
    for j in range(1, 4):
        print(f"i: {i}, j: {j}")    


print("\n -----while Loop------ ")
count = 0
while count < 5:
    print("Count is:", count)
    count += 1

print("\n -----break and continue------ ")
for i in range(10):
    if i == 3:
        continue
    if i == 5:
        print("Breaking the loop at i =", i)
        break
    print("i =", i)


print("\n -----pass Statement------ ")
for i in range(3):
    if i == 1:
        pass 
    print(i)

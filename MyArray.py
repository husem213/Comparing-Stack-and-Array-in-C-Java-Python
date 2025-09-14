def exchange_values(first_element, second_element):
    return second_element, first_element

def reversing_array(my_array):
    array_length = len(my_array)
    for i in range(array_length // 2):
        my_array[i], my_array[array_length - i - 1] = exchange_values(my_array[i], my_array[array_length - i - 1])

def print_array_elements(my_array):
    print("\nArray Elements Are:", end=" ")
    for element in my_array:
        print(element, end="\t")
    print()

def main():
    my_array = ["Yellow", "Blue", "Black", "Green", "Purple"]
    print_array_elements(my_array)
    reversing_array(my_array)
    print_array_elements(my_array)
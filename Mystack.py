def read_string():
    input_str = "Hello World"
    print(f"Using predefined input: {input_str}")
    return input_str

def push_letters_to_stack(input_str):
    stack = []
    for c in input_str:
        stack.append(c)
    return stack

def reverse_stack(stack):
    reversed_stack = []
    temp_stack = stack.copy()
    while temp_stack:
        reversed_stack.append(temp_stack.pop())
    return reversed_stack

def stack_to_string(stack):
    result = ''
    temp_stack = stack.copy()
    while temp_stack:
        result += temp_stack.pop()
    return result

def main():
    input_str = read_string()
    st_input = push_letters_to_stack(input_str)
    reversed_str = stack_to_string(reverse_stack(st_input))
    print(f"Reversed: {reversed_str}")

if __name__ == "__main__":
    main()
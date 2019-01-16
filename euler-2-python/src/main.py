

def fibonacci_sequence_generator(max_value):
    current_sequence = []
    for x in range(0, max_value):
        if len(current_sequence) < 2:
            current_sequence.append(x)
        else:
            last_value = current_sequence[len(current_sequence)-1]
            second_to_last_value = current_sequence[len(current_sequence) - 2]
            fibonacci_value = last_value + second_to_last_value
            if fibonacci_value < max_value:
                current_sequence.append(fibonacci_value)
            else:
                break
            print current_sequence
    return current_sequence

def sum_even_value_terms(sequence):
    return sum(num for num in sequence if not num % 2)

def main():
    print "Starting program"
    fibonacci_sequence = fibonacci_sequence_generator(4000000)
    print fibonacci_sequence
    print sum_even_value_terms(fibonacci_sequence)

if __name__ == "__main__": main()
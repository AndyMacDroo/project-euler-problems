
NUMBERS_TO_DIVIDE_BY = [x + 1 for x in range(20)]

def generateNumberSequence():
    return [x + 1 for x in range(300000000) if (divisibleByNumberRange(x + 1))]

def divisibleByNumberRange(number):
    for x in NUMBERS_TO_DIVIDE_BY:
        if number % x != 0:
            return False
    return True

def main():
    print "Starting program"
    print generateNumberSequence()

if __name__ == "__main__": main()


import random
import time

n = int(input('enter a number between 1 and (pick your upper bound): '))
randomNumber = random.randint(1,n)
#now we have the random number based on upper bound
#time for user to guess it
print('the answer is: ', randomNumber)
#print out the answer to cheat
userGuess = int(input('Guess a number between 1 and {} ' .format(n)))


while userGuess != randomNumber:
    if userGuess < randomNumber:
        print('Your guess was too low, try again')
        time.sleep(1)
        userGuess = int(input('Guess a number between 1 and {} ' .format(n)))
    if userGuess > randomNumber:
        print('Your guess was too high, try again')
        time.sleep(1)
        userGuess = int(input('Guess a number between 1 and {} ' .format(n)))

print('You guessed it! Nice.')




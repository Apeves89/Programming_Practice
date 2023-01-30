import random

player_points = 0
computer_points = 0

def get_choices():
    player_choice = input("Enter a choice (rock, paper, scissors: ")
    options = ["rock","paper","scissors"]
    computer_choice = random.choice(options)
    choices = {
        "player": player_choice,
        "computer": computer_choice
        }
    
    return choices


# print(choices)

def check_win(player, computer):
    global player_points
    global computer_points
    # print("You chose " + player + ", computer chose " + computer)
    print(f"You chose {player}, computer chose {computer}.")
    if (player == computer):
        return f"It's a tie! P{player_points} - C{computer_points}"
    elif player == 'rock':
        if computer == 'scissors':
            player_points+=1
            return f"Rock smashes scissors. You win! P{player_points} - C{computer_points}"
        else:
            computer_points+=1
            return f'Paper covers rock. You lose! P{player_points} - C{computer_points}'
    elif player == 'paper':
        if computer == 'rock':
            player_points+=1
            return f"Paper covers rock. You win! P{player_points} - C{computer_points}"
        else:
            computer_points+=1
            return f'Scissors cuts paper. You lose! P{player_points} - C{computer_points}'
    elif player == 'scissors':
        if computer == 'paper':
            player_points+=1
            return f"Scisssors cuts paper. You win! P{player_points} - C{computer_points}"
        else:
            computer_points+=1
            return f'Rock smashes scissors. You lose! P{player_points} - C{computer_points}'
        
    # elif ((player == 'rock' and computer == 'scissors') or
    #       (player == 'paper' and computer == 'rock') or
    #       (player == 'scissors' and computer -- 'paper')):
    #     return "You win!"
    # else:
    #     return "Computer wins"
    
for x in range(0,10):
    choices = get_choices()
    result = check_win(choices["player"],choices["computer"])
    print(result)

# dict = {
#     "name": "beau",
#     "color": "blue"
# }

# food = ["pizza", "carrots", "eggs"]
# dinner = random.choice(food)
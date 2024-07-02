import Language
import random



#Choice_Check will check the users input to make sure they input
#a number between 1 and 5 and not a negative number, special
#character or letter

def choice_Check():
    choice = 0
    while choice <1 or choice >5:
        try:
            choice = int(input("Please choose a menu option: "))
                
            if choice <1 or choice >5: 
                print("Input must be a NUMBER between 1 and 5!")
                choice = int(input("Please choose a menu option: "))
                    
            
        except ValueError as err:
            print(err)
            print("Input must be a NUMBER between 1 and 5!")
    return choice


def J_Hira():
    wrong = 1
    correct = 0
    score = 0
    multi = 1
    difficulty = 1
    while wrong != 4:
        for count in range(wrong):
            question = ""
            answer = ""
            for count in range(difficulty):
                rand1 = random.randrange(0,20)
                rand2 = random.randrange(0,4)
                                
                question += Language.Hiragana[rand1][rand2]
                answer += Language.English[rand1][rand2]
            print("\n" + question + "\n")
            print(answer)
            U_input = str(input("Please Translate the letter(s) above:"))
            if U_input == answer:
                wrong = 1
                correct += 1
                score += 10 * multi
                if correct % 5 == 0:
                    difficulty += 1
                    multi += 1
                print("Correct!     Current Score: " + str(score))
            else:
                print("Incorrect! 3 wrong answers in a row and its Gameover!")
                wrong += 1
    return score



def J_Kata():
    wrong = 1
    correct = 0
    score = 0
    multi = 1
    difficulty = 1
    while wrong != 4:
        for count in range(wrong):
            question = ""
            answer = ""
            for count in range(difficulty):
                rand1 = random.randrange(0,20)
                rand2 = random.randrange(0,4)
                                
                question += Language.Katakana[rand1][rand2]
                answer += Language.English[rand1][rand2]
            print("\n" + question + "\n")
            print(answer)
            U_input = str(input("Please Translate the letter(s) above:"))
            if U_input == answer:
                wrong = 1
                correct += 1
                score += 10 * multi
                if correct % 5 == 0:
                    difficulty += 1
                    multi += 1
                print("Correct!     Current Score: " + str(score))
            else:
                print("Incorrect! 3 wrong answers in a row and its Gameover!")
                wrong += 1
    return score

def J_Expert():
    wrong = 1
    correct = 0
    score = 0
    multi = 1
    difficulty = 1
    while wrong != 4:
        for count in range(wrong):
            question = ""
            answer = ""
            for count in range(difficulty):
                rand1 = random.randrange(0,20)
                rand2 = random.randrange(0,4)
                rand3 = random.randrange(10)
                if rand3 > 5:                
                    question += Language.Hiragana[rand1][rand2]
                else:
                    question += Language.Katakana[rand1][rand2]
                answer += Language.English[rand1][rand2]
            print("\n" + question + "\n")
            print(answer)
            U_input = str(input("Please Translate the letter(s) above:"))
            if U_input == answer:
                wrong = 1
                correct += 1
                score += 25 * multi
                if correct % 5 == 0:
                    difficulty += 1
                    multi += 1
                if score > 9999:
                    score = 9999
                print("Correct!     Current Score: " + str(score))
            else:
                print("Incorrect! 3 wrong answers in a row and its Gameover!")
                wrong += 1

    if score < 1000:
        score = 1000
            
    return score

def display_highscore():
    score = ["","","","","",""]
    
    highscorefile = open('highscores.txt', 'r')
    for count in range(5):
        
                
        score[count] = highscorefile.readline()
        score[count] = score[count].rstrip('\n')

    


        
    print("\n")
    print("---------- Top 5 High Scores -----------")
    print("\n")

    for count in range(5):
        print(score[count])

    print("\n")
    print("\n")
    print("----------------------------------------")

    highscorefile.close()

        
def add_score(info):
    score = ["","","","","",""]
    
    highscorefile = open('highscores.txt', 'a')
    
    highscorefile.write('\n'+info)
    highscorefile.close()

    
    highscorefile = open('highscores.txt', 'r')
       
    
    for count in range(6):
                      
        score[count] = highscorefile.readline()
        score[count] = score[count].rstrip('\n')
        
    score.sort()
    score.reverse()
    del score[5]    
           
    highscorefile.close()

    highscorefile = open('highscores.txt', 'w')
    for count in range(4):
        highscorefile.write(score[count] + '\n')
    highscorefile.write(score[4])
    highscorefile.close()

    highscorefile = open('highscores.txt', 'r')
    top1 = highscorefile.readline()
    top1 = top1.rstrip("\n")
    highscorefile.close()

    if info == top1:
        return True

def user_Info():
    print("\n" + "GAME OVER!" + "\n")
    print("Thanks for playing Jap4One!!")
    print("Please enter your information below to see if you made Top 5!")
    f_Name = str(input("First Name: "))
    while len(f_Name) >= 10:
        print('Name is too long')
        f_Name = str(input("First Name: "))
    l_Name = str(input("Last Name: "))
    country = str(input("Country: "))
    print("\n")
    

    info = " - " + f_Name + " " + l_Name + " - " + country
    return info
    
def top_one(user):
    if user == True:
        print("\nCongratulations for making the Number 1 Spot!\n")


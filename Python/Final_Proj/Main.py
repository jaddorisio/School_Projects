4import Functions

def main():
    choice = 0
    

    print("              --------    Jap4One    --------")
    print("\nThis is a survival game.. Think you have what it takes ?")
    print("\nRules:" + "\nPick a challenge and translate as many letters as you can.")
    print("You will recieve points for every correct answer.")
    print("Five correct answers in a row will increase the amount of letters shown.")
    print("It will also increase the amount of points you recieve per correct answer.")
    print("Beware: Three wrong in a row and it will be GAME OVER!")
    print("\nGood Luck and Have Fun!\n")
    
    
    #loop to keep the program running untill user chooses exit
    while choice != 5:
        menu = ["1. Hiragana Challenge",
                "2. Katakana Challenge",
                "3. Expert Challenge",
                "4. High Scores",
                "5. Exit"]
        
        #loop to display menu options
        for count in range(5):
            
            print(menu[count])

        #call function to graba nd check user input
        choice = Functions.choice_Check()

        if choice == 1:
            score = Functions.J_Hira()
            user = str(score)
            user += Functions.user_Info()
            top_player = Functions.add_score(user)
            Functions.top_one(top_player)
        elif choice == 2:
            score = Functions.J_Kata()
            user = str(score)
            user += Functions.user_Info()
            top_player = Functions.add_score(user)
            Functions.top_one(top_player)
        elif choice == 3:
            score = Functions.J_Expert()
            user = str(score)
            user += Functions.user_Info()
            top_player = Functions.add_score(user)
            Functions.top_one(top_player)
        elif choice == 4:
            Functions.display_highscore()
            
        
    
        

    



    




main()

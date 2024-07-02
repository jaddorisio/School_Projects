# Program: Paint Job Calculator
# Written by: Jonpaul Addorisio
# Date: 03/03/2016
# Description: This script will ask the user to input the cost of a gallon of
# paint and square feet that need to be painted. The it will ouput the gallons
# of paint requried, hours of labor, the total cost of paint, the total cost
# of labor, and the total cost of entire project
# Challenges: I was confused about how to print a goodbye message only when
# the user types 'n' so I tried puting the line out of the nested structure
# and it worked!
# Time Spent: 2.5 hour(Flowchart and pseudo code as well)
# User Input: Expected Output:
# ---------------------------------------------------------------
# Wall Space: 224    Gallons of paint: 2.00
# Paint Price: 1.25  Hours of labor:   16.00
#                    Paint charges:   $2.50
#                    Labor charges:   $560.00
#                    Total Cost:      $562.50
# ---------------------------------------------------------------
# Wall Space: 336    Gallons of paint: 3.00
# Paint Price: 1.50  Hours of labor:   24.00
#                    Paint charges:   $4.50
#                    Labor charges:   $840.00
#                    Total cost:      $844.50
# ---------------------------------------------------------------
# Wall Space: 448    Gallons of paint: 4.00
# Paint Price: 1.75  Hours of labor:   24.00
#                    Paint Charges:   $7.00
#                    Labor charges:   $1,120.00
#                    Total cost:      $1,127.00

# Cost of labor per hour
labor_cost = 35

# Amount of sq feet a gallon of paint covers
paint_footage = 112

# Repeat calculation variable
ask_again = 'y'

# labor hours per gallon of paint
labor_per_gallon = 8

#Allows user to repeat the calculation as long as ask_again variable is = to 'y'
while ask_again == 'y':
    # Gets the amount feet that need to be painted
    house_footage = float(input('Enter wall space in ' +
                                'square feet: '))
    # Gets the cost of paint per gallon
    paint_cost = float(input('Enter paint price per gallon: $'))

    # Calculate the gallons that are needed to paint the house
    gallons_needed = house_footage / paint_footage

    # Calculate total cost of paint
    project_paint_cost = gallons_needed * paint_cost

    # Calculates the hours of labor needed to complete the project
    project_labor_hours = gallons_needed * labor_per_gallon

    # Calculates the cost of labor required
    project_labor_cost = project_labor_hours * labor_cost

    # Calculates the total cost of project
    project_total_cost = project_labor_cost + project_paint_cost

    # Display's Gallons of paint required
    print('Gallons of paint: ', format(gallons_needed, ',.2f'), sep='')

    # Display's Hours of labor required
    print('Hours of labor:   ', format(project_labor_hours, ',.2f'), sep='')

    # Display's paint total cost
    print('Paint charges:   $', format(project_paint_cost, ',.2f'), sep='')

    # Display's labor total cost
    print('Labor charges:   $', format(project_labor_cost, ',.2f'), sep='')

    # Display's total cost of entire project
    print('Total cost:      $', format(project_total_cost, ',.2f'), sep='')

    # Ask's the user if he or she would like to recaluate or exit the program
    ask_again = input("Press 'y' to calculate another project or press 'n' to Exit. " +
                      'Enter here: ')
# After loop stops displays a final exit message before program terminates
print("Goodbye! Thank you for using Jonpaul's Paint Job Calculator")


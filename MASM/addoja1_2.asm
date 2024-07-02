
; File Name: addoja1_2  
; Written by: Jonpaul Addorisio	
; Description: A program that calculates the average age of 5 people from an array
;
;
;
; Challenges: Determining why I was getting an intger over flow error. Error
;			  was fixed by "zeroing" out the dx register
; Time Spent:  
;
; Test Case: People / Constant = Average
; Predicted Results: AX: 0x002B
;					 Average: 43
; Actual Results:	AX: 0x002B
;					AVerage: 43
; Do they match?
;					Yes
; Revision History:
; Date:              Revised By:         Action:
; ------------------------------------------------------------------
; (10/11/17)         (JA)			(Created)
; 

.386
.MODEL FLAT, stdcall
.STACK 4096
ExitProcess PROTO, dwExitCode:DWORD

.data
; Declaring requried variables
average WORD 0
constant WORD 5
people WORD 0, 10, 25, 55, 125

.code
_main PROC

mov dx, 0 ; Clearing out register to prevent error

mov ax, [people + 2] ; Adding the "total" age to ax reg
add ax, [people + 4] ; for division
add ax, [people + 6]
add ax, [people + 8]

mov bx, constant ; Storing the total ages for divsion

div bx

mov average, ax ; moving calculated value to average





INVOKE ExitProcess, 0
_main ENDP
END

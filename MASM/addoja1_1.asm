
; File Name:  addoja1.asm
; Written by:	Jonpaul Addorisio
; Description:	
;			 PART 1 of A1:
;			This program takes in a specific birthday and use a "special" forumula to calculate
;			a lucky number.
;
;
;
; Challenges:
;			Reciveing an instruction operand error when attempting to use smaller byte varible
;			to pass into the ax and bx register for computation
; Time Spent:  30 min
;
; Test Case: (Month * Year) / Day = Lucky
; Predicted Results: lucky  = 181
; Actual Results: lucky = 181
; Do they match? Yes
;
; Revision History:
; Date:              Revised By:         Action:
; ------------------------------------------------------------------
; (10/09/2017)         (JA)				(Created)
; 

.386
.MODEL FLAT, stdcall
.STACK 4096
ExitProcess PROTO, dwExitCode:DWORD

.data

; Decalring 4 variable for computation
lucky BYTE 0
day BYTE 0
year WORD 0
month BYTE 0

.code
_main PROC

; Assigning my birthday to the variables
mov month, 1
mov year, 1997
mov day, 11

; Adding first set of variables to register for calculation
mov ax, 0
mov al, month
mov bx, year
mul bx

; Adding next variable to register for final calcualtion
mov bx, 0
mov bl, day
div bx


; Assigning the computed number to correct variable

mov lucky, al




INVOKE ExitProcess, 0
_main ENDP
END

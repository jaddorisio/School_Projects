; File Name: addoja2.asm 
; Written by: Jonpaul Addorisio
; Description: A program that allows you to make simple 
;			   mathmatical calculations.
;
;
;
; Challenges: Figuring out to use JO instead of compare statement 
;			  for integer overflow error.
; Time Spent:  1.5 hrs
;
; Test Case: 
; 10 / 0 
; 35000 + 35000
; 20 * 10
; Predicted Results:
; ErrorStatus = 1 0x01 Result = 0 0x0000 Remainder = 0 0x0000
; ErrorStatus = 2 0x02 Result = 0 0x0000
; ErrorStatus = 0 0x00 Result = 200 0x00C8
; Actual Results:
; ErrorStatus = 1 0x01 Result = 0 0x0000 Remainder = 0 0x0000
; ErrorStatus = 2 0x02 Result = 0 0x0000
; ErrorStatus = 0 0x00 Result = 200 0x00C8
; Do they match? Yes
;
; Revision History:
; Date:              Revised By:         Action:
; ------------------------------------------------------------------
; (11/10/2017)         (JA)				(Created)
; 

.386
.MODEL FLAT, stdcall
.STACK 4096
ExitProcess PROTO, dwExitCode:DWORD

.data
operand1 SWORD 20
operand2 SWORD 10

operator BYTE '*'

result WORD ?
remainder WORD ?
errorstatus BYTE ?

NoError EQU 0
DivByZero EQU 1
IntOverFlow EQU 2


.code
_main PROC

; A set of compare statement to branch out
; to the corresponding operator

cmp operator, '+'
je addition
cmp operator, '-'
je subtraction
cmp operator, '/'
je divide
cmp operator, '*'
je multiply

; statments for adding the two operands
addition:
mov ax, operand1
add ax, operand2
jo error2 ; halts if overflow occurs

mov result, ax




mov errorstatus, NoError ; If completed succefully sets error to 0
jmp done

; statments for subtracting the two operands
subtraction:
mov ax, operand1
sub ax, operand2
jo error2 ; halts if overflow occurs

mov result, ax

mov errorstatus, NoError
jmp done

; statments for dividing the two operands
divide:
mov dx, 0
mov ax, operand1
mov bx, operand2

cmp bx, 0
je error1 ; jumps to divzero error if
		  ; bx = 0

div bx
jo error2; halts if overflow occurs

mov result, ax
mov remainder, dx
mov errorstatus, NoError ; If completed succefully sets error to 0
jmp done

; statments for multiplying the two operands
multiply:
mov ax, operand1
mov bx, operand2
mul bx

jo error2 ; halts if overflow occurs
mov result, ax

mov errorstatus, NoError ; If completed succefully sets error to 0
jmp done

error1:
mov errorstatus, DivByZero ; sets corresponding error status
jmp done

error2:
mov errorstatus, IntOverFlow ; sets corresponding error status
done:




INVOKE ExitProcess, 0
_main ENDP
END

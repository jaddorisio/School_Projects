; File Name:  addoj3.asm
; Written by: Jonpaul Addorisio
; Description: This program takes the time from midnight of EPOCH and translates it
;			   into the current system time. After this is all said and done the
;			   program packs the system time into the ax register for display on terminal
;
;
; Challenges:  Solving Linker Errors, properly shifting bits, displaying on terminal
; Time Spent:  6 hours
;
; Test Case 1: 9:44 PM
; Predicted Results: 9:44 Pm
; Actual Results: 21 Hrs 45 Mins 2 Secs
; Do they match? Pretty close, just small time delay :)

; Revision History:
; Date:              Revised By:      Action:
; ------------------------------------------------------------------
; (12/08/2017)         (JA)         (Created)
; 

.386
.MODEL FLAT, C
.STACK 4096

; Intalizing external methods
_printString PROTO	
_getInt PROTO
_printInt PROTO
_printChar PROTO
time PROTO


.data

timeInSeconds DWORD 0

hours SBYTE ?
minutes BYTE ?
seconds BYTE ?

colon DWORD ':'

hoursD DWORD ?
minutesD DWORD ?
secondsD DWORD ?

.code

main PROC

; Gets time from epochy
push timeInSeconds
call time
pop timeInSeconds

; Breaks down seconds from epoch into seconds since midnight
; earlier that day
mov edx, 0
mov ebx, 86400
div ebx
mov timeInSeconds, edx

; Find number of hours
mov edx, 0
mov eax, timeInSeconds
mov ebx, 3600
div ebx
mov hours, al

; Finds number of minutes
mov eax, edx
mov edx, 0
mov ebx, 60
div ebx
mov minutes, al

; Finds number of seconds
mov eax, edx
mov edx, 0
mov ebx, 2
div ebx
mov seconds, al

; Sets for eastern time
sub hours, 5

; If hours goes negative fixes back to a postive
cmp hours, 0
jl fix
fix:
add hours, 24
done:


mov eax, 0

; push collected times to pack
movzx eax, hours
movzx edx, minutes
movzx ecx, seconds
push ecx
push edx
push eax

call packTime
add esp, 12

; push packed time for display
push eax 
call unPackTime
pop eax



ret
main ENDP

packTime PROC

push ebp		
mov ebp, esp	
push edi
push esi

; place parmeters into new registers
mov eax, [ebp+8] 

mov edi, [ebp+10]

mov esi, [ebp+16]

; packs bits through shifting into ax register
shr edi, 16
shl eax, 6
add eax, edi
shl eax, 5
add eax, esi





; clean stack
pop esi
pop edi
mov esp, ebp 
pop ebp 
ret

packTime ENDP

unPackTime PROC

; Although shifting the eax register
; time is packed away into ax, this is to prevent lost bits
shl eax, 3
shr al, 3
mov dh, al ; DH Reg now holds seconds
shr eax, 6
shr al, 2
mov cl, al ; CL Reg now holds minutes 
shr eax, 5
shr al, 3
mov ch, al ; CH Reg now holds hours
shr al, 3
mov ax, 0

mov al, dh ; Multiplying seconds by 2 due to storage way
mov bx, 2
mul bx
mov dh, al

; moving register to dword varible for print
; and rewriting intial time byte varibles

movzx eax, ch
movzx ebx, cl
movzx ecx, dh

mov hoursD, eax
mov minutesD, ebx
mov secondsD, ecx




; Displays System time to screen
push hoursD
call _printInt
pop hoursD

push colon
call _printChar
pop colon

push minutesD
call _printInt
pop minutesD

push colon
call _printChar
pop colon

push secondsD
call _printInt
pop secondsD








ret
unPackTime ENDP

END
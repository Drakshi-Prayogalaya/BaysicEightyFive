package com.grape.basic8085.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.grape.basic8085.Programs;
import com.grape.basic8085.R;

/**
 * Created by Ravi on 29/07/15.
 */
public class ExperimentsFragment extends Fragment implements View.OnClickListener {

    Button b[] = new Button[72];
    int buttonId[] = {R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
            R.id.button15,
            R.id.button16,
            R.id.button17,
            R.id.button18,
            R.id.button19,
            R.id.button20,
            R.id.button21,
            R.id.button22,
            R.id.button23,
            R.id.button24,
            R.id.button25,
            R.id.button26,
            R.id.button27,
            R.id.button28,
            R.id.button29,
            R.id.button30,
            R.id.button31,
            R.id.button32,
            R.id.button33,
            R.id.button34,
            R.id.button35,
            R.id.button36,
            R.id.button37,
            R.id.button38,
            R.id.button39,
            R.id.button40,
            R.id.button41,
            R.id.button42,
            R.id.button43,
            R.id.button44,
            R.id.button45,
            R.id.button46,
            R.id.button47,
            R.id.button48};





        static String program1 = "1. Store the data byte 32H into memory location 4000H.\n"+
                "\n"+
                "Program 1;\n"+
                "MVI A, 32H    		; Store 32H in the accumulator\n"+
                "STA 4000H 		; Copy accumulator contents at address 4000H\n"+
                "HLT 			     Terminate program execution\n"+
                "\n"+
                "Program 2;\n"+
                "LXI H 					; Load HL with 4000H\n"+
                "MVI M 					; Store 32H in memory location pointed by HL register pair\n"+
                "(4000H)\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program2 ="2. Exchange the contents of memory locations 2000H and 4000H \n"+
                "\n"+
                "Program 1;\n"+
                "LDA 2000H 		; Get the contents of memory location 2000H into accumulator\n"+
                "MOV B, A 		 Save the contents into B register\n"+
                "LDA 4000H 		; Get the contents of memory location 4000H into accumulator\n"+
                "STA 2000H 		; Store the contents of accumulator at address 2000H\n"+
                "MOV A, B 		 Get the saved contents back into A register\n"+
                "STA 4000H 		; Store the contents of accumulator at address 4000H\n"+
                "\n"+
                "Program 2;\n"+
                "LXI H 2000H 	; Initialize HL register pair as a pointer to memory location 2000H.\n"+
                "LXI D 4000H 	; Initialize DE register pair as a pointer to memory location 4000H.\n"+
                "MOV B, M	 Get the contents of memory location 2000H into B register.\n"+
                "LDAX D 			; Get the contents of memory location 4000H into A register.\n"+
                "MOV M, A 		; Store the contents of A register into memory location 2000H.\n"+
                "MOV A, B 		; Copy the contents of B register into accumulator.\n"+
                "STAX D 			; Store the contents of A register into memory location 4000H.\n"+
                "HLT 			 Terminate program execution.\n"+
                "\n"+
                "\n";


        static String program3 ="3. Sample problem\n"+
                "(4000H) = 14H\n"+
                "(4001H) = 89H\n"+
                "Result  = 14H + 89H = 9DH\n"+
                "\n"+
                "Source program;\n"+
                "\n"+
                "LXI H 4000H 	; HL points 4000H\n"+
                "MOV A, M 		; Get first operand\n"+
                "INX H 			 HL points 4001H\n"+
                "ADD M 			; Add second operand\n"+
                "INX H 			 HL points 4002H\n"+
                "MOV M, A 		; Store result at 4002H\n"+
                "HLT 			 Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program4 ="4. Subtract the contents of memory location 4001H from the memory\n"+
                "location 2000H and place the result in memory location 4002H.\n"+
                "\n"+
                "Program - 4; Subtract two 8-bit numbers\n"+
                "Sample problem;\n"+
                "(4000H) = 51H\n"+
                "(4001H) = 19H\n"+
                "Result = 51H - 19H = 38H\n"+
                "\n"+
                "Source program;\n"+
                "LXI H, 4000H 		; HL points 4000H\n"+
                "MOV A, M 			; Get first operand\n"+
                "INX H 					; HL points 4001H\n"+
                "SUB M 				; Subtract second operand\n"+
                "INX H 					; HL points 4002H\n"+
                "MOV M, A 			; Store result at 4002H.\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program5 ="5. Add the 16-bit number in memory locations 4000H and 4001H to\n"+
                "the 16-bit number in memory locations 4002H and 4003H. The most significant\n"+
                "eight bits of the two numbers to be added are in memory locations 4001H and\n"+
                "4003H. Store the result in memory locations 4004H and 4005H with the most\n"+
                "significant byte in memory location 4005H.\n"+
                "\n"+
                "\n"+
                "Program - 5.a; Add two 16-bit numbers - Source Program 1\n"+
                "Sample problem;\n"+
                "(4000H) = 15H\n"+
                "(4001H) = 1CH\n"+
                "(4002H) = B7H\n"+
                "(4003H) = 5AH\n"+
                "Result = 1C15 + 5AB7H = 76CCH\n"+
                "(4004H) = CCH\n"+
                "(4005H) = 76H\n"+
                "\n"+
                "\n"+
                "Source Program 1;\n"+
                "LHLD 4000H 			; Get first I6-bit number in HL\n"+
                "XCHG 						; Save first I6-bit number in DE\n"+
                "LHLD 4002H 			; Get second I6-bit number in HL\n"+
                "MOV A, E 				; Get lower byte of the first number\n"+
                "ADD L 						; Add lower byte of the second number\n"+
                "MOV L, A 				; Store result in L register\n"+
                "MOV A, D 				; Get higher byte of the first number\n"+
                "ADC H 					; Add higher byte of the second number with CARRY\n"+
                "MOV H, A 				; Store result in H register\n"+
                "SHLD 4004H 			; Store I6-bit result in memory locations 4004H and 4005H.\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program6 ="6. Add the contents of memory locations 40001H and 4001H and place\n"+
                "the result in the memory locations 4002Hand 4003H.\n"+
                "Sample problem;\n"+
                "(4000H) = 7FH\n"+
                "(400lH)  = 89H\n"+
                "Result  = 7FH + 89H = lO8H\n"+
                "(4002H) = 08H\n"+
                "(4003H) = 0lH\n"+
                "\n"+
                "\n"+
                "Source program;\n"+
                "LXI H, 4000H 		; HL Points 4000H\n"+
                "MOV A, M 			; Get first operand\n"+
                "INX H 					; HL Points 4001H\n"+
                "ADD M 				; Add second operand\n"+
                "INX H 					; HL Points 4002H\n"+
                "MOV M, A 			; Store the lower byte of result at 4002H\n"+
                "MVIA, 00 			; Initialize higher byte result with 00H\n"+
                "ADC A 				; Add carry in the high byte result\n"+
                "INX H 					; HL Points 4003H\n"+
                "MOV M, A 			; Store the higher byte of result at 4003H\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program7 ="7. Subtract the 16-bit number in memory locations 4002H and 4003H\n"+
                "from the 16-bit number in memory locations 4000H and 4001H. The most\n"+
                "significant eight bits of the two numbers are in memory locations 4001H and 4003H.\n"+
                "Store the result in memory locations 4004H and 4005H with the most significant\n"+
                "byte in memory location 4005H.\n"+
                "\n"+
                "Sample problem\n"+
                "(4000H) = 19H\n"+
                "(400IH) = 6AH\n"+
                "(4004H) = I5H (4003H) = 5CH\n"+
                "Result  = 6A19H - 5C15H = OE04H\n"+
                "(4004H) = 04H\n"+
                "(4005H) = OEH\n"+
                "\n"+
                "Source program;\n"+
                "LHLD 4000H 			; Get first 16-bit number in HL\n"+
                "XCHG 				     Save first 16-bit number in DE\n"+
                "LHLD 4002H 			; Get second 16-bit number in HL\n"+
                "MOV A, E 				; Get lower byte of the first number\n"+
                "SUB L 						; Subtract lower byte of the second number\n"+
                "MOV L, A 				; Store the result in L register\n"+
                "MOV A, D 				; Get higher byte of the first number\n"+
                "SBB H 					; Subtract higher byte of second number with borrow\n"+
                "MOV H, A 				; Store l6-bit result in memory locations 4004H and 4005H.\n"+
                "SHLD 4004H 			; Store l6-bit result in memory locations 4004H and 4005H.\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program8 ="8. Find the 1's complement of the number stored at memory location\n"+
                "4400H and store the complemented number at memory location 4300H.\n"+
                "\n"+
                "Sample problem;\n"+
                "(4400H) = 55H\n"+
                "Result = (4300B) = AAB\n"+
                "\n"+
                "Source program;\n"+
                "LDA 4400B 		; Get the number\n"+
                "CMA 				; Complement number\n"+
                "STA 4300H 		; Store the result\n"+
                "HLT 				; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program9 ="9. Find the 2's complement of the number stored at memory location\n"+
                "4200H and store the complemented number at memory location 4300H.\n"+
                "\n"+
                "Sample problem;\n"+
                "(4200H) = 55H\n"+
                "Result = (4300H) = AAH + 1 = ABH\n"+
                "\n"+
                "Source program;\n"+
                "LDA 4200H 		; Get the number\n"+
                "CMA 				; Complement the number\n"+
                "ADI, 01 H 			; Add one in the number\n"+
                "STA 4300H 		; Store the result\n"+
                "HLT 				; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program10 ="10. Pack the two unpacked BCD numbers stored in memory locations\n"+
                "4200H and 4201H and store result in memory location 4300H. Assume the least\n"+
                "significant digit is stored at 4200H.\n"+
                "\n"+
                "Sample problem;\n"+
                "(4200H) = 04\n"+
                "(4201H) = 09\n"+
                "Result = (4300H) = 94\n"+
                "\n"+
                "Source program\n"+
                "LDA 4201H 			; Get the Most significant BCD digit\n"+
                "RLC\n"+
                "RLC\n"+
                "RLC\n"+
                "RLC 					; Adjust the position of the second digit (09 is changed to\n"+
                "90)\n"+
                "ANI FOH 				; Make least significant BCD digit zero\n"+
                "MOV C, A 			; store the partial result\n"+
                "LDA 4200H 			; Get the lower BCD digit\n"+
                "ADD C 				; Add lower BCD digit\n"+
                "STA 4300H 			; Store the result\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program11 ="11. Two digit BCD number is stored in memory location 4200H.\n"+
                "Unpack the BCD number and store the two digits in memory locations 4300H and\n"+
                "4301H such that memory location 4300H will have lower BCD digit.\n"+
                "\n"+
                "Sample problem\n"+
                "(4200H) = 58\n"+
                "Result = (4300H) = 08 and(4301H) = 05\n"+
                "\n"+
                "Source program\n"+
                "LDA 4200H 		; Get the packed BCD number\n"+
                "ANI FOH 			; Mask lower nibble\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC 				; Adjust higher BCD digit as a lower digit\n"+
                "STA 4301H 		; Store the partial result\n"+
                "LDA 4200H 		; .Get the original BCD number\n"+
                "ANI OFH 			; Mask higher nibble\n"+
                "STA 4201H 		; Store the result\n"+
                "HLT 				; Terminate program execution\n"+
                "\n"+
                "\n";

        static String program12 ="12. Two digit BCD number is stored in memory location 4200H.\n"+
                "Unpack the BCD number and store the two digits in memory locations 4300H and\n"+
                "4301H such that memory location 4300H will have lower BCD digit.\n"+
                "\n"+
                "Sample problem\n"+
                "(4200H) = 58\n"+
                "Result = (4300H) = 08 and(4301H) = 05\n"+
                "\n"+
                "Source program\n"+
                "LDA 4200H 		; Get the packed BCD number\n"+
                "ANI FOH 			; Mask lower nibble\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC 				; Adjust higher BCD digit as a lower digit\n"+
                "STA 4301H 		; Store the partial result\n"+
                "LDA 4200H 		; .Get the original BCD number\n"+
                "ANI OFH 			; Mask higher nibble\n"+
                "STA 4201H 		; Store the result\n"+
                "HLT 				; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program13 ="13. Write a program to shift an eight bit data four bits right. Assume\n"+
                "that data is in register C.\n"+
                "\n"+
                "Source program;\n"+
                "MOV A, C\n"+
                "RAR\n"+
                "RAR\n"+
                "RAR\n"+
                "RAR\n"+
                "MOV C, A\n"+
                "HLT\n"+
                "\n"+
                "\n";



        static String program14 ="14. Program to shift a 16-bit data 1 bit left. Assume data is in the HL\n"+
                "register pair\n"+
                "Source program;\n"+
                "DAD H 		; Adds HL data with HL data\n"+
                "\n"+
                "\n";


        static String program15 ="15. Write a set of instructions to alter the contents of flag register in\n"+
                "8085.\n"+
                "PUSH PSW 		; Save flags on stack\n"+
                "POP H 			; Retrieve flags in 'L'\n"+
                "MOV A, L 		; Flags in accumulator\n"+
                "CMA 				; Complement accumulator\n"+
                "MOV L, A 		; Accumulator in 'L'\n"+
                "PUSH H 			; Save on stack\n"+
                "POP PSW 		; Back to flag register\n"+
                "HLT 				;Terminate program execution\n"+
                "\n"+
                "\n";


        static String program16 ="16. Calculate the sum of series of numbers. The length of the series is\n"+
                "in memory location 4200H and the series begins from memory location 4201H.\n"+
                "a. Consider the sum to be 8 bit number. So, ignore carries. Store the sum at memory\n"+
                "location 4300H.\n"+
                "b. Consider the sum to be 16 bit number. Store the sum at memory locations 4300H\n"+
                "and 4301H\n"+
                "\n"+
                "a. Sample problem\n"+
                "4200H  = 04H\n"+
                "4201H  = 10H\n"+
                "4202H  = 45H\n"+
                "4203H  = 33H\n"+
                "4204H  = 22H\n"+
                "Result = 10 +41 + 30 + 12 =  H\n"+
                "4300H  =  H\n"+
                "\n"+
                "Source program;\n"+
                "LDA 4200H\n"+
                "MOV C, A 		; Initialize counter\n"+
                "SUB A 				; sum = 0\n"+
                "LXI H, 420lH 	; Initialize pointer\n"+
                "BACK: ADD M 	; SUM = SUM + data\n"+
                "INX H 				; increment pointer\n"+
                "DCR C 				; Decrement counter\n"+
                "JNZ BACK 		; if counter  0 repeat\n"+
                "STA 4300H 		; Store sum\n"+
                "HLT 				; Terminate program execution\n"+
                "\n"+
                "b. Sample problem\n"+
                "4200H =  04H\n"+
                "420lH  = 9AH\n"+
                "4202H = 52H\n"+
                "4203H = 89H\n"+
                "4204H = 3EH\n"+
                "Result = 9AH + 52H + 89H + 3EH = H\n"+
                "4300H = B3H Lower byte\n"+
                "4301H = 0lH Higher byte\n"+
                "\n"+
                "Source program;\n"+
                "LDA 4200H\n"+
                "MOV C, A 		; Initialize counter\n"+
                "LXI H, 4201H 	; Initialize pointer\n"+
                "SUB A 				;Sum low = 0\n"+
                "MOV B, A 		; Sum high = 0\n"+
                "BACK: ADD M 	; Sum = sum + data\n"+
                "JNC SKIP\n"+
                "INR B 				; Add carry to MSB of SUM\n"+
                "SKIP: INX H 		; Increment pointer\n"+
                "DCR C 				; Decrement counter\n"+
                "JNZ BACK 		; Check if counter 0 repeat\n"+
                "STA 4300H 		; Store lower byte\n"+
                "MOV A, B\n"+
                "STA 4301H 		; Store higher byte\n"+
                "HLT 				;Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program17 ="17. Multiply two 8-bit numbers stored in memory locations 2200H and\n"+
                "2201H by repetitive addition and store the result in memory locations 2300H and\n"+
                "2301H.\n"+
                "\n"+
                "Sample problem;\n"+
                "(2200H) = 03H\n"+
                "(2201H) = B2H\n"+
                "Result = B2H + B2H + B2H = 216H\n"+
                "  = 216H\n"+
                "(2300H) = 16H\n"+
                "(2301H) = 02H\n"+
                "\n"+
                "Source program\n"+
                "LDA 2200H\n"+
                "MOV E, A\n"+
                "MVI D, 00 				; Get the first number in DE register pair\n"+
                "LDA 2201H\n"+
                "MOV C, A 				; Initialize counter\n"+
                "LX I H, 0000 H 		; Result = 0\n"+
                "BACK: DAD D 			; Result = result + first number\n"+
                "DCR C 						; Decrement count\n"+
                "JNZ BACK 				; If count  0 repeat\n"+
                "SHLD 2300H 			; Store result\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program18 ="18. Divide 16 bit number stored in memory locations 2200H and 2201H\n"+
                "by the 8 bit number stored at memory location 2202H. Store the quotient in memory\n"+
                "locations 2300H and 2301H and remainder in memory locations 2302H and 2303H.\n"+
                "\n"+
                "Sample problem\n"+
                "(2200H) = 60H\n"+
                "(2201H) = A0H\n"+
                "(2202H) = l2H\n"+
                "Result = A060H/12H = 8E8H Quotient and 10H remainder\n"+
                "(2300H) = E8H\n"+
                " (2301H) = 08H\n"+
                "(2302H= 10H\n"+
                "(2303H) 00H\n"+
                "\n"+
                "Source program\n"+
                "LHLD 2200H 			; Get the dividend\n"+
                "LDA 2202H 				; Get the divisor\n"+
                "MOV C, A\n"+
                "LXI D, 0000H 			; Quotient = 0\n"+
                "BACK: MOV A, L\n"+
                "SUB C 						; Subtract divisor\n"+
                "MOV L, A 				; Save partial result\n"+
                "JNC SKIP 					; if CY  1 jump\n"+
                "DCR H 					; Subtract borrow of previous subtraction\n"+
                "SKIP: INX D 				; Increment quotient\n"+
                "MOV A, H\n"+
                "CPI, 00 					; Check if dividend < divisor\n"+
                "JNZ BACK 				; if no repeat\n"+
                "MOV A, L\n"+
                "CMP C\n"+
                "JNC BACK\n"+
                "SHLD 2302H 			; Store the remainder\n"+
                "XCHG\n"+
                "SHLD 2300H 			; Store the quotient\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program19 ="19. Find the number of negative elements (most significant bit 1) in a\n"+
                "block of data. The length of the block is in memory location 2200H and the block\n"+
                "itself begins in memory location 2201H. Store the number of negative elements in\n"+
                "memory location 2300H.\n"+
                "\n"+
                "Sample problem\n"+
                "(2200H) = 04H\n"+
                "(2201H) = 56H\n"+
                "(2202H) = A9H\n"+
                "(2203H) = 73H\n"+
                "(2204H) = 82H\n"+
                "Result = 02 since 2202H and 2204H contain numbers with a MSB of 1.\n"+
                "\n"+
                "Source program\n"+
                "LDA 2200H\n"+
                "MOV C, A 				; Initialize count\n"+
                "MVI B, 00 				; Negative number = 0\n"+
                "LXI H, 2201H 			; Initialize pointer\n"+
                "BACK: MOV A, M 		; Get the number\n"+
                "ANI 80H 					; Check for MSB\n"+
                "JZ SKIP 					; If MSB = 1\n"+
                "INR B 						; Increment negative number count\n"+
                "SKIP: INX H 				; Increment pointer\n"+
                "DCR C 						; Decrement count\n"+
                "JNZ BACK 				; If count  0 repeat\n"+
                "MOV A, B\n"+
                "STA 2300H 				; Store the result\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program20 ="20. Find the largest number in a block of data. The length of the block\n"+
                "is in memory location 2200H and the block itself starts from memory location\n"+
                "2201H.\n"+
                "Store the maximum number in memory location 2300H. Assume that the numbers\n"+
                "in the block are all 8 bit unsigned binary numbers.\n"+
                "\n"+
                "Sample problem\n"+
                "(2200H) =  04\n"+
                "(2201H) = 34H\n"+
                "(2202H) = A9H\n"+
                "(2203H) = 78H\n"+
                "(2204H) =56H\n"+
                "Result = (2202H) = A9H\n"+
                "\n"+
                "Source program\n"+
                "LDA 2200H\n"+
                "MOV C, A 			; Initialize counter\n"+
                "XRA A 					; Maximum = Minimum possible value = 0\n"+
                "LXI H, 2201H 		; Initialize pointer\n"+
                "BACK: CMP M 		; Is number> maximum\n"+
                "JNC SKIP 				; Yes, replace maximum\n"+
                "MOV A, M\n"+
                "SKIP: INX H\n"+
                "DCR C\n"+
                "JNZ BACK\n"+
                "STA 2300H 			; Store maximum number\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program21 ="21. Write a program to count number of l's in the contents of D\n"+
                "register and store the count in the B register.\n"+
                "\n"+
                "Source program;\n"+
                "MVI B, 00H\n"+
                "MVI C, 08H\n"+
                "MOV A, D\n"+
                "BACK: RAR\n"+
                "JNC SKIP\n"+
                "INR B\n"+
                "SKIP: DCR C\n"+
                "JNZ BACK\n"+
                "HLT\n"+
                "\n"+
                "\n"+
                "\n";


        static String program22 ="22. Write a program to sort given 10 numbers from memory location\n"+
                "2200H in the ascending order.\n"+
                "\n"+
                "Source program;\n"+
                "MVI B, 09 						; Initialize counter\n"+
                "START: LXI H, 2200H		; Initialize memory pointer\n"+
                "MVI C, 09H 						; Initialize counter 2\n"+
                "BACK: MOV A, M 				; Get the number\n"+
                "INX H 								; Increment memory pointer\n"+
                "CMP M 							; Compare number with next number\n"+
                "JC SKIP 							; If less, don't interchange\n"+
                "JZ SKIP								; If equal, don't interchange\n"+
                "MOV D, M\n"+
                "MOV M, A\n"+
                "DCX H\n"+
                "MOV M, D\n"+
                "INX H 								; Interchange two numbers\n"+
                "SKIP:DCR C 						; Decrement counter 2\n"+
                "JNZ BACK 						; If not zero, repeat\n"+
                "DCR B 								; Decrement counter 1\n"+
                "JNZ START\n"+
                "HLT  								; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program23 ="23. Calculate the sum of series of even numbers from the list of\n"+
                "numbers. The length of the list is in memory location 2200H and the series itself\n"+
                "begins from memory location 2201H. Assume the sum to be 8 bit number so you can\n"+
                "ignore carries and store the sum at memory location 2.\n"+
                "\n"+
                "Sample problem;\n"+
                "2200H= 4H\n"+
                "2201H= 20H\n"+
                "2202H= l5H\n"+
                "2203H= l3H\n"+
                "2204H= 22H\n"+
                "Result 22l0H= 20 + 22 = 42H\n"+
                "\n"+
                "Source program;\n"+
                "LDA 2200H\n"+
                "MOV C, A 				; Initialize counter\n"+
                "MVI B, 00H 				; sum = 0\n"+
                "LXI H, 2201H  			; Initialize pointer\n"+
                "BACK: MOV A, M 		; Get the number\n"+
                "ANI 0lH 					; Mask Bit l to Bit7\n"+
                "JNZ SKIP 					; Don't add if number is ODD\n"+
                "MOV A, B 				; Get the sum\n"+
                "ADD M 					; SUM = SUM + data\n"+
                "MOV B, A 				; Store result in B register\n"+
                "SKIP: INX H 				; increment pointer\n"+
                "DCR C 						; Decrement counter\n"+
                "JNZ BACK 				; if counter  0 repeat\n"+
                "STA 2210H 				; store sum\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program24 ="24. Calculate the sum of series of odd numbers from the list of\n"+
                "numbers. The length of the list is in memory location 2200H and the series itself\n"+
                "begins from memory location 2201H. Assume the sum to be 16-bit. Store the sum at\n"+
                "memory locations 2300H and 2301H.\n"+
                "\n"+
                "Sample problem;\n"+
                "2200H = 4H\n"+
                "2201H= 9AH\n"+
                "2202H= 52H\n"+
                "2203H= 89H\n"+
                "2204H= 3FH\n"+
                "Result = 89H + 3FH = C8H\n"+
                "2300H= H Lower byte\n"+
                "2301H = H Higher byte\n"+
                "\n"+
                "\n"+
                "Source program\n"+
                "LDA 2200H\n"+
                "MOV C, A 				; Initialize counter\n"+
                "LXI H, 2201H 			; Initialize pointer\n"+
                "MVI E, 00 				; Sum low = 0\n"+
                "MOV D, E  				; Sum high = 0\n"+
                "BACK: MOV A, M 		; Get the number\n"+
                "ANI 0lH 					; Mask Bit 1 to Bit7\n"+
                "JZ SKIP 					; Don't add if number is even\n"+
                "MOV A, E 				; Get the lower byte of sum\n"+
                "ADD M 					; Sum = sum + data\n"+
                "MOV E, A  				; Store result in E register\n"+
                "JNC SKIP\n"+
                "INR D 						; Add carry to MSB of SUM\n"+
                "SKIP: INX H  			; Increment pointer\n"+
                "DCR C 						; Decrement\n"+
                "\n"+
                "\n"+
                "\n";


        static String program25 ="25. Find the square of the given numbers from memory location 6100H\n"+
                "and store the result from memory location 7000H.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 6200H 			; Initialize lookup table pointer\n"+
                "LXI D, 6100H 			; Initialize source memory pointer\n"+
                "LXI B, 7000H 			; Initialize destination memory pointer\n"+
                "BACK: LDAX D 		; Get the number\n"+
                "MOV L, A 				; A point to the square\n"+
                "MOV A, M 				; Get the square\n"+
                "STAX B 					; Store the result at destination memory location\n"+
                "INX D 						; Increment source memory pointer\n"+
                "INX B 						; Increment destination memory pointer\n"+
                "MOV A, C\n"+
                "CPI 05H 					; Check for last number\n"+
                "JNZ BACK 				; If not repeat\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program26 ="26. Search the given byte in the list of 50 numbers stored in the\n"+
                "consecutive memory locations and store the address of memory location in the\n"+
                "memory locations 2200H and 2201H. Assume byte is in the C register and starting\n"+
                "address of the list is 2000H. If byte is not found store 00 at 2200H and 2201H.\n"+
                "\n"+
                "\n"+
                "Source program;\n"+
                "LX I H, 2000H 			; Initialize memory pointer 52H\n"+
                "MVI B, 52H 				; Initialize counter\n"+
                "BACK: MOV A, M 		; Get the number\n"+
                "CMP C  					; Compare with the given byte\n"+
                "JZ LAST  					; Go last if match occurs\n"+
                "INX H  						; Increment memory pointer\n"+
                "DCR B 						; Decrement counter\n"+
                "JNZ B 						; If not zero, repeat\n"+
                "LXI H, 0000H\n"+
                "SHLD 2200H\n"+
                "JMP END 					; Store 00 at 2200H and 2201H\n"+
                "LAST: SHLD 2200H 	; Store memory address\n"+
                "END:  HLT 				; Stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program27 ="27. Two decimal numbers six digits each, are stored in BCD package\n"+
                "form. Each number occupies a sequence of byte in the memory. The starting\n"+
                "address of first number is 6000H Write an assembly language program that adds\n"+
                "these two numbers and stores the sum in the same format starting from memory\n"+
                "location 6200H.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 6000H 		; Initialize pointer l to first number\n"+
                "LXI D, 6l00H 		; Initialize pointer2 to second number\n"+
                "LXI B, 6200H 		; Initialize pointer3 to result\n"+
                "STC\n"+
                "CMC  					; Carry = 0\n"+
                "BACK: LDAX D 	; Get the digit\n"+
                "ADD M 				; Add two digits\n"+
                "DAA 					; Adjust for decimal\n"+
                "STAX.B 				; Store the result\n"+
                "INX H 					; Increment pointer 1\n"+
                "INX D 					; Increment pointer2\n"+
                "INX B 					; Increment result pointer\n"+
                "MOV A, L\n"+
                "CPI 06H 				; Check for last digit\n"+
                "JNZ BACK 			; If not last digit repeat\n"+
                "HLT 					; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program28 ="28. Add 2 arrays having ten 8-bit numbers each and generate a third\n"+
                "array of result. It is necessary to add the first element of array 1 with the first\n"+
                "element of array-2 and so on. The starting addresses of array l, array2 and array3\n"+
                "are 2200H, 2300H and 2400H, respectively.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 2200H 		; Initialize memory pointer 1\n"+
                "LXI B, 2300H 		; Initialize memory pointer 2\n"+
                "LXI D, 2400H 		; Initialize result pointer\n"+
                "BACK: LDAX B 	; Get the number from array 2\n"+
                "ADD M 				; Add it with number in array 1\n"+
                "STAX D 				; Store the addition in array 3\n"+
                "INX H 					; Increment pointer 1\n"+
                "INX B 					; Increment pointer2\n"+
                "INX D 					; Increment result pointer\n"+
                "MOV A, L\n"+
                "CPI 0AH 				; Check pointer 1 for last number\n"+
                "JNZ BACK 			; If not, repeat\n"+
                "HLT 					; Stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program29 ="29. Write an assembly language program to separate even numbers\n"+
                "from the given list of 50 numbers and store them in the another list starting from\n"+
                "2300H. Assume starting address of 50 number list is 2200H.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 2200H 			; Initialize memory pointer l\n"+
                "LXI D, 2300H 			; Initialize memory pointer2\n"+
                "MVI C, 32H 				; Initialize counter\n"+
                "BACK:MOV A, M 		; Get the number\n"+
                "ANI 0lH 					; Check for even number\n"+
                "JNZ SKIP 					; If ODD, don't store\n"+
                "MOV A, M 				; Get the number\n"+
                "STAX D 					; Store the number in result list\n"+
                "INX D 						; Increment pointer 2\n"+
                "SKIP: INX H 				; Increment pointer l\n"+
                "DCR C 						; Decrement counter\n"+
                "JNZ BACK 				; If not zero, repeat\n"+
                "HLT 						; Stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program30 ="30. Write assembly language program with proper comments for the\n"+
                "following;\n"+
                "A block of data consisting of 256 bytes is stored in memory starting at 3000H.\n"+
                "This block is to be shifted (relocated) in memory from 3050H onwards. Do not shift\n"+
                "the block or part of the block anywhere else in the memory.\n"+
                "\n"+
                "\n"+
                "Source Program;\n"+
                "Two blocks (3000 - 30FF and 3050 - 314F) are overlapping. Therefore it\n"+
                "is necessary to transfer last byte first and first byte last.\n"+
                "MVI C, FFH 				; Initialize counter\n"+
                "LX I H, 30FFH 			; Initialize source memory pointer 3l4FH\n"+
                "LXI D, 314FH 			; Initialize destination memory pointer\n"+
                "BACK: MOV A, M 		; Get byte from source memory block\n"+
                "STAX D 					; Store byte in the destination memory block\n"+
                "DCX H 					; Decrement source memory pointer\n"+
                "DCX 						; Decrement destination memory pointer\n"+
                "DCR C 						; Decrement counter\n"+
                "JNZ BACK 				; If counter  0 repeat\n"+
                "HLT 						; Stop execution\n"+
                "\n"+
                "\n"+
                "\n";



        static String program31 ="31. Add even parity to a string of 7-bit ASCII characters. The length\n"+
                "of the string is in memory location 2040H and the string itself begins in memory\n"+
                "location 2041H. Place even parity in the most significant bit of each character.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 2040H\n"+
                "MOV C ,M 						; Counter for character\n"+
                "REPEAT:INX H 					; Memory pointer to character\n"+
                "MOV A,M 						; Character in accumulator\n"+
                "ORA A 							; ORing with itself to check parity.\n"+
                "JPO PAREVEN 					; If odd parity place\n"+
                "ORI 80H  even parity in D7 (80).\n"+
                "PAREVEN:MOV M , A 		; Store converted even parity character.\n"+
                "DCR C 								; Decrement counter.\n"+
                "JNZ REPEAT 					; If not zero go for next character.\n"+
                "HLT\n"+
                "\n"+
                "\n"+
                "\n";


        static String program32 ="32. A list of 50 numbers is stored in memory, starting at 6000H. Find\n"+
                "number of negative, zero and positive numbers from this list and store these results\n"+
                "in memory locations 7000H, 7001H, and 7002H respectively.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 6000H 			; Initialize memory pointer\n"+
                "MVI C, 00H 				; Initialize number counter\n"+
                "MVI B, 00H 				; Initialize negative number counter\n"+
                "MVI E, 00H 				; Initialize zero number counter\n"+
                "BEGIN: MOV A, M 		; Get the number\n"+
                "CPI 00H 					; If number = 0\n"+
                "JZ ZERONUM 			; Goto zeronum\n"+
                "ANI 80H 					; If MSB of number = 1 i.e. if JNZ NEGNUM number is negative goto NEGNUM\n"+
                "INR D 						; otherwise increment positive number counter\n"+
                "JMP LAST\n"+
                "ZERONUM;INR E 		; Increment zero number counter\n"+
                "JMP LAST\n"+
                "NEGNUM;INR B 		; Increment negative number counter\n"+
                "LAST;INX H 				; Increment memory pointer\n"+
                "INR C 						; Increment number counter\n"+
                "MOV A, C\n"+
                "CPI 32H 					; If number counter = 5010 then\n"+
                "JNZ BEGIN 				; Store otherwise check next number\n"+
                "LXI H, 7000 			; Initialize memory pointer.\n"+
                "MOV M, B 				; Store negative number.\n"+
                "INX H\n"+
                "MOV M, E 				; Store zero number.\n"+
                "INX H\n"+
                "MOV M, D 				; Store positive number.\n"+
                "HLT 						; Terminate execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program33 ="33.Write an 8085 assembly language program to insert a string of four\n"+
                "characters from the tenth location in the given array of 50 characters\n"+
                "Solution;\n"+
                "Step 1; Move bytes from location 10 till the end of array by four bytes\n"+
                "downwards.\n"+
                "Step 2; Insert four bytes at locations 10, 11, 12 and 13.\n"+
                "\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 2l31H 				; Initialize pointer at the last location of array.\n"+
                "LXI D, 2l35H 			; Initialize another pointer to point the last location of array after insertion.\n"+
                "AGAIN: MOV A, M 	; Get the character\n"+
                "STAX D 					; Store at the new location\n"+
                "DCX D 					; Decrement destination pointer\n"+
                "DCX H 					; Decrement source pointer\n"+
                "MOV A, L 				; [check whether desired CPI 05H bytes are shifted or not]\n"+
                "JNZ AGAIN 				; if not repeat the process\n"+
                "INX H 						; adjust the memory pointer\n"+
                "LXI D, 2200H 			; Initialize the memory pointer to point the string to be inserted\n"+
                "REPE: LDAX D 			; Get the character\n"+
                "MOV M, A 				; Store it in the array\n"+
                "INX D 						; Increment source pointer\n"+
                "INX H 						; Increment destination pointer\n"+
                "MOV A, E 				; [Check whether the 4 bytes CPI 04   are inserted]\n"+
                "JNZ REPE 				; if not repeat the process\n"+
                "HLT 						; stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program34 ="34. Write an 8085 assembly language program to delete a string of 4\n"+
                "characters from the tenth location in the given array of 50 characters.\n"+
                "Solution; Shift bytes from location 14 till the end of array upwards by 4\n"+
                "characters i.e. from location 10 onwards.\n"+
                "\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 2l0DH 			;Initialize source memory pointer at the 14th location of the array.\n"+
                "LXI D, 2l09H 			; Initialize destination memory pointer at the 10th location of the array.\n"+
                "MOV A, M 				; Get the character\n"+
                "STAX D 					; Store character at new location\n"+
                "INX D 						; Increment destination pointer\n"+
                "INX H 						; Increment source pointer\n"+
                "MOV A, L 				; [check whether desired CPI 32H  bytes are shifted or not]\n"+
                "JNZ REPE 				; if not repeat the process\n"+
                "HLT 						; stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program35 ="35. Multiply the 8-bit unsigned number in memory location 2200H by\n"+
                "the 8-bit unsigned number in memory location 2201H. Store the 8 least significant\n"+
                "bits of the result in memory location 2300H and the 8 most significant bits in\n"+
                "memory location 2301H.\n"+
                "\n"+
                "Sample problem;\n"+
                "(2200)  = 1100 (0CH)\n"+
                "(2201)  = 0101 (05H)\n"+
                "Multiplicand  = 1100 (1210)\n"+
                "Multiplier  =  0101 (510)\n"+
                "Result  = 12 x 5 = (6010).\n"+
                "\n"+
                "Source program\n"+
                "LXI H, 2200 		; Initialize the memory pointer\n"+
                "MOV E, M 			; Get multiplicand\n"+
                "MVI D, 00H 			; Extend to 16-bits\n"+
                "INX H 					; Increment memory pointer\n"+
                "MOV A, M 			; Get multiplier\n"+
                "LXI H, 0000 		; Product = 0\n"+
                "MVI B, 08H 			; Initialize counter with count 8\n"+
                "MULT: DAD H 		; Product = product x 2\n"+
                "RAL\n"+
                "JNC SKIP 				; Is carry from multiplier 1 ?\n"+
                "DAD D 				; Yes, Product =Product + Multiplicand\n"+
                "SKIP:  DCR B 		; Is counter = zero\n"+
                "JNZ MULT 			; no, repeat\n"+
                "SHLD 2300H 		; Store the result\n"+
                "HLT 					; End of program\n"+
                "\n"+
                "\n"+
                "\n"+
                "\n";


        static String program36 ="36. Divide the 16-bit unsigned number in memory locations 2200H and\n"+
                "2201H (most significant bits in 2201H) by the B-bit unsigned number in memory\n"+
                "location 2300H store the quotient in memory location 2400H and remainder in\n"+
                "2401H\n"+
                "Assumption; The most significant bits of both the divisor and dividend are\n"+
                "zero.\n"+
                "\n"+
                "Source program\n"+
                "MVI E, 00 			; Quotient = 0\n"+
                "LHLD 2200H 		; Get dividend\n"+
                "LDA 2300 			; Get divisor\n"+
                "MOV B, A 			; Store divisor\n"+
                "MVI C, 08 			; Count = 8\n"+
                "NEXT: DAD H		; Dividend = Dividend x 2\n"+
                "MOV A, E\n"+
                "RLC\n"+
                "MOV E, A 			; Quotient = Quotient x 2\n"+
                "MOV A, H\n"+
                "SUB B 					; Is most significant byte of Dividend > divisor\n"+
                "JC SKIP 				; No, go to Next step\n"+
                "MOV H, A 			; Yes, subtract divisor\n"+
                "INR E 					; and Quotient = Quotient + 1\n"+
                "SKIP:DCR C 			; Count = Count - 1\n"+
                "JNZ NEXT 			; Is count =0 repeat\n"+
                "MOV A, E\n"+
                "STA 2401H 			; Store Quotient\n"+
                "Mov A, H\n"+
                "STA 2410H 			; Store remainder\n"+
                "HLT 					; End of program\n"+
                "\n"+
                "\n"+
                "\n";


        static String program37 ="37. DAA instruction is not present. Write a sub routine which will perform the same\n"+
                "task as DAA.\n"+
                "\n"+
                "Sample Problem;\n"+
                "Execution of DAA instruction;\n"+
                "1. If the value of the low order four bits (03-00) in the accumulator is\n"+
                "greater than 9 or if auxiliary carry flag is set, the instruction adds 6 '(06) to\n"+
                "the low-order four bits.\n"+
                "2. If the value of the high-order four bits (07-04) in the accumulator is\n"+
                "greater than 9 or if carry flag is set, the instruction adds 6(06) to the higher order four bits.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI SP, 27FFH 			; Initialize stack pointer\n"+
                "MOV E, A 				; Store the contents of accumulator\n"+
                "ANI 0FH 					; Mask upper nibble\n"+
                "CPI 0A H 					; Check if number is greater than 9\n"+
                "JC SKIP 					; if no go to skip\n"+
                "MOV A, E 				; Get the number\n"+
                "ADI 06H 					; Add 6 in the number\n"+
                "JMP SECOND 			; Go for second check\n"+
                "SKIP: PUSH PSW		; Store accumulator and flag contents in stack\n"+
                "POP B 					; Get the contents of accumulator in B register and flag register contents in C register\n"+
                "MOV A, C 				; Get flag register contents in accumulator\n"+
                "ANI 10H 					; Check for bit 4\n"+
                "JZ SECOND 				; if zero, go for second check\n"+
                "MOV A, E 				; Get the number\n"+
                "ADI 06 					; Add 6 in the number\n"+
                "SECOND; MOV E, A 	; Store the contents of accumulator\n"+
                "ANI FOH 					; Mask lower nibble\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC 						; Rotate number 4 bit right\n"+
                "CPI 0AH 					; Check if number is greater than 9\n"+
                "JC SKIPl 					; if no go to skip 1\n"+
                "MOV A, E 				; Get the number\n"+
                "ADI 60 H 					; Add 60 H in the number\n"+
                "JMP LAST 				; Go to last\n"+
                "SKIP1; JNC LAST 		; if carry flag = 0 go to last\n"+
                "MOV A, E 				; Get the number\n"+
                "ADI 60 H 					; Add 60 H in the number\n"+
                "LAST; HLT\n"+
                "\n"+
                "\n"+
                "\n";


        static String program38 ="38. To test RAM by writing '1' and reading it back and later writing '0'\n"+
                "(zero) and reading it back. RAM addresses to be checked are 40FFH to 40FFH. In\n"+
                "case of any error, it is indicated by writing 01H at port 10H.\n"+
                "\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 4000H 				; Initialize memory pointer\n"+
                "BACK: MVI M, FFH 		; Writing '1' into RAM\n"+
                "MOV A, M 					; Reading data from RAM\n"+
                "CPI FFH 						; Check for ERROR\n"+
                "JNZ ERROR 					; If yes go to ERROR\n"+
                "INX H 							; Increment memory pointer\n"+
                "MOV A, H\n"+
                "CPI SOH 						; Check for last check\n"+
                "JNZ BACK 					; If not last, repeat\n"+
                "LXI H, 4000H 				; Initialize memory pointer\n"+
                "BACKl: MVI M, OOH 		; Writing '0' into RAM\n"+
                "MOV A, M 					; Reading data from RAM\n"+
                "CPI OOH 						; Check for ERROR\n"+
                "INX H 							; Increment memory pointer\n"+
                "MOV A, H\n"+
                "CPI SOH 						; Check for last check\n"+
                "JNZ BACKl 					; If not last, repeat\n"+
                "HLT 							; Stop Execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program39 ="39. Write an assembly language program to generate fibonacci number\n"+
                "\n"+
                "Source Program;\n"+
                "MVI D, COUNT 		; Initialize counter\n"+
                "MVI B, 00 				; Initialize variable to store previous number\n"+
                "MVI C, 01 				; Initialize variable to store current number\n"+
                "MOV A, B 				; [Add two numbers]\n"+
                "BACK: ADD C 			; [Add two numbers]\n"+
                "MOV B, C 				; Current number is now previous number\n"+
                "MOV C, A 				; Save result as a new current number\n"+
                "DCR D 						; Decrement count\n"+
                "JNZ BACK 				; if count  0 go to BACK\n"+
                "HLT 						; Stop\n"+
                "\n"+
                "\n"+
                "\n";


        static String program40 ="40. Write a program to generate a delay of 0.4 sec if the crystal frequency is 5 MHz\n"+
                "\n"+
                "Calculation; In 8085, the operating frequency is half of the crystal frequency,\n"+
                "i.e., Operating frequency  = 5/2 = 2.5 MHz\n"+
                "Time for one T -state  =\n"+
                "Number of T-states required  = 1 x 106\n"+
                "\n"+
                "Source Program;\n"+
                "LXI B, count 		; 16 - bit count\n"+
                "BACK: DCX B 		; Decrement count\n"+
                "MOV A, C\n"+
                "ORA B 				; Logically OR Band C\n"+
                "JNZ BACK 			; If result is not zero repeat\n"+
                "\n"+
                "\n"+
                "\n";


        static String program41 ="41. Arrange an array of 8 bit unsigned no in descending order.\n"+
                "\n"+
                "Source Program;\n"+
                "START;MVI B, 00 		; Flag = 0\n"+
                "LXI H, 4150 					; Count = length of array\n"+
                "MOV C, M\n"+
                "DCR C 							; No. of pair = count -1\n"+
                "INX H 							; Point to start of array\n"+
                "LOOP: MOV A, M 			; Get kth element\n"+
                "INX H\n"+
                "CMP M 						; Compare to (K+1) th element\n"+
                "JNC LOOP 1 					; No interchange if kth >= (k+1) th\n"+
                "MOV D, M 					; Interchange if out of order\n"+
                "MOV M, A 					;\n"+
                "DCR H\n"+
                "MOV M, D\n"+
                "INX H\n"+
                "MVI B, 01H 				 Flag=1\n"+
                "LOOP 1;DCR C 			   	; count down\n"+
                "JNZ LOOP \n"+
                "DCR B 							; is flag = 1?\n"+
                "JZ START 					; do another sort, if yes\n"+
                "HLT 							; If flag = 0, step execution\n"+
                "\n"+
                "\n"+
                "\n";


        static String program42 ="42. Transfer ten bytes of data from one memory to another memory block.\n"+
                "Source memory block starts from memory location 2200H where as destination\n"+
                "memory block starts from memory location 2300H.\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 4150 				; Initialize memory pointer\n"+
                "MVI B, 08 				; count for 8-bit\n"+
                "MVI A, 54\n"+
                "LOOP: RRC\n"+
                "JC LOOP1\n"+
                "MVI M, 00 				; store zero it no carry\n"+
                "JMP COMMON\n"+
                "LOOP2: MVI M, 01 	; store one if there is a carry\n"+
                "COMMON:  INX H\n"+
                "DCR B 						; check for carry\n"+
                "JNZ LOOP\n"+
                "HLT 						; Terminate the program\n"+
                "\n"+
                "\n"+
                "\n";


        static String program43 ="43. Program to calculate the factorial of a number between 0 to 8\n"+
                "Source program.\n"+
                "\n"+
                "\n"+
                "LXI SP, 27FFH 			; Initialize stack pointer\n"+
                "LDA 2200H 				; Get the number\n"+
                "CPI 02H 				 Check if number is greater than 1\n"+
                "JC LAST\n"+
                "MVI D, 00H 				; Load number as a result\n"+
                "MOV E, A\n"+
                "DCR A\n"+
                "MOV C,A 					; Load counter one less than number\n"+
                "CALL FACTO 			; Call subroutine FACTO\n"+
                "XCHG 					 Get the result in HL\n"+
                "SHLD 2201H 			; Store result in the memory\n"+
                "JMP END\n"+
                "LAST: LXI H, 000lH 	; Store result = 01\n"+
                "END: SHLD 2201H\n"+
                "HLT\n"+
                "\n"+
                "\n"+
                "\n";


        static String program44 ="44. Write a program to find the Square Root of an 8 bit binary number.\n"+
                "The binary number is stored in memory location 4200H and store the square root in\n"+
                "4201H.\n"+
                "\n"+
                "Source Program;\n"+
                "LDA 4200H 				; Get the given data(Y) in A register\n"+
                "MOV B,A 				 Save the data in B register\n"+
                "MVI C,02H 				; Call the divisor(02H) in C register\n"+
                "CALL DIV 				; Call division subroutine to get initial value(X) in D-reg\n"+
                "REP: MOV E,D 			; Save the initial value in E-reg\n"+
                "MOV A,B 					; Get the dividend(Y) in A-reg\n"+
                "MOV C,D 					; Get the divisor(X) in C-reg\n"+
                "CALL DIV 				; Call division subroutine to get initial value(Y/X) in D-reg\n"+
                "MOV A, D 				; Move Y/X in A-reg\n"+
                "ADD E 						; Get the((Y/X) + X) in A-reg\n"+
                "MVI C, 02H 				; Get the divisor(02H) in C-reg\n"+
                "CALL DIV 				; Call division subroutine to get ((Y/X) + X)/2 in D-reg.This is XNEW\n"+
                "MOV A, E 				; Get X in A-reg\n"+
                "CMP D 					; Compare X and XNEW\n"+
                "JNZ REP 					; If XNEW is not equal to X, then repeat\n"+
                "STA 4201H 				; Save the square root in memory\n"+
                "HLT 						; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";



        static String program45 ="45. Write a simple program to Split a HEX data into two nibbles and store\n"+
                "it in memory\n"+
                "\n"+
                "Source Program;\n"+
                "LXI H, 4200H 				; Set pointer data for array\n"+
                "MOV B,M 					; Get the data in B-reg\n"+
                "MOV A,B 						; Copy the data to A-reg\n"+
                "ANI OFH 						; Mask the upper nibble\n"+
                "INX H 							; Increment address as 4201\n"+
                "MOV M,A 					; Store the lower nibble in memory\n"+
                "MOV A,B 						; Get the data in A-reg\n"+
                "ANI FOH 						; Bring the upper nibble to lower nibble position\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC\n"+
                "RRC\n"+
                "INX H\n"+
                "MOV M,A 					; Store the upper nibble in memory\n"+
                "HLT 							; Terminate program execution\n"+
                "\n"+
                "\n"+
                "\n";



        static String program46 ="46. Add two 4 digit BCD numbers in HL and DE register pairs and store\n"+
                "result in memory locations, 2300H and 2301H. Ignore carry after 16 bit.\n"+
                "\n"+
                "Sample Problem;\n"+
                "(HL) =3629\n"+
                "(DE) =4738\n"+
                "Step 1 ; 29 + 38 = 61 and auxiliary carry flag = 1\n"+
                ";.add 06\n"+
                "61 + 06 = 67\n"+
                "Step 2 ;  36 + 47 + 0 (carry of LSB) = 7D\n"+
                "Lower nibble of addition is greater than 9, so add 6.\n"+
                "7D + 06 = 83\n"+
                "Result = 8367\n"+
                "\n"+
                "\n"+
                "Source program;\n"+
                "MOV A, L 				; Get lower 2 digits of no. 1\n"+
                "ADD E 						; Add two lower digits\n"+
                "DAA 						; Adjust result to valid BCD\n"+
                "STA 2300H 				; Store partial result\n"+
                "MOV A, H 				; Get most significant 2 digits of number\n"+
                "ADC D 					; Add two most significant digits\n"+
                "DAA 						; Adjust result to valid BCD\n"+
                "STA 2301H 				; Store partial result\n"+
                "HLT							; Terminate program execution\n"+
                "\n"+
                "\n";


        static String program47 ="47. Subtract the BCD number stored in E register from the number stored\n"+
                "in the D register.\n"+
                "\n"+
                "Source Program;\n"+
                "MVI A,99H\n"+
                "SUB E 				; Find the 99's complement of subtrahend\n"+
                "INR A 				; Find 100's complement of subtrahend\n"+
                "ADD D  			; Add minuend to 100's complement of subtrahend\n"+
                "DAA 				; Adjust for BCD\n"+
                "HLT 				; Terminate program execution\n"+
                "\n";



        static String program48 ="48. Write an assembly language program to multiply 2 BCD numbers.\n"+
                "\n"+
                "\n"+
                "Source Program;\n"+
                "MVI C, Multiplier 			; Load BCD multiplier\n"+
                "MVI B, 00 					; Initialize counter\n"+
                "LXI H, 0000H 				; Result = 0000\n"+
                "MVI E, multiplicand 		; Load multiplicand\n"+
                "MVI D, 00H 					; Extend to 16-bits\n"+
                "BACK: DAD D 				; Result Result + Multiplicand\n"+
                "MOV A, L 					; Get the lower byte of the result\n"+
                "ADI, 00H\n"+
                "DAA 							; Adjust the lower byte of result to BCD.\n"+
                "MOV L, A 					; Store the lower byte of result\n"+
                "MOV A, H 					; Get the higher byte of the result\n"+
                "ACI, 00H\n"+
                "DAA 							; Adjust the higher byte of the result to BCD\n"+
                "MOV H, A 					; Store the higher byte of result.\n"+
                "MOV A, B 					; Increment\n"+
                "ADI 01H 						; counter\n"+
                "DAA 							; adjust it to BCD and\n"+
                "MOV B,A 						; store it\n"+
                "CMP C 						; Compare if count = multiplier\n"+
                "JNZ BACK 					; if not equal repeat\n"+
                "HLT 							; Stop\n"+
                "\n"+
                "\n";



    public ExperimentsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_experiments, container, false);

        for(int i = 0; i< 48; i++)
        {
            b[i] = (Button) view.findViewById(buttonId[i]);
            b[i].setOnClickListener(this);
        }
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        int btnid = v.getId();
        Intent i;
        //Toast.makeText(this.getActivity(),"Button is clicked!", Toast.LENGTH_LONG).show();
        switch (btnid)
        {
            case R.id.button1:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c1", program1);
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c2", program2);
                startActivity(i);
                break;
            case R.id.button3:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c3", program3);
                startActivity(i);
                break;
            case R.id.button4:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c4", program4);
                startActivity(i);
                break;
            case R.id.button5:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c5", program5);
                startActivity(i);
                break;
            case R.id.button6:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c6", program6);
                startActivity(i);
                break;
            case R.id.button7:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c7", program7);
                startActivity(i);
                break;
            case R.id.button8:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c8", program8);
                startActivity(i);
                break;
            case R.id.button9:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c9", program9);
                startActivity(i);
                break;
            case R.id.button10:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c10", program10);
                startActivity(i);
                break;
            case R.id.button11:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c11", program11);
                startActivity(i);
                break;
            case R.id.button12:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c12", program12);
                startActivity(i);
                break;
            case R.id.button13:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c13", program13);
                startActivity(i);
                break;
            case R.id.button14:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c14", program14);
                startActivity(i);
                break;
            case R.id.button15:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c15", program15);
                startActivity(i);
                break;
            case R.id.button16:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c16", program16);
                startActivity(i);
                break;
            case R.id.button17:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c17", program17);
                startActivity(i);
                break;
            case R.id.button18:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c18", program18);
                startActivity(i);
                break;
            case R.id.button19:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c19", program19);
                startActivity(i);
                break;
            case R.id.button20:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c20", program20);
                startActivity(i);
                break;
            case R.id.button21:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c21", program21);
                startActivity(i);
                break;
            case R.id.button22:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c22", program22);
                startActivity(i);
                break;
            case R.id.button23:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c23", program23);
                startActivity(i);
                break;
            case R.id.button24:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c24", program24);
                startActivity(i);
                break;
            case R.id.button25:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c25", program25);
                startActivity(i);
                break;
            case R.id.button26:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c26", program26);
                startActivity(i);
                break;
            case R.id.button27:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c27", program27);
                startActivity(i);
                break;
            case R.id.button28:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c28", program28);
                startActivity(i);
                break;
            case R.id.button29:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c29", program29);
                startActivity(i);
                break;
            case R.id.button30:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c30", program30);
                startActivity(i);
                break;
            case R.id.button31:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c31", program31);
                startActivity(i);
                break;
            case R.id.button32:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c32", program32);
                startActivity(i);
                break;
            case R.id.button33:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c33", program33);
                startActivity(i);
                break;
            case R.id.button34:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c34", program34);
                startActivity(i);
                break;
            case R.id.button35:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c35", program35);
                startActivity(i);
                break;
            case R.id.button36:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c36", program36);
                startActivity(i);
                break;
            case R.id.button37:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c37", program37);
                startActivity(i);
                break;
            case R.id.button38:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c38", program38);
                startActivity(i);
                break;
            case R.id.button39:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c39", program39);
                startActivity(i);
                break;
            case R.id.button40:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c40", program40);
                startActivity(i);
                break;
            case R.id.button41:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c41", program41);
                startActivity(i);
                break;
            case R.id.button42:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c42", program42);
                startActivity(i);
                break;
            case R.id.button43:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c43", program43);
                startActivity(i);
                break;
            case R.id.button44:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c44", program44);
                startActivity(i);
                break;
            case R.id.button45:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c45", program45);
                startActivity(i);
                break;
            case R.id.button46:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c46", program46);
                startActivity(i);
                break;
            case R.id.button47:
                i = new Intent(this.getActivity(),Programs.class); i.putExtra("c47", program47);
                startActivity(i);
                break;
            case R.id.button48:
                    i = new Intent(this.getActivity(),Programs.class); i.putExtra("c48", program48);
                    startActivity(i);
                    break;



        }

    }
}

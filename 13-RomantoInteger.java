class Solution {
    
	    public static int romanToInt(String s) {
        char currentChar;
        char aux;
        int subtraction = 0;
        int sum = 0;
        int total = 0;
        int k = 0;
        
        while(k < s.length()){
            currentChar = s.charAt(k);
            if(currentChar == 'I'){
                if(k+1 <s.length()){
                    aux = s.charAt(k+1);
                    if(aux == 'V'){
                        sum = 4;
                        k += 2;
                    }
                    else if (aux == 'X'){
                        sum = 9;
                        k += 2;
                    }
                    else{
                        sum = 1;
                        k++;
                    }
                }
                else{
                    sum = getValue(currentChar);
                        k++;
                }
            }
            else if(currentChar == 'X'){
                if(k+1 <s.length()){
                    aux = s.charAt(k+1);
                    if(aux == 'L'){
                        sum = 40;
                        k += 2;
                    }
                    else if (aux == 'C'){
                        sum = 90;
                        k += 2;
                    }
                    else{
                        sum = getValue(currentChar);
                        k++;
                    }
                }
                 else{
                    sum = getValue(currentChar);
                        k++;
                }
            }
                        else if(currentChar == 'C'){
                if(k+1 <s.length()){
                    aux = s.charAt(k+1);
                    if(aux == 'D'){
                        sum = 400;
                        k += 2;
                    }
                    else if (aux == 'M'){
                        sum = 900;
                        k += 2;
                    }
                    else{
                        sum = getValue(currentChar);
                        k++;
                    }
                }
                else{
                    sum = getValue(currentChar);
                        k++;
                }
            }
            else{
                sum = getValue(currentChar);
                k++;
            }
            
            total += sum;
        }
        
        return total;
    }

    

    private static int getValue(char letter){
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        
        if(letter == 'I'){
            return I;
        }
         else       if(letter == 'V'){
            return V;
        }
           else     if(letter == 'X'){
            return X;
        }
           else     if(letter == 'L'){
            return L;
        }
                 else       if(letter == 'C'){
            return C;
        }
            else    if(letter == 'D'){
            return D;
        }
             else   if(letter == 'M'){
            return M;
        }
        return 0;
    }
}

// --------------- CLASSE SEM TERNARY OPERATORS --------------------
// class Fibonacci{
//     int calculaFibonacci(int i){
//         if(i<=1){return i;}
//         else{
//             return i = calculaFibonacci(i-2) + calculaFibonacci(i-1) ;
//         }   
//     }
// }

class Fibonacci{
    int calculaFibonacci(int i){
        return i = i<=1 ? i : calculaFibonacci(i-2) + calculaFibonacci(i-1) ;
    }   
}

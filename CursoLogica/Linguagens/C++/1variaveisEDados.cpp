#include <iostream>  // inclui a biblioteca iostream que é a biblioteca padrão de entrada e saída do c++
#include <string>    // biblioteca que permite a criação de strings sem utilizar vetores de chars
#include <iomanip>   //

using namespace std; // retira a necessidade de especificar de qual biblioteca um comando está vindo, por exemplo ao invés de escrever [std::cout << "enfgjdh";], utilizamos cout [<< "ghjfkdhsl"]

int main() {

    int idade = 22;
    double salario = 5800.5, altura = 1.69; // embora não seja recomendado , assim como em C, em c++ nós também podemos dar valores as variaveis ao mesmo tempo que nomeamos seus tipos
    char genero = 'F';                      // tal qual em C, ao nomear chars, utilizamos aspas simples ('') e ao nomear strings utilizamos aspas duplas ("")
    string nome = "Maria Silva";            // graças a biblioteca string podemos nomear strings sem utilizar vetores de chars desta forma
    bool adulto = true;                     // além disso, aqui nós também temos um tipo separado para booleans, que são definipor pelo termo bool

    cout << "Hello World!\n\n=============\n\n" << endl;        // c out imprime no terminal a string referenciada, enquanto endl quebra e finaliza a linha

    cout << fixed << setprecision(2);       // agora sempre que utilizarmos o comando cout para imprimir um float no terminal, o float terá uma precisão de 2 casas decimais
    cout << "IDADE = " << idade << endl;
    cout << "SALARIO = " << salario << endl;// em C++ não utilizamos placeholders para inserir variáveis, nós só identificamos qual variável imprimir e fim de história
    cout << "ALTURA = " << altura << endl;
    cout << "GENERO = " << genero << endl;
    cout << "NOME = " << nome << endl;
    cout << "E ADULTO? " << adulto << endl; // entretanto, valores boolean ainda são armazenados como 0's e 1's, então o tipo apenas facilita a leitura do código
    return 0;
}

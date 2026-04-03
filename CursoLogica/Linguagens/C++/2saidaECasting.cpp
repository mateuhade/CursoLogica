#include <iostream>
#include <iomanip> // caso deseje, pode-se carregar a biblioteca <bits/stdc++.h> que carrega a maioria das bibliotecas padrão de C++, mas isso não é recomendado por acabar carregando
#include <string>  // bibliotecas que nunca serão utilizadas no seu programa

using namespace std;

int main() {

    int idade;
    double salario, altura;
    char genero;
    string nome;
    bool adulto;

    idade = 22;
    salario = 5800.5;
    altura = 1.69;
    genero = 'F';
    nome = "Maria Silva";
    adulto = true;
                                                 // o setprecision() define a precisão dos floats que serão utilizados daqui para frente, caso não seja usado, sempre que usar um float em um
    cout << fixed << setprecision(2);            // comando std, ele terá exatamente o número de casas decimais declarados na variável
    cout << "IDADE = " << idade << endl;         // como visto anteriormente, o endl pode ser utilizdo para quebrar uma linha e identificar o final do cout
    cout << "SALARIO = " << salario << "\n";     // mas em casos específicos, esse uso pode causar na diminuição de eficiência do programa, então de forma geral é mais seguro usar \n
    cout << "ALTURA = " << altura << "\n";
    cout << "GENERO = " << genero << "\n";
    cout << "NOME = " << nome << "\n";
    cout << "E ADULTO? " << adulto << "\n\n";

    cout << "A funcionaria " << nome << ", sexo " << genero << ", tem "
         << idade << " anos, e um salario de RS" << salario << "\n\n";

    // ===================================================================

    int x, y
    double resultado;
    x = 5                                        // os operadores aritméticos e comparativos de c++ são iguais aos de C
    y = 2
    resultado = (double) x / y                   // assim como no C, caso todos os valores aritméticos de uma equação cujo resultado é um float forem ints, será feito o casting automático do
    cout << resultado << "\n"                    // resultado para int, para evitar essa perca de informações, utilizamos o casting dos valores da equação ((double), (int) etc.)

    return 0;
}

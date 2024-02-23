Exercício1.kt
    Faça um programa que receba a média de um aluno e imprima o seguinte:
        Caso a média seja < 5 imprima "REP";
        Caso a média seja >= 5 e < 7 imprima "REC";
        Caso a média seja >7 imprima "APR".

Exercício2.kt
    Geronimo acredita que perde muito tempo lembrando qual número do mês
    representa cada um deles. Ele precisa de um programa que mude os meses
    do ano do calendário do celular dele para facilitar e agilizar a leitura.
    Ajude-o e faça um programa que, com uma determinada entrada de uma data,
    retorne essa data com o mês escrito por extenso.

Exercício3.kt
    Os algarismos romanos são representados por sete símbolos diferentes:
    I, V, X, L, C, D e M. Cada um com seu respectivo valor:

    I : 1
    V : 5
    X : 10
    L : 50
    C : 100
    D : 500
    M : 1000

    Eles são geralmente escritos do maior para o menor.
    Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.
    Você deverá imprimir o numeral romano convertido para um número inteiro.

Exercício4.kt
    Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
    Para realizar o calculo, primeiro receba o valor do salário bruto (valorSalario) e adicional
    dos benefícios (valorBeneficios). Por fim, o salário a ser transferido é calculado
    da seguinte maneira:

        (valorSalario - valorImpostos) + valorBeneficios

    Para calcular o valorImpostos, seguem as aliquotas (baseadas no valor do salário bruto):

        De R$ 0.00 a R$ 1100.00 = 5.00%
        De R$ 1100.01 a R$ 2500.00 = 10.00%
        Maior que R$ 2500.00 = 15.00%

Exercício5.kt
    Desenvolver um programa que determine em quantos anos a população do país A ultrapassará
    ou igualará a população do país B. Para isso, considere as seguintes informações:

        População Inicial: País A tem N habitantes e País B tem M habitantes, onde N
            é sempre menor que M.
        Taxas de Crescimento Anual: País A cresce a uma taxa de 3% ao ano, enquanto
            País B cresce a uma taxa de 1.5% ao ano.
        Cálculo Requerido: O programa deve calcular o número de anos necessários para
            que a população de A seja igual ou maior que a de B, considerando as taxas
            de crescimento contínuas.

    Observação: As taxas de crescimento devem ser aplicadas anualmente a partir das populações iniciais.

Exercício6.kt
    Crie uma classe User com os seguintes atributos: id (inteiro) e name (string).
    Implemente uma classe UserManager que siga o padrão Singleton. Esta classe deve
    possuir as seguintes funcionalidades:
        a. Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
        b. Listar todos os usuários cadastrados.
    No programa principal (main), siga as etapas abaixo:
        a. Solicite ao usuário a quantidade de usuários que deseja cadastrar.
        b. Peça ao usuário para informar os nomes dos usuários, um por linha.
        c. Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.

Exercício7.kt
    Neste desafio, buscando soluções para um problema de negócios em uma plataforma de
    e-commerce, é necessário melhorar a forma como os pedidos personalizados são tratados.
    Você tem a opção de implementar a solução utilizando o padrão Builder para criar pedidos
    de forma mais eficiente e organizada, ou seguir uma abordagem alternativa sem a necessidade
    de utilizar o padrão Builder.

    Detalhamento da tarefa:

        Capture o nome do cliente.
        Solicite ao usuário a quantidade de produtos que deseja adicionar ao pedido.
        Para cada produto, capture o nome, preço e quantidade.
        Capture o endereço de entrega.
        Calcule o total do pedido somando o preço de cada produto multiplicado pela quantidade.
        Imprima os detalhes do pedido, incluindo os produtos, seus preços, quantidades, total a
        pagar e endereço de entrega.

Exercício8.kt
    Neste desafio, você deverá implementar um conversor de moedas que permitirá que valores
    monetários sejam convertidos de dólares americanos (USD) para euros (EUR). Embora exista
    uma taxa de conversão direta de 1 USD = 0.85 EUR, o nosso sistema inicialmente só suportava
    a conversão de USD para libras esterlinas (GBP). Utilizando o padrão Adapter, você deve
    adaptar esse sistema antigo para fornecer a nova funcionalidade de conversão direta para
    EUR, usando a conversão intermediária para GBP.

        Taxa de conversão direta (para referência):
        1 USD = 0.85 EUR

        Taxas de conversão para a adaptação:
        1 USD para GBP = 0.80
        1 GBP para EUR = 1.0625

Exercício9.kt:
    Neste desafio, com foco em um sistema de gerenciamento de livros para uma biblioteca
    digital, você deve implementar uma solução que permita gerar um "slug" único para
    representar os dados de um livro. Um "slug" é uma versão simplificada e amigável para
    URLs de um texto, com espaços substituídos por traços (-) e caracteres especiais removidos.
    A solução requer que você crie uma função de extensão generateSlug() para a classe String
    que fará essa transformação.

    Funcionalidade a ser implementada:

        generateSlug(): Crie uma função de extensão chamada generateSlug() para a classe String.
        A função deve gerar um "slug" para a string fornecida, removendo espaços e caracteres
        especiais, substituindo-os por traços.

Exercício10.kt:
    No mundo da programação, frequentemente enfrentamos situações onde múltiplas tarefas
    precisam ser executadas simultaneamente para otimizar o tempo de resposta ou processamento.
    Um exemplo comum é o download de múltiplos arquivos da internet.

    Para este desafio, suponha que você tenha uma lista de URLs que deseja "baixar".
    Seu objetivo é simular o download desses arquivos de forma paralela e imprimir o
    tamanho de cada URL após seu "download" ter sido disparado. Para simplificar, cada
    URL leva exatamente 1 segundo para ser "baixado".

    Requisitos:

        1- Defina uma lista de URLs que você deseja "baixar".
        2- Crie uma função para simular o "download" de uma URL. Essa função deve aceitar uma URL
            como entrada e retornar o tamanho da URL.
        3- Implemente uma lógica que permita iniciar o "download" de várias URLs em paralelo.
        4- Imprima o tamanho de cada URL na ordem em que foram inseridas.

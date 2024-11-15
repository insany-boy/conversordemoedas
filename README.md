# 💱 Conversor de Moedas

Este é um **conversor de moedas** simples, desenvolvido em **Java** com a interface gráfica utilizando o **Swing**. O projeto oferece uma ferramenta prática para converter valores entre diversas moedas de forma rápida e fácil.

## 🚀 Funcionalidades

- Conversão entre várias moedas internacionais.
- Interface gráfica amigável com **ComboBoxes** para selecionar as moedas de origem e destino.
- Exibição do valor convertido na própria interface.
- Validação de entrada para garantir que o valor inserido seja válido.
- **Suporte a múltiplas moedas**, incluindo **USD**, **EUR**, **BRL**, **GBP**, **JPY**, **CHF**, entre outras.

## 🌍 Moedas Suportadas

O conversor permite a conversão entre as seguintes moedas:

- **USD** (Dólar Americano) 💵
- **EUR** (Euro) 💶
- **BRL** (Real Brasileiro) 🇧🇷
- **GBP** (Libra Esterlina) 💷
- **JPY** (Iene Japonês) 💴
- **CHF** (Franco Suíço) 🇨🇭
- **CAD** (Dólar Canadense) 🇨🇦
- **AUD** (Dólar Australiano) 🇦🇺
- **NZD** (Dólar Neozelandês) 🇳🇿
- **MXN** (Peso Mexicano) 🇲🇽
- **INR** (Rupia Indiana) 🇮🇳
- **CNY** (Yuan Chinês) 🇨🇳

## 💻 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Swing**: Framework para a criação da interface gráfica.
- **NetBeans**: IDE usada para o desenvolvimento.

## 🛠 Como Usar

1. **Clone o repositório**:
   Para começar, clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/insany-boy/conversordemoedas.git

   ## 🛠 Como Usar

2. **Importe o projeto no NetBeans**:
   Abra o NetBeans e vá até **File > Open Project**, então selecione a pasta do projeto clonado.

3. **Execute o projeto**:
   Após a importação, clique com o botão direito do mouse no projeto na árvore de arquivos do NetBeans e selecione **Run**. A interface gráfica será aberta.

4. **Use o Conversor de Moedas**:
   - Insira o valor a ser convertido.
   - Escolha as moedas de origem e destino nos menus suspensos.
   - Clique no botão **Converter** para obter o resultado da conversão.

## 🔄 Como Funciona

- **Entrada**: O usuário insere o valor numérico no campo **"Digite o valor"**.
- **Seleção das Moedas**: O usuário escolhe a moeda de origem e destino nas listas suspensas.
- **Conversão**: Após selecionar as moedas e inserir o valor, o usuário clica no botão **"Converter"**.
- **Resultado**: O valor convertido será exibido no campo de **Resultado**, com a moeda de destino.

## 💡 Exemplo

Se você deseja converter 100 USD (Dólares Americanos) para BRL (Reais):

1. Insira **100** no campo **"Digite o valor"**.
2. Selecione **USD** em **"Moeda de Origem"**.
3. Selecione **BRL** em **"Moeda de Destino"**.
4. Clique em **Converter**.
   
O resultado pode ser algo como: **550,00 BRL** (dependendo da taxa de câmbio atual).

## ⚙️ Como Funciona o Código

O código usa taxas de conversão fixas entre as moedas selecionadas. Por exemplo, se você estiver convertendo de **USD** (Dólar Americano) para **BRL** (Real Brasileiro), o valor inserido será multiplicado pela taxa de conversão **5.50**. Aqui estão algumas taxas que o sistema usa:

- 1 USD = 5.50 BRL
- 1 USD = 0.92 EUR
- 1 EUR = 6.00 BRL
- 1 BRL = 0.18 USD
- 1 EUR = 1.09 USD

E muito mais...

Essas taxas podem ser ajustadas ou substituídas por APIs de câmbio ao integrar o projeto com fontes externas de dados.

## 📝 Contribuindo

Se você deseja contribuir com melhorias ou relatar um erro, fique à vontade para fazer um **Fork** do repositório e enviar um **Pull Request**.

1. Faça um **Fork** do repositório.
2. Crie uma nova **branch** para sua feature:
   ```bash
   git checkout -b minha-branch 
3. Realize as mudanças e faça o **commit**:
   ```bash
   git commit -am 'Adiciona uma nova feature'
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-branch
5. Abra um **Pull request** para a branch principal
    


  


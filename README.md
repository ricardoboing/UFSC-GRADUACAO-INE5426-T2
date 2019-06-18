# Trabalho Prático II - 2019.1

## 1. Instalação do ANTLR e java:
* 1.1. É necessário instalar java. Pode ser obtido em <https://www.java.com/>
* 1.2. Para baixar o ANTLR deve-se executar as seguintes linhas de comando no terminal do Ubuntu (ou usar o arquivo jar presente na pasta **Codigo** do projeto):</br>
cd /usr/local/lib</br>
sudo wget https://www.antlr.org/download/antlr-4.7.2-complete.jar</br>

## 2. Pré-execução
* 2.1. A cada vez que for aberto uma nova aba no terminal é preciso que sejam executados dois comandos:</br>
export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"</br>
alias grun='java org.antlr.v4.gui.TestRig'</br>


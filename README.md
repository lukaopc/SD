# Prática de Laboratório 2
GCC129 - Sistema Distribuídos

**Objetivo**

Implementar um serviço correio eletrônico (email). O serviço deve ser implementado como um sistema cliente-servidor utilizando-se a tecnologia Java RMI.

Cada equipe deve apresentar o trabalho para o professor durante o horário da aula prática no dia 23/06/2016. Todos os membros da equipe devem estar presentes.

Além disso, é preciso submeter o código fonte no Moodle. Basta uma submissão por equipe (devese incluir os nomes dos membros da equipe na forma de comentário no código fonte).

**Descrição Geral**

Utilize a interface Correio para implementação do sistema. O servidor mantém uma base de dados com os dados dos usuários e também as mensagens enviadas para cada usuário. Essa base de dados pode ser uma estrutura de dados na memória. Não é necessário armazenar os dados de forma persistente.

O servidor deve implementar as seguintes funcionalidades: 
- Cadastrar um usuário;
- Fazer autenticação do usuário no sistema;
- Enviar uma mensagem para um usuário;
- Permitir a um usuário recuperar suas mensagens do servidor.

O usuário deve ser identificado pelo seu “nome de usuário”. O cliente dever permitir a um usuário se cadastrar no servidor, assim como usar este servidor para enviar e receber mensagens. Além disso, o cliente deve ser responsável pela autenticação do usuário. Ou seja, o cliente não deve habilitar para o usuário o envio ou o recebimento de uma mensagem sem antes usar o servidor para autenticar o usuário.

O servidor armazena as mensagens para cada usuário até que o usuário recupere cada mensagem. Ou seja, uma vez que o usuário recuperou uma mensagem do servidor, a mensagem pode ser apagada. 

Utilize uma fila (FIFO) para armazenar as mensagens de cada usuário. A classe especifica no link a seguir pode ser usada para implementar a fila de mensagens. 

http://docs.oracle.com/javase/1.5.0/docs/api/java/util/LinkedList.html

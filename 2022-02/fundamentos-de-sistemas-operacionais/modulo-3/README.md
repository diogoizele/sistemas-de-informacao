# Módulo 03 - Sincronização de Processos

O compartilhamento de recursos entre processos pode gerar situações indesejáveis. Sendo assim, faz-se necessário o uso de mecanismos de sincronização que garantem a comunicação entre processos concorrentes e o acesso a recursos compartilhados ocorra de forma correta.

### Deadlocks ☠

Um `deadlock` caracteriza uma situação em que ocorre um impasse, onde dois ou mais processos ficam impedidos de continuar suas execuções, ou seja, ficam bloqueados.

Um processo _(A)_ aguarda a liberação de um recurso que está sendo utilizado por outro processo _(B)_, que, por sua vez, aguarda a liberação de outro recurso alocado ou dependente do primeiro processo _(A)_.

![Homem aranha -  meme clássico](https://cdn.dicionariopopular.com/imagens/homem-aranha-meme-apontando-1-0.jpg)

# Módulo 03 - Sincronização de Processos

Neste módulo estudaremos porque processos precisam sincronizar suas ações quando compartilham memória, 
especificamente. 

A implementação de threads em diversos cenários demanda que ações sejam coordenadas, já que em diversas
situações não é desejável que mais de uma thread acesse um recurso por vez. Imagine como seria se ao 
compartilhar um arquivo, uma thread devesse ler deste arquivo, e outra thread devesse escrever nesse 
mesmo arquivo. Como garantir que a thread leitora está apresentando o conteúdo atualizado?
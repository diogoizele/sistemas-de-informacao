# Módulo 04 - Argumentos quantificados

Nesse módulo, serão abordados os conceitos de argumento válido e o método de dedução natural, focando nas regras de dedução da Lógica de Predicados, regras de introdução e eliminação dos quantificadores Universal e Existencial.

Para provar que um argumento é válido, temos que partir de hipóteses e chegar na conclusão aplicando o método de dedução natural (regras de inferência básicas e derivadas, regras de equivalência).

### Argumento quantificado 1

**Vídeo aula** | [Simbolização de sentenças quantificadas](https://www.youtube.com/watch?v=EI2MbHFDD4o)

#### Demonstração

"Obi Wan Kenobi **é um** jedi e Darth Vader **é um** Sith. **Nenhum** jedi depende do lado negro da força. **Todos** os Sith dependem do lado negro da força. **Portanto**, **alguém** depende do lado negro da força e **Obi Wan Kenobi** **não** depende do lado negro da força."

#### Notação

- J(x) = x é um jedi;
- S(x) = x é um sith;
- D(x) para x depende do lado negro da força;
- o para Obi Wan Kenobi;
- d para Darth Vader.

#### Desenvolvimento

1º passo: **Obi Wan Kenobi é um jedi e Darth Vader é um Sith**.

- J(o) ∧ S(d)

2º passo: **Nenhum jedi depende do lado negro da força**.

- J(o) ∧ S(d), ∀x(J(x) → ¬D(x))

> 🚨 Lembre-se, a ","separa as premissas.
> 💡 ∀x significa "para todo x", sendo considerado um quantificador universal (todos ou nenhum).

3º passo: **Todos os Sith dependem do lado negro da força**.

- J(o) ∧ S(d), ∀x(J(x) → ¬D(x)), ∀x(S(x) → D(x))

4º passo: **Portanto**.

- J(o) ∧ S(d), ∀x(J(x) → ¬D(x)), ∀x(S(x) → D(x)) ⊢

> 🚨 Lembre-se, o ⊢ significa "portanto", concluindo o argumento.

5º passo: **alguém depende do lado negro da força e Obi Wan Kenobi não depende do lado negro da força**.

- J(o) ∧ S(d), ∀x(J(x) → ¬D(x)), ∀x(S(x) → D(x)) ⊢ ∃x(D(x) ∧ ¬D(o))

### Argumento quantificado 2

**Vídeo aula** | [Simbolização de sentenças quantificadas](https://www.youtube.com/watch?v=yiGaej9X2A0)

#### Demonstração

"**Todos** os membros do conselho vêm da indústria **ou** do governo. **Todos** que vêm do governo **são** advogados **são** a favor da moção. **João** **não** vem da indústria **mas** **é** advogado. **Portanto**, se João **é** um membro do conselho, ele **é** a favor da moçao"

#### Notação

- M(x) = x é um membro do conselho;
- I(x) = x vem da indústria;
- G(x) = x vem do governo;
- A(x) = x é advogado;
- F(x) = x é a favor da moção;
- j para João.

#### Desenvolvimento

1º passo: **Todos os membros do conselho vêm da indústria ou do governo**.

- ∀x(M(x) → (I(x) ∨ G(x)))

2º passo: **Todos que vêm do governo e são advogados são a favor da moção**.

- ∀x(M(x) → (I(x) ∨ G(x))), ∀x(G(x) ∧ A(x) → F(x))

> 🚨 Lembre-se, a ","separa as premissas.
> 💡 ∀x significa "para todo x", sendo considerado um quantificador universal (todos ou nenhum).

3º passo: **João não vem da indústria mas é advogado**.

- ∀x(M(x) → (I(x) ∨ G(x))), ∀x(G(x) ∧ A(x) → F(x)), ¬I(j) ∧ A(j)

4º passo: **Portanto**.

- ∀x(M(x) → (I(x) ∨ G(x))), ∀x(G(x) ∧ A(x) → F(x)), ¬I(j) ∧ A(j) ⊢

> 🚨 Lembre-se, o ⊢ significa "portanto", concluindo o argumento.

5º passo: **se João é um membro do conselho, ele é a favor da moção**.

- ∀x(M(x) → (I(x) ∨ G(x))), ∀x(G(x) ∧ A(x) → F(x)), ¬I(j) ∧ A(j) ⊢ M(j) → F(j)

## Regras dos quantificadores

- **Vídeo aula** | [Regras dos quantificadores - Exemplo 1](https://www.youtube.com/watch?v=_cdC4hZ4gqU)
- **Vídeo aula** | [Regras dos quantificadores - Exemplo 2](https://www.youtube.com/watch?v=9pHxz_xvCiE)
- **Vídeo aula** | [Regras dos quantificadores - Exemplo 3](https://www.youtube.com/watch?v=iVaE6_nswfg)
- **Vídeo aula** | [Regras dos quantificadores - Exemplo 4](https://www.youtube.com/watch?v=oFxZcD25Sy4)

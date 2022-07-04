drop table aluno_disciplina;
drop table disciplina;
drop table professor;
drop table aluno;
create table professor
(
   codigo   number,
   nome     varchar2(120) not null,
   email    varchar2(50) not null,
   telefone varchar2(20),
   constraint professor_pk primary key (codigo)
);
create table aluno
(
   matricula number,
   nome varchar2(200),
   sexo char(1),
   data_nascimento date,
   constraint aluno_pk primary key (matricula),
   constraint aluno_ck1 check (sexo in ('M','F','I'))
);
create table disciplina
(
    codigo number, 
    sigla char(3),
    descricao varchar2(200),
    professor number,
    constraint disciplina_pk primary key (codigo, sigla),
    constraint disciplina_uq unique (descricao),
    constraint disciplina_fk1 foreign key (professor) references professor(codigo)
);
create table aluno_disciplina
(
    matricula_aluno number,
    codigo_disciplina number,
    sigla_disciplina char(3),
    constraint aluno_disciplina_fk1
        foreign key (matricula_aluno)
        references aluno(matricula),
    constraint aluno_disciplina_fk2
        foreign key (codigo_disciplina, sigla_disciplina)
        references disciplina(codigo, sigla)
);
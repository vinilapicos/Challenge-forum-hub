create table cursos(
    id bigint auto_increment primary key,
    nome varchar(100) not null,
    categoria varchar(100) not null
);

create table usuarios(
    id bigint auto_increment primary key,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    senha varchar(100) not null
);

create table topicos(
    id bigint auto_increment primary key,
    titulo varchar(255) not null unique,
    mensagem text not null,
    data_criacao datetime not null,
    status varchar(100) not null,
    autor_id bigint not null,
    curso_id bigint not null,

    constraint fk_topicos_autor_id foreign key (autor_id) references usuarios(id),
    constraint fk_topicos_curso_id foreign key (curso_id) references cursos(id)
);

create table respostas(
    id bigint auto_increment primary key,
    mensagem text not null,
    data_criacao datetime not null,
    solucao tinyint(1) not null default 0,
    topico_id bigint not null,
    autor_id bigint not null,

    constraint fk_respostas_topico_id foreign key (topico_id) references topicos(id),
    constraint fk_respostas_autor_id foreign key (autor_id) references usuarios(id)
);
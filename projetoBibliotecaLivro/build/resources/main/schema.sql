drop table if exists livro;

create table livro(
    id_livro bigint auto_increment,
    titulo varchar(100) not null,
    autor varchar(100) not null,
    valor double not null,
    primary key (id_livro)
    );
package Landarin.Francis.projetoBibliotecaLivro.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component //type

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - java persistence API
@Entity
@Table(name="livro")

public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livro")
    private long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "valor")
    private double valor;

}


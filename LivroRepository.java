package Landarin.Francis.projetoBibliotecaLivro.repository;

import Landarin.Francis.projetoBibliotecaLivro.model.LivroEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<LivroEntity, Long> {


}

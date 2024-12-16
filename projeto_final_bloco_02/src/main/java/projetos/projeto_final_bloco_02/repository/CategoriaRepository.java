package projetos.projeto_final_bloco_02.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import projetos.projeto_final_bloco_02.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

		public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}

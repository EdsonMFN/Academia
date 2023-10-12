package api.workout.domains.repositorys;

import api.workout.domains.entitys.aluno.Aluno;
import api.workout.domains.entitys.fichaDeTreino.FichaDeTreino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryFichaDeTreino extends JpaRepository<FichaDeTreino,Long> {

    List<FichaDeTreino> findByAluno(Aluno aluno);

}

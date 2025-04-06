package indiana.indi.indiana.repository;

import indiana.indi.indiana.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Game, Long> {
}

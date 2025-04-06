package indiana.indi.indiana.service;

import indiana.indi.indiana.entity.Comment;
import indiana.indi.indiana.entity.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {

    Iterable<Game> findAllGames(String filter);

    Game createGame(String title, String details, String pageUrl, List<Long> categoryId, List<Comment> comments);

    Optional<Game> findGame(Long gameId);

    void updateGame(
            Long id, String title, String details, String pageUrl, List<Long> categoryId, List<Comment> comments
    );

    void deleteGame(Long id);
}

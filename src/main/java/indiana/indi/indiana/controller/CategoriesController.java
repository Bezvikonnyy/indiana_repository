package indiana.indi.indiana.controller;

import indiana.indi.indiana.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("categories/game")
public class GameController {

    private final GameService gameService;
}

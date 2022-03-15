package com.example.lottery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @GetMapping
    public List<Integer> getGames() {
        return List.of(4, 7, 17, 54, 23, 58);
    }


    @GetMapping("/tip")
    public List<Integer> getTip() {
        return List.of(4, 7, 17, 54, 23, 58);
    }
}

package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FLowerController {
    private final FlowerService flowerService;

@Autowired
    public FLowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/list/")
    public List<Flower> hello() {
        return flowerService.getFlowers();
    }

    @PostMapping("/add/")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}

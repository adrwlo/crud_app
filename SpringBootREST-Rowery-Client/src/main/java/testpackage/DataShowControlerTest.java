/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author adrwl
 */
@Controller
public class DataShowControlerTest {
    private static final List<Rezerwacja> rezerwacje = new ArrayList<Rezerwacja>();
    static {
        rezerwacje.add(new Rezerwacja(1, "Adrian", "Włodarski", "592 145 902", "2022/05/25 16:50", "Górski"));
        rezerwacje.add(new Rezerwacja(2, "Bartek", "Ptasik", "564 132 245", "2022/05/25 6:50", "Górski"));
        rezerwacje.add(new Rezerwacja(3, "Mateusz", "Wójick", "752 164 242", "2022/05/25 18:50", "Szosowy"));
    }
    
    @GetMapping({"/showRezerwacje"})
    public String showRezerwacje(Model model) {
        model.addAttribute("rezerwacje", rezerwacje);
        return "showRezerwacje";
    }
    
}

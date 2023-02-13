package _1.dataclientcrud;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class DataCRUDCTRL {
    
  
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }     
       
    Rezerwacja[] rezerwacje;
    
    @GetMapping ({"/crudRezerwacje"})
    public String showRezerwacje(Model model){
        RestTemplate restTemplate = new RestTemplate();
        String URL_REZERWACJE = "http://localhost:8081/rezerwacje";
        rezerwacje = restTemplate.getForObject(URL_REZERWACJE, Rezerwacja[].class);
        model.addAttribute("rezerwacje", rezerwacje);
        return "crudRezerwacje";
    }
      
    @GetMapping ({"/dodajRezerwacjaForm"})
    public String showAddRezerwacjePage(Model model){
        Rezerwacja rezerwacja = new Rezerwacja();
        model.addAttribute("rezerwacja", rezerwacja);
        return "addRezerwacja";
    }
    
    @PostMapping({"/dodajRezerwacja"})
    public String saveRezerwacja(Model model,
            @ModelAttribute("rezerwacja") Rezerwacja rezerwacja){
      
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        Map map = new HashMap<String, String>();
        map.put("Content-Type", "application/json");
        headers.setAll(map);
        HttpEntity<?> request = new HttpEntity<>(rezerwacja, headers);
        String url = "http://localhost:8081/rezerwacja/dodaj";
        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
        System.out.println(response.toString());
        
        return "redirect:/crudRezerwacje";         
    }
    @GetMapping("/usunRezerwacja/{id}")
    public String deleteRezerwacja(@PathVariable("id") int id, Model model){
        String url = "http://localhost:8081/rezerwacja/usun/"+id;
        new RestTemplate().delete(url);
        return "redirect:/crudRezerwacje";
        
    } 
    @GetMapping("/edytujRezerwacjaForm/{id}")
    public String editRezerwacja(@PathVariable("id") int id, Model model){
        
        Rezerwacja rezerwacja = null;
        for(Rezerwacja r : rezerwacje){
            System.out.println(r.getId()+"  "+id);
            if(r.getId() == id)
                rezerwacja=r;
        }
        model.addAttribute("rezerwacja", rezerwacja);
        return "editRezerwacja";
               
    }
    @PostMapping({"/edytujRezerwacja"})
    public String editRezerwacja(Model model, 
            @ModelAttribute("rezerwacja") Rezerwacja rezerwacja){
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        Map map = new HashMap<String, String>();
        map.put("Content-Type", "application/json");
        headers.setAll(map);
        HttpEntity<?> request = new HttpEntity<>(rezerwacja,headers);
        String url = "http://localhost:8081/rezerwacja/zmien/"+rezerwacja.getId();
        new RestTemplate().put(url,request,rezerwacje);
            return "redirect:/crudRezerwacje";
    }
}
    
    
    
    
    


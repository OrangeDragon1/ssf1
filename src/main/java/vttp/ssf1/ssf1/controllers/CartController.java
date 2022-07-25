package vttp.ssf1.ssf1.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp.ssf1.ssf1.models.Item;
import vttp.ssf1.ssf1.services.CartService;

@Controller
@RequestMapping(path = "/cartpage")
public class CartController {
    
    @GetMapping(produces = "text/html")
    public String displayCart(Model model) {
        CartService ctSvc = new CartService();
        List<Item> items = ctSvc.getItems();
        model.addAttribute("cart", items);

        return "cartpage";
    }
}

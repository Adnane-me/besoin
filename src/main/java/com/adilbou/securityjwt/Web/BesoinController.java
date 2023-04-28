package com.adilbou.securityjwt.Web;

import com.adilbou.securityjwt.Entities.Besoin;
import com.adilbou.securityjwt.Entities.Imprimante;
import com.adilbou.securityjwt.Entities.Member;
import com.adilbou.securityjwt.Entities.Ordinateur;
import com.adilbou.securityjwt.Repositories.MemberRepository;
import com.adilbou.securityjwt.Repositories.UserRepository;
import com.adilbou.securityjwt.Service.BesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BesoinController {
    //
    private final BesoinService besoinService;
    //
    @Autowired
    UserRepository userRepository;

    public BesoinController(BesoinService besoinService) {
        this.besoinService = besoinService;
    }
    //    @Autowired
//    RoleRepository roleRepository;
//
//
    @Autowired
    MemberRepository membreDepartementRepository;
    //
//    @Autowired
//    BesoinRepository besoinRepository;
//
//
//
//    public BesoinController(BesoinService besoinService) {
//        this.besoinService = besoinService;
//    }
//
////    @GetMapping("")
////    public List<Besoin> getAllBesoins() {
////        return besoinService.getAllBesoins();
////    }
//
//   // @PostMapping("")
//
    @PostMapping("/save")
    @ResponseBody
    Besoin save(Besoin besoin) {
        

        return besoinService.save(besoin);
    }


//
//
}

package Controler;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @PostMapping("/product/")
    public String postproduct() {
        return "product added";
    }

    @GetMapping("/product/")
    public String getproduct() {
        return "these are ur products";
    }

    @GetMapping("/product/{id}")
    public String getproductwithid(@PathVariable("id") Long id) {
        return "these are ur products with id: " + id;
    }

    @DeleteMapping("/product/{id}")
    public String deleteproduct(@PathVariable("id") Long id) {
        return "product deleted with id: " + id;
    }

    @DeleteMapping("/product/")
    public String deleteallproducts() {
        return "all products deleted";
    }

    @PutMapping("/product/{id}")
    public String updateproduct(@PathVariable("id") Long id) {
        return "product updated:" + id;
    }

    @PutMapping("/product/")
    public String updateallproducts() {
        return "all products updated";
    }

    @PatchMapping("/product/{id}")
    public String patchproduct(@PathVariable("id") Long id) {
        return "product patched with id: " + id;
    }

    @RequestMapping(name = "GANI", path = "/product/")
    public String getallproducts() {
        return "all products";
    }
}

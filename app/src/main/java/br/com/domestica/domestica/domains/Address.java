package br.com.domestica.domestica.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {

    private String name;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String cep;

}

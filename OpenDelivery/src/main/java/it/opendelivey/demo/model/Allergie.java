package it.opendelivey.demo.model;




import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Allergie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @NotBlank
    @Size(min = 3, max = 30)
    private String nome;

    @ManyToMany(mappedBy = "allergie", cascade = CascadeType.ALL)
    private Set<Utente> utenti = new HashSet<>();

    public Allergie() {
    }

    public Allergie( String nome) {
        this.nome = nome;
    }

    public Set<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(Set<Utente> utenti) {
        this.utenti = utenti;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addUtente(Utente utente){
        utenti.add(utente);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allergie allergie = (Allergie) o;
        return Objects.equals(id, allergie.id) && Objects.equals(nome, allergie.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
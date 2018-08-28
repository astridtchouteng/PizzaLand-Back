package be.pizzaland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.pizzaland.domain.Categorie;

public interface ICategoriesRepository extends JpaRepository<Categorie, Long> {

}

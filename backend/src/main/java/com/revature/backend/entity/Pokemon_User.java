package com.revature.backend.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "pokemon_user")
public class Pokemon_User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pokemonUserId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "pokemonId")
    private Pokemon pokemon;

    private int amountCaught;
    private Date dateTime; //Constantly polling for this might result in a LOT of sql calls
}

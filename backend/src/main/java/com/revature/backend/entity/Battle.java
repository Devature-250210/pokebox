package com.revature.backend.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "battles")
public class Battle
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int battleId;

    //TODO:Maybe find a way to autogenerate this in the DB on creation.
    private Date date;

    //TODO: Potentially make these many to one relationships.
    //Do we just want to use the full user entity like in project 1?
    //Or simply use the userId to pull the user if we need it?
    //             Thus not needing the many to one relationship.
    private int winnerUserId;
    private int loserUserId;

//    boilerplate ---------------------


    public Battle()
    {
    }

    public Battle(int battleId, Date date, int winnerUserId, int loserUserId)
    {
        this.battleId = battleId;
        this.date = date;
        this.winnerUserId = winnerUserId;
        this.loserUserId = loserUserId;
    }

    public int getBattleId()
    {
        return battleId;
    }

    public void setBattleId(int battleId)
    {
        this.battleId = battleId;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getWinnerUserId()
    {
        return winnerUserId;
    }

    public void setWinnerUserId(int winnerUserId)
    {
        this.winnerUserId = winnerUserId;
    }

    public int getLoserUserId()
    {
        return loserUserId;
    }

    public void setLoserUserId(int loserUserId)
    {
        this.loserUserId = loserUserId;
    }

    @Override
    public String toString()
    {
        return "Battle{" +
                "battleId=" + battleId +
                ", date=" + date +
                ", winnerUserId=" + winnerUserId +
                ", loserUserId=" + loserUserId +
                '}';
    }
}
